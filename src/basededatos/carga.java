/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basededatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Samuel Celis y Yorman Rodriguez
 */
public class carga {

    private ResultSet RS;
    conexion cc = new conexion();
    Connection con = cc.getConnection();
    private PreparedStatement PS;

    public void registrarpersonas(String tipov, String placav, String nombredueño,String telefonodueño, String DIAI, String MESI, String AÑOI) {
      
          String SQL = "INSERT INTO datos1 (TipoVehiculo,PLACA, NOMBRE, TELEFONO,DIAEN, MESEN, AÑOEN) VALUES (?,?,?,?,?,?,?)";

        try {
            PreparedStatement pst = con.prepareStatement(SQL);
            pst.setString(1, tipov);
            pst.setString(2, placav);
            pst.setString(3, nombredueño);
            pst.setString(4, telefonodueño);
            pst.setString(5, DIAI);
            pst.setString(6,MESI);
            pst.setString(7, AÑOI);
          
            pst.executeUpdate();
            //JOptionPane.showMessageDialog(null, "Se inserto con exito");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al insertar en la base" + e.getMessage());
        }

    }
    
    public void registrarinforme(String tipov, String placav, String nombredueño,String telefonodueño, String DIAE ,String MESE, String AÑOE) {
      
          String SQL = "INSERT INTO informe (TipoVehiculo,PLACA, NOMBRE, TELEFONO,DIAEI, MESEI,AÑOEI,DIAS,MESSA,AÑOSA) VALUES (?,?,?,?,?,?,?,?,?,?)";
          

        try {
            PreparedStatement pst = con.prepareStatement(SQL);
            pst.setString(1, tipov);
            pst.setString(2, placav);
            pst.setString(3, nombredueño);
            pst.setString(4, telefonodueño);
            pst.setString(5, DIAE);
            pst.setString(6, MESE);
            pst.setString(7, AÑOE);
            pst.setString(8, "");
            pst.setString(9, "");
            pst.setString(10, "");
            
          
            pst.executeUpdate();
            //JOptionPane.showMessageDialog(null, "Se inserto con exito");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al insertar en la base" + e.getMessage());
        }

    }

    public void eliminar(String placav) {

        String SQL = "DELETE FROM datos1 WHERE placa = '" + placav + "'";
        try {
            PreparedStatement pst = con.prepareStatement(SQL);
            pst.executeUpdate();
            //JOptionPane.showMessageDialog(null, "Se elimino con exito");

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error al eliminar en la base" + e.getMessage());

        }

    }

    public void  buscar(String placav, String info[]) {

        String SQL = "SELECT * FROM datos1 WHERE placa ='" + placav + "'";
        
        try {

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM datos1 WHERE placa = '" +placav + "'"); 
            
            while(rs.next()){
                info[0] = rs.getString(1);
                info[1] = rs.getString(2);
                info[2] = rs.getString(3);
                info[3] = rs.getString(4);
                info[4] = rs.getString(5);
                info[5] = rs.getString(6);
                info[6] = rs.getString(7);
                
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al buscar en la base la placa" + e.getMessage());

        }

      }
     
    public void modificar(String info[], String DS, String MS, String AS) {

        String SQL = "UPDATE informe SET tipovehiculo='" + info[0] + "',PLACA='" + info[1] + "',NOMBRE ='" + info[2] + "',TELEFONO='" + info[3] + "',DIAEI='" + info[4] + "',MESEI ='" + info[5] + "',AÑOEI='" +info[6]+ "',DIAS='" + DS + "',MESSA ='" + MS + "',AÑOSA='" + AS + "'WHERE PLACA ='" + info[1] + "'";
        try {
            PreparedStatement pst = con.prepareStatement(SQL);
            int resultado = pst.executeUpdate();
            if (resultado != 0) {
                
                 String r="0",t="0";
                
            }else{
                JOptionPane.showMessageDialog(null, "No se actualizo el usuario");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar" + e.getMessage());

        }

    }
    
    public int  buscarsimilar(String cedula) {

        int resultado = 0;

        String SQL = "SELECT * FROM datos1 WHERE PLACA ='" + cedula + "'";

        try {

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            if (rs.next()) {
                resultado = 1;
                if (resultado == 1) {
                    return 1;
                    //JOptionPane.showMessageDialog(null, "Se encontro el usuario");
                }

            }

        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Error al buscar en la base de daotos ");

        }
  
        return 0;

    }
    
    public carga() {

    }

}
