package org.example.repository;

import org.example.infraestrutura.dataBase.Conexao;
import org.example.model.Livros;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LivroRepository {

    public void inserirLivro(Livros livro)throws SQLException {

        String query = """
                INSERT INTO livros
                (titulo, autor, ano)
                VALUES (?,?,?)
                """;

        try(Connection conn = Conexao.Conectar();
            PreparedStatement stmt = conn.prepareStatement(query)){

            stmt.setString(1, livro.getTitulo());
            stmt.setString(2, livro.getAutor());
            stmt.setInt(3, livro.getAno());
            stmt.executeUpdate();

            System.out.println("+------------------------------------+");
            System.out.println("|       Cadastrado com Sucesso       |");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void atualizarDisponibilidade(){

        String query = """
                UPDATE livros set disponivel = false where id = ?;
                """;
    }
}
