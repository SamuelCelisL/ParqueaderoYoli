/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basededatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Samuel Celis y Yorman Rodriguez
 */
public class conexion {
    
    private static Connection conn;
    private static final String drive = "com.mysql.jdbc.Driver" ;
   
    public conexion(){
        conn = null;
        try{
            
         Class.forName(drive);
         conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pyoli","root","");               
          
         //if(conn!=null){
             //System.out.println("Estoy conectado a la base de datos");
          
        // }
         
         
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Error en la conexion: "+e);
           //JOptionPane.showMessageDialog(null, "EL REGISTRO NO SE PUDO COMPLETAR, PROBLEMAS EN EL SERVIDOR");
        }
        
    
    }
    
    public Connection getConnection(){
        return conn;
    }
    
    public void desconectar(){
        
        conn = null;
        if(conn == null){
            System.out.println("Conexion terminada");
        }
        
    }
}
