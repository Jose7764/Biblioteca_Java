package org.example.repository;

import org.example.infraestrutura.dataBase.Conexao;
import org.example.model.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class usuarioRepository {

    public int buscaIDusuario(String nome)throws SQLException {

        String query = """
                SELECT id
                FROM usuarios u
                WHERE ? = u.nome;
                """;

        try(Connection conn = Conexao.Conectar();
            PreparedStatement stmt = conn.prepareStatement(query)){
            stmt.setString(1, nome);

            ResultSet rs = stmt.executeQuery();
            int id;
            if(rs.next()){
                return id = rs.getInt("id");
            }
        }
        return -1;
    }

    public void cadastrarUsuario(Usuario user)throws SQLException{

        String query = """
                INSERT INTO usuarios
                (nome, email)
                VALUES (?,?)
                """;

        try(Connection conn = Conexao.Conectar();
        PreparedStatement stmt = conn.prepareStatement(query)){

            stmt.setString(1, user.getNome());
            stmt.setString(2, user.getEmail());
            stmt.executeUpdate();


            System.out.println("|   Usuario Cadastrado com Sucesso   |");
            System.out.println("|------------------------------------|");

        }
    }
}
