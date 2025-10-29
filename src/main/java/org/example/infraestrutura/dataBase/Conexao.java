package org.example.infraestrutura.dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private static String URL = "jdbc:mysql://localhost:3306/Estrutura_System";
    private static String USER = "root";
    private static String PASS = "mysqlPW";

    public static Connection Conectar()throws SQLException{

        return DriverManager.getConnection(URL,USER,PASS);
    }
}
