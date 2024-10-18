/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numero1;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author Samuel Celis y Yorman Rodriguez
 */
public class Numero1 extends JFrame {
    
    JPanel panel;
    public Numero1(){
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        //setSize(800,500);
        setTitle("PARQUEADERO YOLI");
        //setBounds(600, 300, 500, 400);//primer dos tamaño y tercer y cuarto lugar de la ventana
        setLocationRelativeTo(null);//para ubicar la ventana em cualquier lugar de la pantalla
        
        //this.getContentPane().setBackground(Color.green);
        
        iniciarcomponentes();
        setDefaultCloseOperation(HIDE_ON_CLOSE); 
 
    }
    
    private void iniciarcomponentes(){
        
       colocarpanel();
       colocaretiquetas();
       colocarbotones();
       
    }
    
    private void colocarpanel(){
        panel = new JPanel();// creacion del panel
        panel.setLayout(null);
        this.getContentPane().add(panel);
        panel.setBackground(Color.WHITE);//color panel
    }
    
    private void colocaretiquetas(){
        JLabel etiqueta = new JLabel("PARQUEADERO YOLI",SwingConstants.CENTER);
        //etiqueta.setText("PARQUEADERO YOLI");
        etiqueta.setBounds(450,80,1090,40);//ubicacion y tamaño de la caja de texto
        //etiqueta.setForeground(Color.green);//color letra
        etiqueta.setOpaque(false);
        etiqueta.setBackground(Color.WHITE);//color de fondo de la etiqueta
        etiqueta.setFont(new Font("Wide Latin",Font.BOLD,50));
        
        panel.add(etiqueta);//poner etiqueta en el panel
        
        ImageIcon Imagen = new ImageIcon("logoparqueadero.jpg");//llamado de imagen
        JLabel etiqueta2 = new JLabel();
        etiqueta2.setBounds(700,180,600,600);
        etiqueta2.setIcon(new ImageIcon(Imagen.getImage().getScaledInstance(600,600,Image.SCALE_SMOOTH))); //tamaño de la imgaen ( largo, ancho, escalar)
        panel.add(etiqueta2);
        
        ImageIcon Imagen2 = new ImageIcon("iconoregistrar.jpg");//llamado de imagen
        JLabel etiqueta3 = new JLabel();
        etiqueta3.setBounds(400,500,200,180);
        etiqueta3.setIcon(new ImageIcon(Imagen2.getImage().getScaledInstance(200,200,Image.SCALE_SMOOTH))); //tamaño de la imgaen ( largo, ancho, escalar)
        panel.add(etiqueta3);
        
        ImageIcon Imagen3 = new ImageIcon("iconosalidas.png");//llamado de imagen
        JLabel etiqueta4 = new JLabel();
        etiqueta4.setBounds(1360,500,200,200);
        etiqueta4.setIcon(new ImageIcon(Imagen3.getImage().getScaledInstance(200,200,Image.SCALE_SMOOTH))); //tamaño de la imgaen ( largo, ancho, escalar)
        panel.add(etiqueta4);
    }
    
    private void colocarbotones(){
        ActionListener Eve = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                REGISTRO1 llamar = new REGISTRO1();
                llamar.setVisible(true);
            } 
        };
        
        ActionListener Eve2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SALIDAS llamar2 = new SALIDAS();
                llamar2.setVisible(true);
            }    
        };
        
        ActionListener Eve3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }    
        };
        
        ActionListener Eve4 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tablainforme llamar3 = new tablainforme();
                llamar3.setVisible(true);
            }    
        };
        
        JButton REGISTRAR = new JButton("REGISTRAR");
        REGISTRAR.setBounds(400,400,200,100);
        REGISTRAR.setEnabled(true);//sirve para activar/desactivar la interaccion del boton
        //REGISTRAR.setForeground(Color.ORANGE);//color de la letra del boton
        REGISTRAR.setFont(new Font("arial",Font.BOLD,25));//establecer tipo de letra, negrilla,tamaño de letra
        REGISTRAR.setMnemonic('a');//establecer un boton para activar boton alt + tecla
        REGISTRAR.setBackground(Color.ORANGE);//establecer el color del fondo del boton
        REGISTRAR.addActionListener(Eve);
        
        JButton SALIDAS = new JButton("SALIDA");
        SALIDAS.setBounds(1360,400,200,100);
        SALIDAS.setEnabled(true);//sirve para activar/desactivar la interaccion del boton
        //SALIDAS.setForeground(Color.ORANGE);
        SALIDAS.setFont(new Font("arial",Font.BOLD,25));//establecer tipo de letra, negrilla,tamaño de letra
        SALIDAS.setMnemonic('b');//establecer un boton para activar boton alt + tecla
        SALIDAS.setBackground(Color.ORANGE);
        SALIDAS.addActionListener(Eve2);
        
        JButton CERRAR = new JButton("CERRAR SESION");
        CERRAR.setBounds(1000,800,300,60);
        CERRAR.setEnabled(true);//sirve para activar/desactivar la interaccion del boton
        //CERRAR.setForeground(Color.ORANGE);//color de la letra del boton
        CERRAR.setFont(new Font("arial",Font.BOLD,25));//establecer tipo de letra, negrilla,tamaño de letra
        //CERRAR.setMnemonic('a');//establecer un boton para activar boton alt + tecla
        CERRAR.setBackground(Color.LIGHT_GRAY);//establecer el color del fondo del boton
        CERRAR.addActionListener(Eve3);
        
        JButton INFORME = new JButton("INFORME");
        INFORME.setBounds(750,800,200,50);
        INFORME.setEnabled(true);//sirve para activar/desactivar la interaccion del boton
        //INFORME.setForeground(Color.ORANGE);//color de la letra del boton
        INFORME.setFont(new Font("arial",Font.BOLD,25));//establecer tipo de letra, negrilla,tamaño de letra
        //INFORME.setMnemonic('a');//establecer un boton para activar boton alt + tecla
        INFORME.setBackground(Color.ORANGE);//establecer el color del fondo del boton
        INFORME.addActionListener(Eve4);
        
        panel.add(CERRAR);
        panel.add(REGISTRAR);
        panel.add(SALIDAS);
        panel.add(INFORME);
    }
}
