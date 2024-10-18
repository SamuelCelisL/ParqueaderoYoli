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
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author Samuel Celis y Yorman Rodriguez
 */
public class ENTRADA extends JFrame {

    
    
    JTextField USUARIO = new JTextField();
    JPasswordField CONTRASEÑA = new JPasswordField();
    JButton INGRESAR = new JButton("INGRESAR");
    
    String usuarioverificado = "marializ04";
    String contraseñaverificado = "123";
 
  public ENTRADA(){
      
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setSize(800,500);
        setTitle("PARQUEADERO YOLI");
        //setBounds(600, 300, 500, 400);//primer dos tamaño y tercer y cuarto lugar de la ventana
        setLocationRelativeTo(null);//para ubicar la ventana em cualquier lugar de la pantalla
        
        //this.getContentPane().setBackground(Color.green);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        
        JPanel panel0 = new JPanel();// creacion del panel
        panel0.setLayout(null);
        this.getContentPane().add(panel0);
        panel0.setBackground(Color.WHITE);//color panel
         
        //TITULO PARQUEADERO
        JLabel etiqueta = new JLabel("PARQUEADERO YOLI",SwingConstants.CENTER);
        //etiqueta.setText("PARQUEADERO YOLI");
        etiqueta.setBounds(400,80,1090,40);//ubicacion y tamaño de la caja de texto
        //etiqueta.setForeground(Color.green);//color letra
        etiqueta.setOpaque(false);
        etiqueta.setBackground(Color.WHITE);//color de fondo de la etiqueta
        etiqueta.setFont(new Font("Wide Latin",Font.BOLD,50));
        
        JLabel etiqueta3 = new JLabel();//Usuario
        etiqueta3.setText( "USUARIO " );//pregunta4
        etiqueta3.setBounds(1100,300,400,40);//ubicacion y tamaño de la caja de texto
        //etiqueta3.setForeground(Color.green);//color letra
        etiqueta3.setOpaque(false);
        etiqueta3.setBackground(Color.WHITE);//color de fondo de la etiqueta
        etiqueta3.setFont(new Font("arial",Font.BOLD,30));
        
        JLabel etiqueta4 = new JLabel();//Usuario
        etiqueta4.setText( "CONTRASEÑA " );//pregunta4
        etiqueta4.setBounds(1100,450,400,40);//ubicacion y tamaño de la caja de texto
        //etiqueta4.setForeground(Color.green);//color letra
        etiqueta4.setOpaque(false);
        etiqueta4.setBackground(Color.WHITE);//color de fondo de la etiqueta
        etiqueta4.setFont(new Font("arial",Font.BOLD,30));
        
        panel0.add(etiqueta);
        panel0.add(etiqueta3);
        panel0.add(etiqueta4);
        
        //FOTO 
        ImageIcon Imagen = new ImageIcon("logoparqueadero.jpg");//llamado de imagen
        JLabel etiqueta2 = new JLabel();
        etiqueta2.setBounds(250,180,600,600);
        etiqueta2.setIcon(new ImageIcon(Imagen.getImage().getScaledInstance(600,600,Image.SCALE_SMOOTH))); //tamaño de la imgaen ( largo, ancho, escalar)
        panel0.add(etiqueta2);
        
        panel0.add(etiqueta2);
        
        //caja de texto usuario
        USUARIO.setBounds(1100,350,300,50);
        USUARIO.setFont(new Font("arial",Font.PLAIN,25));
        
        //caja de texto contraseña
        CONTRASEÑA.setBounds(1100,500,300,50);
        CONTRASEÑA.setFont(new Font("arial",Font.PLAIN,25));
        
        panel0.add(CONTRASEÑA);
        panel0.add(USUARIO);
        
        //ACCION DEL BOTON
        
        MouseListener Eve2 = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
             int res = comprobar();
                if(res == 0){
                    INGRESAR.setEnabled(true);//sirve para activar/desactivar la interaccion del boton
                Numero1 llamar = new Numero1();
                llamar.setVisible(true);
                USUARIO.setText("");
                CONTRASEÑA.setText("");
                }
                
                else{
                    JOptionPane.showMessageDialog(null, "USUARIO o CONTRASEÑA INCORRECTO");
                    INGRESAR.setEnabled(false);
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                int res = comprobar();
                if(res == 0){
                    INGRESAR.setEnabled(true);//sirve para activar/desactivar la interaccion del boton
                }
                
                else{
                    INGRESAR.setEnabled(false);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
            }
        };
            
        //BOTON INGRESAR
        INGRESAR.setBounds(850,800,200,100);
        INGRESAR.setEnabled(false);//sirve para activar/desactivar la interaccion del boton
        //REGISTRAR.setForeground(Color.ORANGE);//color de la letra del boton
        INGRESAR.setFont(new Font("arial",Font.BOLD,25));//establecer tipo de letra, negrilla,tamaño de letra
        INGRESAR.setMnemonic('\n');//establecer un boton para activar boton alt + tecla
        INGRESAR.setBackground(Color.ORANGE);//establecer el color del fondo del boton
        INGRESAR.addMouseListener(Eve2);
        
        panel0.add(INGRESAR);
        
        }
        
      private int comprobar(){
          String pass = "";
          
          if (USUARIO.getText().equals(usuarioverificado)){
              char [] contra = CONTRASEÑA.getPassword();
                for(int x = 0 ; x<contra.length; x++){
                    pass += contra[x];
                    }
                if(pass.equals(contraseñaverificado)){
                    return 0;
                }else{
                    return 1;
                }
                 
          }else{
              return 1;
          }
      }
    
    }
