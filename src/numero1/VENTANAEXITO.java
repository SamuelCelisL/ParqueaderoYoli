/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numero1;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.HIDE_ON_CLOSE;

/**
 *
 * @author Samuel Celis y Yorman Rodriguez
 */
public class VENTANAEXITO extends JFrame{
    
    public VENTANAEXITO(String placav , String nombredueño, String telefonodueño,String tipov, String horaI){
        
        //setExtendedState(JFrame.MAXIMIZED_BOTH);
        setSize(800,500);
        setTitle("PARQUEADERO YOLI");
        //setBounds(600, 300, 500, 400);//primer dos tamaño y tercer y cuarto lugar de la ventana
        setLocationRelativeTo(null);//para ubicar la ventana em cualquier lugar de la pantalla
        
        //this.getContentPane().setBackground(Color.green);
        
        setDefaultCloseOperation(HIDE_ON_CLOSE); 
        
        JPanel panel4 = new JPanel();// creacion del panel
        panel4.setLayout(null);
        this.getContentPane().add(panel4);
        panel4.setBackground(Color.WHITE);//color panel
         
        //TITULO PARQUEADERO
        JLabel etiqueta = new JLabel();
        etiqueta.setText("PARQUEADERO YOLI");
        etiqueta.setBounds(200,20,1090,40);//ubicacion y tamaño de la caja de texto
        //etiqueta.setForeground(Color.green);//color letra
        etiqueta.setOpaque(true);
        etiqueta.setBackground(Color.WHITE);//color de fondo de la etiqueta
        etiqueta.setFont(new Font("arial",Font.BOLD,20));
        
        JLabel etiqueta2 = new JLabel();
        etiqueta2.setText("> TIPO DE VEHICULO: "+tipov);
        etiqueta2.setBounds(100,80,1090,40);//ubicacion y tamaño de la caja de texto
        //etiqueta2.setForeground(Color.green);//color letra
        etiqueta2.setOpaque(true);
        etiqueta2.setBackground(Color.WHITE);//color de fondo de la etiqueta
        etiqueta2.setFont(new Font("arial",Font.BOLD,20));
        
        JLabel etiqueta3 = new JLabel();
        etiqueta3.setText("> PLACA: " + placav);
        etiqueta3.setBounds(100,120,1090,40);//ubicacion y tamaño de la caja de texto
        //etiqueta3.setForeground(Color.green);//color letra
        etiqueta3.setOpaque(true);
        etiqueta3.setBackground(Color.WHITE);//color de fondo de la etiqueta
        etiqueta3.setFont(new Font("arial",Font.BOLD,20));
        
        JLabel etiqueta4 = new JLabel();
        etiqueta4.setText("> NOMBRE PROPIETARIO: " +nombredueño);
        etiqueta4.setBounds(100,160,1090,40);//ubicacion y tamaño de la caja de texto
        //etiqueta4.setForeground(Color.green);//color letra
        etiqueta4.setOpaque(true);
        etiqueta4.setBackground(Color.WHITE);//color de fondo de la etiqueta
        etiqueta4.setFont(new Font("arial",Font.BOLD,20));
        
        JLabel etiqueta5 = new JLabel();
        etiqueta5.setText("> TELEFONO PPROPIETARIO: " +telefonodueño);
        etiqueta5.setBounds(100,200,1090,40);//ubicacion y tamaño de la caja de texto
        //etiqueta5.setForeground(Color.green);//color letra
        etiqueta5.setOpaque(true);
        etiqueta5.setBackground(Color.WHITE);//color de fondo de la etiqueta
        etiqueta5.setFont(new Font("arial",Font.BOLD,20));
        
        JLabel etiqueta6 = new JLabel();
        etiqueta6.setText("REGISTRO EXITO!!! :)");
        etiqueta6.setBounds(200,260,1090,40);//ubicacion y tamaño de la caja de texto
        //etiqueta6.setForeground(Color.green);//color letra
        etiqueta6.setOpaque(true);
        etiqueta6.setBackground(Color.WHITE);//color de fondo de la etiqueta
        etiqueta6.setFont(new Font("arial",Font.BOLD,20));
        
        panel4.add(etiqueta);
        panel4.add(etiqueta2);
        panel4.add(etiqueta3);
        panel4.add(etiqueta4);
        panel4.add(etiqueta5);
        panel4.add(etiqueta6);
        
        ActionListener Eve = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }    
        };
        
        JButton CONFIRMAR = new JButton("ACEPTAR");
        CONFIRMAR.setBounds(550,370,180,50);
        CONFIRMAR.setEnabled(true);//sirve para activar/desactivar la interaccion del boton
        //REGISTRAR.setForeground(Color.ORANGE);//color de la letra del boton
        CONFIRMAR.setFont(new Font("arial",Font.BOLD,25));//establecer tipo de letra, negrilla,tamaño de letra
        //CONFIRMAR.setMnemonic('a');//establecer un boton para activar boton alt + tecla
        CONFIRMAR.setBackground(Color.LIGHT_GRAY);//establecer el color del fondo del boton
        CONFIRMAR.addActionListener(Eve);
        panel4.add(CONFIRMAR);
    }
    
}
