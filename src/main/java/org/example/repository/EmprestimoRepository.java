package org.example.repository;

import org.example.infraestrutura.dataBase.Conexao;
import org.example.model.Emprestimo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

public class EmprestimoRepository {

    public void inserirEmprestimo(Emprestimo emprestimo) throws SQLException {

        String query = """
                INSERT INTO emprestimos
                (livro_id, usuario, data_emprestimo, data_devolucao)
                VALUES (?,?,?,null)
                """;

        try(Connection conn = Conexao.Conectar();
            PreparedStatement stmt = conn.prepareStatement(query)){

            LocalDate hoje = LocalDate.now();
            stmt.setInt(1, emprestimo.getLivro_id());
            stmt.setInt(2,emprestimo.getUsuario_id());
            stmt.setDate(3, Date.valueOf(hoje));
            stmt.executeUpdate();

            System.out.println("|  Emprestimo cadastrado com sucesso  |");
        }
    }
}
