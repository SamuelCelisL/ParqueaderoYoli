/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numero1;

import basededatos.conexion;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import static javax.swing.WindowConstants.HIDE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Samuel Celis y Yorman Rodriguez
 */
public class tablainforme extends JFrame{
    
    private ResultSet RS;
    conexion cc = new conexion();
    Connection con = cc.getConnection();
    private PreparedStatement PS;
    
    DefaultTableModel tabla = new DefaultTableModel();
    
    JTable tabla1;
    
    String[] info2 = new String[10];
    
   public tablainforme(){
        
        //setExtendedState(JFrame.MAXIMIZED_BOTH);
        setSize(1500,900);
        setTitle("PARQUEADERO YOLI");
        //setBounds(600, 300, 500, 400);//primer dos tamaño y tercer y cuarto lugar de la ventana
        setLocationRelativeTo(null);//para ubicar la ventana em cualquier lugar de la pantalla
        
        //this.getContentPane().setBackground(Color.green);
        
        setDefaultCloseOperation(HIDE_ON_CLOSE); 
        
        JPanel panel7 = new JPanel();// creacion del panel
        panel7.setLayout(null);
        this.getContentPane().add(panel7);
        panel7.setBackground(Color.WHITE);//color panel
         
        //TITULO PARQUEADERO
        JLabel etiqueta = new JLabel();
        etiqueta.setText("INFORME PARQUEADERO YOLI");
        etiqueta.setBounds(600,20,1090,40);//ubicacion y tamaño de la caja de texto
        //etiqueta.setForeground(Color.green);//color letra
        etiqueta.setOpaque(false);
        etiqueta.setBackground(Color.WHITE);//color de fondo de la etiqueta
        etiqueta.setFont(new Font("arial",Font.BOLD,20));
        
        
        panel7.add(etiqueta);
        
        armartabla();       
        
        //tabla ubicacion
        //tabla1.setBounds(180, 180, 1140, 1500); 
        tabla1.setEnabled(false);
        
        try {

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM informe "); 
            
            while(rs.next()){
                info2[0] = rs.getString(1);
                info2[1] = rs.getString(2);
                info2[2] = rs.getString(3);
                info2[3] = rs.getString(4);
                info2[4] = rs.getString(5);
                info2[5] = rs.getString(6);
                info2[6] = rs.getString(7);
                info2[7] = rs.getString(8);
                info2[8] = rs.getString(9);
                info2[9] = rs.getString(10);
                
                tabla.addRow(info2);
            }
            
            tabla1.setModel(tabla);
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al generar reporte" + e.getMessage());

        }
        
        JScrollPane corredor = new JScrollPane(tabla1);
        corredor.setBounds(180, 100, 1140, 600);
        
        panel7.add(corredor);
    }
   
   private void armartabla(){
        
        tabla.addColumn("TipoVehiculo");
        tabla.addColumn("PLACA");
        tabla.addColumn("NOMBRE");
        tabla.addColumn("TELEFONO");
        tabla.addColumn("DIA DE ENTRADA");
        tabla.addColumn("MES DE ENTRADA");
        tabla.addColumn("AÑO DE ENTRADA");
        tabla.addColumn("DIA DE SALIDA");
        tabla.addColumn("MES DE SALIDA");
        tabla.addColumn("AÑO DE SALIDA");
        
        tabla1 = new JTable(tabla);
        
        
   }
    
}
