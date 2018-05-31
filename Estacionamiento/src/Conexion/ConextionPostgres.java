/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;


import java.sql.*;
/**
 *
 * @author Ramirez-Pc
 */
public class ConextionPostgres {

    public static void main(String[] args) {
        // TODO code application logic here
        String url = "jdbc:postgresql://localhost:5432/EDIFICIO";
        String usuario = "Guardia";
        String contrasenia = "slate";
        try {
            Class.forName("org.postgresql.Driver");
            Connection conexion = DriverManager.getConnection(url, usuario, contrasenia);
            java.sql.Statement st = conexion.createStatement();
            /**
             * PRUEBA DE FUNCIONABILIDAD DE LA BASE DE DATOS CREADA EN POSTGRES
             * 
             *String sql = "SELECT id_edif,nombre_edif,ubicacion  FROM EDIFICIO ";
             *ResultSet result = st.executeQuery(sql);
             *while (result.next()) {
              *String id = result.getString("id_edif");
              *String nombre = result.getString("nombre_edif");
              *String ubicacion = result.getString("ubicacion");
              * System.out.println("ID: " + id + "\n" + "NOMBRE : " + nombre + "\n" + "UbicCCCion : " + ubicacion);
              * }
              * result.close();
              *        
              */
            
           
            st.close();
            conexion.close();

        } catch (Exception e) {
            System.out.println("Error de conexion" + e.getLocalizedMessage());
        }
    }

}
