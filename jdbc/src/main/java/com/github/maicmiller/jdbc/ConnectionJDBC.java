package com.github.maicmiller.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionJDBC {
    public static void main(String[] args) throws SQLException {

        String urlConnection = "jdbc:postgresql:/var/lib/postgresql/data";

        try (Connection conn = DriverManager.getConnection(urlConnection, "admin", "admin")) {
            System.out.println("Conectou com sucesso!");
        } catch (Exception e) {
            System.out.println("Falha ao conectar a base de dados!");
        }
    }
}
