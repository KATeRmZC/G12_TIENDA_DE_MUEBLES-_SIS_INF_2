/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SupabaseSelect {
    public static void mostrarUsuarios() {
        String sql = "SELECT id_mueble, modelo, precio_venta FROM mueble";

         
        try (Connection conn = SupabaseConnection.conectar(); PreparedStatement pstmt = conn.prepareStatement(sql); ResultSet rs = pstmt.executeQuery()) {
//
            // Recorrer los resultados
            while (rs.next()) {
                int id = rs.getInt("id_mueble");
                String modelo = rs.getString("modelo");
                String precio = rs.getString("precio_venta");
                System.out.println("ID: " + id + ", Modelo: " + modelo + ", Precio: " + precio);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }

    public static void main(String[] args) {
        mostrarUsuarios();
    }
}
