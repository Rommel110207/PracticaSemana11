package com.tuempresa.facturacionn.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionPostgres {

    public static void main(String[] args) {
        // Cambia estos valores por los de tu base de datos
        String url = "jdbc:postgresql://localhost:5432/ejemploBD";
        String usuario = "postgres";
        String contraseña = "tu_password";

        try {
            // Establecer la conexión
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);

            if (conexion != null) {
                System.out.println("¡Conexión exitosa a la base de datos de PostgreSQL!");
                // Aquí puedes ejecutar tus consultas SQL

                // Cerrar la conexión cuando termines
                conexion.close();
            }
        } catch (SQLException e) {
            System.out.println("Ocurrió un error al conectar con la base de datos.");
            e.printStackTrace();
        }
    }
}