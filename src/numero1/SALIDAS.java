/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numero1;

import basededatos.carga;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.HIDE_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author Samuel Celis y Yorman Rodriguez
 */
public class SALIDAS extends JFrame {
    
    JTextArea busqueda = new JTextArea();
    JRadioButton elegir = new JRadioButton();
    String[] info = new String[7] ; 
    
    public SALIDAS(){
      
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        //setSize(800,500);
        setTitle("PARQUEADERO YOLI");
        //setBounds(600, 300, 500, 400);//primer dos tamaño y tercer y cuarto lugar de la ventana
        setLocationRelativeTo(null);//para ubicar la ventana em cualquier lugar de la pantalla
        
        //this.getContentPane().setBackground(Color.green);
        
        setDefaultCloseOperation(HIDE_ON_CLOSE); 
        
        JPanel panel3 = new JPanel();// creacion del panel
        panel3.setLayout(null);
        this.getContentPane().add(panel3);
        panel3.setBackground(Color.WHITE);//color panel
         
        //TITULO PARQUEADERO
        JLabel etiqueta = new JLabel("PARQUEADERO YOLI",SwingConstants.CENTER);
        //etiqueta.setText("PARQUEADERO YOLI");
        etiqueta.setBounds(400,80,1090,40);//ubicacion y tamaño de la caja de texto
        //etiqueta.setForeground(Color.green);//color letra
        etiqueta.setOpaque(false);
        etiqueta.setBackground(Color.WHITE);//color de fondo de la etiqueta
        etiqueta.setFont(new Font("Wide Latin",Font.BOLD,50));
        
        JLabel etiqueta3 = new JLabel();
        etiqueta3.setText( "→ Placa del vehiculo" );
        etiqueta3.setBounds(200,300,300,40);//ubicacion y tamaño de la caja de texto
        //etiqueta3.setForeground(Color.green);//color letra
        etiqueta3.setOpaque(false);
        etiqueta3.setBackground(Color.WHITE);//color de fondo de la etiqueta
        etiqueta3.setFont(new Font("arial",Font.BOLD,30));
        
        panel3.add(etiqueta3);
        panel3.add(etiqueta);
        
        //FOTO 
        ImageIcon Imagen = new ImageIcon("logoparqueadero.jpg");//llamado de imagen
        JLabel etiqueta2 = new JLabel();
        etiqueta2.setBounds(1000,180,600,600);
        etiqueta2.setIcon(new ImageIcon(Imagen.getImage().getScaledInstance(600,600,Image.SCALE_SMOOTH))); //tamaño de la imgaen ( largo, ancho, escalar)
        panel3.add(etiqueta2);
        
        panel3.add(etiqueta2);
        
        
        //CAJAS DE TEXTO
        JTextField placa = new JTextField();
        placa.setBounds(200,350,150,30);
        placa.setFont(new Font("arial",Font.PLAIN,25));
        
        panel3.add(placa);
        
        //RADIO BOTON
        elegir.setBounds(150,450,800,50);
        elegir.setFont(new Font("arial",Font.BOLD,15));
        elegir.setEnabled(false);
        panel3.add(elegir);
        
        //ACCION DEL BOTON
        ActionListener Eve = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 String placav = placa.getText();
                carga enviar = new carga();
                enviar.buscar(placav,info);
                int complaca = enviar.buscarsimilar(placav);
                if(complaca == 1){
                    elegir.setEnabled(true);
                    elegir.setText("\nTIPO VEHICULO: "+info[0] + "\n"+" PLACA:"+info[1]+"\n"+" NOMBRE: "+info[2]+"\n"+" TELEFONO: "+info[3]+"\n");
                }
                else{
                    elegir.setEnabled(false);
                    elegir.setSelected(false);
                    elegir.setText("");
                    JOptionPane.showMessageDialog(null, "Error esta placa no esta registrada");
                }
            }    
        };
        
          ActionListener Eve2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                setVisible(false);
            }    
        };
          
          ActionListener Eve3 = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String placav = placa.getText();
                if(placav.equals("")){
                    JOptionPane.showMessageDialog(null, "ERROR CAMPO VACIO");
                }
                if(elegir.isSelected() == true){
                    //
                    String medio = info[4];
                    VENTANACOBRO llamar = new VENTANACOBRO(placav,info);                   
                    llamar.setVisible(true);
                    elegir.setText("");
                    elegir.setSelected(false);
                    placa.setText("");
                }
            }
              
          };
         
        //BOTON INGRESAR
        JButton COBRO = new JButton("COBRAR");
        COBRO.setBounds(900,800,200,100);
        COBRO.setEnabled(true);//sirve para activar/desactivar la interaccion del boton
        //COBRO.setForeground(Color.ORANGE);//color de la letra del boton
        COBRO.setFont(new Font("arial",Font.BOLD,25));//establecer tipo de letra, negrilla,tamaño de letra
        //COBRO.setMnemonic('a');//establecer un boton para activar boton alt + tecla
        COBRO.setBackground(Color.ORANGE);//establecer el color del fondo del boton
        COBRO.addActionListener(Eve3);
        
        JButton REGRESAR = new JButton("VOLVER");
        REGRESAR.setBounds(1700,900,150,80);
        REGRESAR.setEnabled(true);//sirve para activar/desactivar la interaccion del boton
        //REGISTRAR.setForeground(Color.ORANGE);//color de la letra del boton
        REGRESAR.setFont(new Font("arial",Font.BOLD,25));//establecer tipo de letra, negrilla,tamaño de letra
        //REGRESAR.setMnemonic('a');//establecer un boton para activar boton alt + tecla
        REGRESAR.setBackground(Color.LIGHT_GRAY);//establecer el color del fondo del boton
        REGRESAR.addActionListener(Eve2);
        
        JButton BUSCAR = new JButton("BUSCAR");
        BUSCAR.setBounds(700,350,200,50);
        BUSCAR.setEnabled(true);//sirve para activar/desactivar la interaccion del boton
        //BUSCAR.setForeground(Color.ORANGE);//color de la letra del boton
        BUSCAR.setFont(new Font("arial",Font.BOLD,25));//establecer tipo de letra, negrilla,tamaño de letra
        BUSCAR.setMnemonic('a');//establecer un boton para activar boton alt + tecla
        BUSCAR.setBackground(Color.ORANGE);//establecer el color del fondo del boton
        BUSCAR.addActionListener(Eve);
        
        panel3.add(REGRESAR);
        panel3.add(COBRO);
        panel3.add(BUSCAR);
        
        }
    
}
