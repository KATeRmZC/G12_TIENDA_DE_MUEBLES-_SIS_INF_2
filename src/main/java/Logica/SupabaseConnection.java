/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SupabaseConnection {
    
    private static final String URL = "jdbc:postgresql://aws-0-us-west-1.pooler.supabase.com:5432/postgres";
    private static final String USER = "postgres.evyxcvhqzgimicjtbjpw";
    private static final String PASSWORD = "player88";

    // Método para obtener la conexión
    public static Connection conectar() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
            return null; // Retorna null si hay un error
        }
    }
}

