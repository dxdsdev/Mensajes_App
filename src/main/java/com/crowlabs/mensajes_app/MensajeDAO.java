/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crowlabs.mensajes_app;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import lombok.Synchronized;

/**
 *
 * @author croweloper
 */
public class MensajeDAO {

    public static void CreateMessageDB(Mensaje mensaje) {

        Conexion c = new Conexion();
        try (Connection conexion = c.getConnection()) {
            PreparedStatement ps = null;
            try {

                String query = "INSERT INTO `mensajes` (`mensaje`, `autor_mensaje`,`fecha_mensaje`) VALUES (?, ?, current_timestamp());";
                ps = conexion.prepareStatement(query);
                ps.setString(1, mensaje.getMensaje());
                ps.setString(2, mensaje.getAutor_mensaje());
                ps.executeUpdate();

                System.out.println("Mensaje Creado");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    private static DateFormat format = new SimpleDateFormat("dd-MM-YYYY");

    @Synchronized
    public static String synchronizedFormat(Date date) {
        return format.format(date);
    }

    
    
    public static void ReadMessageDB() {

        Conexion c = new Conexion();
        try (Connection conexion = c.getConnection()) {
            PreparedStatement ps = null;
            ResultSet rs = null;

            String query = "SELECT * FROM mensajes;";
            ps = conexion.prepareStatement(query);
            rs= ps.executeQuery();
            
            while (rs.next()) {                
                
                System.out.println("");
                System.out.println("ID      : "+rs.getInt("id"));
                System.out.println("Mensaje : "+rs.getString("mensaje"));
                System.out.println("Autor   : "+rs.getString("autor_mensaje"));
                System.out.println("Fecha   : "+rs.getString("fecha_mensaje"));
                System.out.println("");               
                System.out.println("Fecha1   : "+synchronizedFormat(rs.getDate(4)));
                
                
                
               System.out.println("");               
            }
           
            System.out.println("Fin del listado");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    
    
    
    
    public static void DeleteMessageDB(int id_mensaje) {
        
        Conexion c = new Conexion();
        try (Connection conexion = c.getConnection()) {
            PreparedStatement ps = null;
            try {

                String query = "DELETE FROM mensajes WHERE id = ? ";
                ps = conexion.prepareStatement(query);
                ps.setInt(1, id_mensaje);
                
                ps.executeUpdate();

                System.out.println("Mensaje Eliminado");
                
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void UpdateMessageDB(Mensaje mensaje) {
        
        
        
        Conexion c = new Conexion();
        try (Connection conexion = c.getConnection()) {
            PreparedStatement ps = null;
            try {
                
                
                String query = "UPDATE mensajes SET mensaje = ? , fecha_mensaje = ? WHERE id = ? ";
                ps = conexion.prepareStatement(query);                
                ps.setString(1, mensaje.getMensaje());
                ps.setString(2, synchronizedFormat(new Date()));
                ps.setInt(3, mensaje.getId_mensaje());                
                ps.executeUpdate();

                System.out.println("Mensaje Actualizado");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
