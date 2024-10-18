/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numero1;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author Samuel Celis y Yorman Rodriguez
 */
public class FECHA extends JFrame {
    
    JTextField DIACA = new JTextField();
    JTextField MESCA = new JTextField();
    JTextField AÑOCA = new JTextField();
    JButton ACEPTAR = new JButton("ACEPTAR");
    
    public FECHA(){
      
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setSize(800,500);
        setTitle("PARQUEADERO YOLI");
        //setBounds(600, 300, 500, 400);//primer dos tamaño y tercer y cuarto lugar de la ventana
        setLocationRelativeTo(null);//para ubicar la ventana em cualquier lugar de la pantalla
        
        //this.getContentPane().setBackground(Color.green);
        
        setDefaultCloseOperation(HIDE_ON_CLOSE); 
        
        JPanel panel5 = new JPanel();// creacion del panel
        panel5.setLayout(null);
        this.getContentPane().add(panel5);
        panel5.setBackground(Color.WHITE);//color panel
         
        //TITULO PARQUEADERO
        JLabel etiqueta = new JLabel("PARQUEADERO YOLI",SwingConstants.CENTER);
        //etiqueta.setText("PARQUEADERO YOLI");
        etiqueta.setBounds(400,80,1090,40);//ubicacion y tamaño de la caja de texto
        //etiqueta.setForeground(Color.green);//color letra
        etiqueta.setOpaque(false);
        etiqueta.setBackground(Color.WHITE);//color de fondo de la etiqueta
        etiqueta.setFont(new Font("Wide Latin",Font.BOLD,50));
        
        JLabel etiqueta3 = new JLabel();//Usuario
        etiqueta3.setText( "DIA:" );//pregunta4
        etiqueta3.setBounds(1000,300,100,40);//ubicacion y tamaño de la caja de texto
        //etiqueta3.setForeground(Color.green);//color letra
        etiqueta3.setOpaque(false);
        etiqueta3.setBackground(Color.WHITE);//color de fondo de la etiqueta
        etiqueta3.setFont(new Font("arial",Font.BOLD,30));
        
        JLabel etiqueta4 = new JLabel();//Usuario
        etiqueta4.setText( "MES:" );//pregunta4
        etiqueta4.setBounds(1000,400,100,40);//ubicacion y tamaño de la caja de texto
        //etiqueta4.setForeground(Color.green);//color letra
        etiqueta4.setOpaque(false);
        etiqueta4.setBackground(Color.WHITE);//color de fondo de la etiqueta
        etiqueta4.setFont(new Font("arial",Font.BOLD,30));
        
        JLabel etiqueta5 = new JLabel();//Usuario
        etiqueta5.setText( "AÑO:" );//pregunta4
        etiqueta5.setBounds(1000,500,100,40);//ubicacion y tamaño de la caja de texto
        //etiqueta5.setForeground(Color.green);//color letra
        etiqueta5.setOpaque(false);
        etiqueta5.setBackground(Color.WHITE);//color de fondo de la etiqueta
        etiqueta5.setFont(new Font("arial",Font.BOLD,30));
        
        panel5.add(etiqueta);
        panel5.add(etiqueta3);
        panel5.add(etiqueta4);
        panel5.add(etiqueta5);
        
        //FOTO 
        ImageIcon Imagen = new ImageIcon("logoparqueadero.jpg");//llamado de imagen
        JLabel etiqueta2 = new JLabel();
        etiqueta2.setBounds(250,180,600,600);
        etiqueta2.setIcon(new ImageIcon(Imagen.getImage().getScaledInstance(600,600,Image.SCALE_SMOOTH))); //tamaño de la imgaen ( largo, ancho, escalar)
        panel5.add(etiqueta2);
        
        panel5.add(etiqueta2);
        
        //caja de texto dia
        DIACA.setBounds(1100,300,80,30);
        DIACA.setFont(new Font("arial",Font.PLAIN,25));
        
        //caja de texto mes
        MESCA.setBounds(1100,400,80,30);
        MESCA.setFont(new Font("arial",Font.PLAIN,25));
        
        //caja de texto año
        AÑOCA.setBounds(1100,500,80,30);
        AÑOCA.setFont(new Font("arial",Font.PLAIN,25));
        
        panel5.add(DIACA);
        panel5.add(MESCA);
        panel5.add(AÑOCA);
        
        //ACCION DEL BOTON
        MouseListener Eve2 = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
             int res = comprobarcam();
                if(res == 1){
                    int renum = comprobarnum();
                        if(renum == 1){
                            ACEPTAR.setEnabled(true);//sirve para activar/desactivar la interaccion del boton
                            Numero1 llamar = new Numero1();
                            llamar.setVisible(true);
                            setVisible(false);
                            DIACA.setText("");
                            MESCA.setText("");
                            AÑOCA.setText("");
                        }
                }
                else{
                    JOptionPane.showMessageDialog(null, "POR FAVOR LLENAR LOS ESPACIOS EN BLANCO");
                    ACEPTAR.setEnabled(false);
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                int res = comprobarcam();
                if(res == 1){
                 ACEPTAR.setEnabled(true);//sirve para activar/desactivar la interaccion del boton
                        
                }
                else{
                    ACEPTAR.setEnabled(false);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
            }
        };
        
        //BOTON INGRESAR
        ACEPTAR.setBounds(1000,650,200,50);
        ACEPTAR.setEnabled(false);//sirve para activar/desactivar la interaccion del boton
        //ACEPTAR.setForeground(Color.ORANGE);//color de la letra del boton
        ACEPTAR.setFont(new Font("arial",Font.BOLD,25));//establecer tipo de letra, negrilla,tamaño de letra
        ACEPTAR.setMnemonic('\n');//establecer un boton para activar boton alt + tecla
        ACEPTAR.setBackground(Color.ORANGE);//establecer el color del fondo del boton
        ACEPTAR.addMouseListener(Eve2);
        
        panel5.add(ACEPTAR);
        
        }
    
    private int comprobarcam(){
        
       if(DIACA.getText().equals("")){
            return 0;
        }
        
        if(MESCA.getText().equals("")){
            return 0;
        }
        
        if( AÑOCA.getText().equals("")){
            return 0;
        }     
        
        return 1;
       }
    
    private int comprobarnum(){
        
        int dia,mes,año;
        dia = Integer.parseInt(DIACA.getText());
        mes = Integer.parseInt(MESCA.getText());
        año = Integer.parseInt(AÑOCA.getText());
        
        if(dia <1 || dia >31){
            JOptionPane.showMessageDialog(null, "DIA NO VALIDO");
            return 0;
        }
        if( mes < 1 || mes > 12 ){
            JOptionPane.showMessageDialog(null, "MES NO VALIDO");
            return 0;
        }
        
        if( año < 2022){
            JOptionPane.showMessageDialog(null, "AÑO NO VALIDO");            
            return 0;
        }
        
        return 1;
    
        }
    }
    



    