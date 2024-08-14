/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;

import java.sql.DriverManager; 
import java.sql.PreparedStatement;
import java.sql.SQLException; 
import org.postgresql.jdbc.PgConnection;

/**
 *
 * @author lucas
 */
public class Connection {
    
    public static PgConnection conectar(){
        PgConnection conn = null;
        try{
            String url = "jdbc:postgresql://localhost:5432/imobiliaria";
            String user = "postgres";
            String password = "88042860";
            
            conn = (PgConnection) DriverManager.getConnection(url, user, password);
        }catch(SQLException e){
            System.out.print("Erro: " + e.getMessage());
        }
        
        return conn;
    }
    
}