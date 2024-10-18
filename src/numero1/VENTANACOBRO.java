/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numero1;

import basededatos.carga;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.HIDE_ON_CLOSE;

/**
 *
 * @author Samuel Celis y Yorman Rodriguez
 */
public class VENTANACOBRO extends JFrame {
    
    JButton FINALIZAR = new JButton("FINALIZAR");
    JButton CALCULAR = new JButton("CALCULAR");
    JTextField valor = new JTextField("$");
    JTextField diaS = new JTextField();
    JTextField mesS = new JTextField();
    JTextField añoS = new JTextField();
    
    public VENTANACOBRO(String placav, String info[]){
        
        //setExtendedState(JFrame.MAXIMIZED_BOTH);
        setSize(800,500);
        setTitle("PARQUEADERO YOLI");
        //setBounds(600, 300, 500, 400);//primer dos tamaño y tercer y cuarto lugar de la ventana
        setLocationRelativeTo(null);//para ubicar la ventana em cualquier lugar de la pantalla
        
        //this.getContentPane().setBackground(Color.green);
        
        setDefaultCloseOperation(HIDE_ON_CLOSE); 
        
        JPanel panel6 = new JPanel();// creacion del panel
        panel6.setLayout(null);
        this.getContentPane().add(panel6);
        panel6.setBackground(Color.WHITE);//color panel
         
        //TITULO PARQUEADERO
        JLabel etiqueta = new JLabel();
        etiqueta.setText("PARQUEADERO YOLI");
        etiqueta.setBounds(200,20,1090,40);//ubicacion y tamaño de la caja de texto
        //etiqueta.setForeground(Color.green);//color letra
        etiqueta.setOpaque(true);
        etiqueta.setBackground(Color.WHITE);//color de fondo de la etiqueta
        etiqueta.setFont(new Font("arial",Font.BOLD,20));
        
        //HORA DE SALIDA
        JLabel etiqueta2 = new JLabel();
        etiqueta2.setText("> DIA DE SALIDA : ");
        etiqueta2.setBounds(100,80,400,40);//ubicacion y tamaño de la caja de texto
        //etiqueta2.setForeground(Color.green);//color letra
        etiqueta2.setOpaque(true);
        etiqueta2.setBackground(Color.WHITE);//color de fondo de la etiqueta
        etiqueta2.setFont(new Font("arial",Font.BOLD,20));
        
        JLabel etiqueta3 = new JLabel();
        etiqueta3.setText("> MES DE SALIDA : ");
        etiqueta3.setBounds(100,150,400,40);//ubicacion y tamaño de la caja de texto
        //etiqueta3.setForeground(Color.green);//color letra
        etiqueta3.setOpaque(true);
        etiqueta3.setBackground(Color.WHITE);//color de fondo de la etiqueta
        etiqueta3.setFont(new Font("arial",Font.BOLD,20));
        
        JLabel etiqueta5 = new JLabel();
        etiqueta5.setText("> AÑO DE SALIDA : ");
        etiqueta5.setBounds(100,220,400,40);//ubicacion y tamaño de la caja de texto
        //etiqueta5.setForeground(Color.green);//color letra
        etiqueta5.setOpaque(true);
        etiqueta5.setBackground(Color.WHITE);//color de fondo de la etiqueta
        etiqueta5.setFont(new Font("arial",Font.BOLD,20));
        
        
        JLabel etiqueta4 = new JLabel();
        etiqueta4.setText("> TOTAL A PAGAR : ");
        etiqueta4.setBounds(100,300,300,40);//ubicacion y tamaño de la caja de texto
        //etiqueta4.setForeground(Color.green);//color letra
        etiqueta4.setOpaque(true);
        etiqueta4.setBackground(Color.WHITE);//color de fondo de la etiqueta
        etiqueta4.setFont(new Font("arial",Font.BOLD,20));
        
        panel6.add(etiqueta);
        panel6.add(etiqueta2);
        panel6.add(etiqueta3);
        panel6.add(etiqueta5);
        panel6.add(etiqueta4);
        
        //caja dia
        diaS.setBounds(600, 80 , 80 , 40);
        diaS.setFont(new Font("arial",Font.BOLD,20));
        
        //caja valor
        valor.setEditable(false);
        valor.setBounds(500, 300 , 200 , 50);
        valor.setFont(new Font("arial",Font.BOLD,30));
        
        //caja mes
        mesS.setBounds(600, 150 , 80 , 40);
        mesS.setFont(new Font("arial",Font.BOLD,20));
        
        //caja año
        añoS.setBounds(600, 220 , 80 , 40);
        añoS.setFont(new Font("arial",Font.BOLD,20));
        
        
        panel6.add(valor);
        panel6.add(diaS);
        panel6.add(mesS);
        panel6.add(añoS);
        
        
        
        ActionListener Eve = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                String diasalida = diaS.getText();
                String messalida = mesS.getText();
                String añosalida = añoS.getText();
                
                carga llamar = new carga();
                llamar.modificar(info, diasalida,messalida,añosalida);
                llamar.eliminar(placav);
                JOptionPane.showMessageDialog(null, "SALIDA EXITOSA!!");
            }    
        };
        MouseListener Eve2 = new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {
            
            }

            @Override
            public void mousePressed(MouseEvent e) {
                calcular(info);
            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                 verificaraño(info);
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
            
        };
        
       /* ActionListener Eve2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                calcular(info);
               
            }    
        };*/
        
        //BOTON
        FINALIZAR.setBounds(550,370,180,50);
        FINALIZAR.setEnabled(false);//sirve para activar/desactivar la interaccion del boton
        //FINALIZAR.setForeground(Color.ORANGE);//color de la letra del boton
        FINALIZAR.setFont(new Font("arial",Font.BOLD,25));//establecer tipo de letra, negrilla,tamaño de letra
        //FINALIZAR.setMnemonic('a');//establecer un boton para activar boton alt + tecla
        FINALIZAR.setBackground(Color.LIGHT_GRAY);//establecer el color del fondo del boton
        FINALIZAR.addActionListener(Eve);
        
        //BOTON 2
        CALCULAR.setBounds(250,370,180,50);
        CALCULAR.setEnabled(true);//sirve para activar/desactivar la interaccion del boton
        //CALCULAR.setForeground(Color.ORANGE);//color de la letra del boton
        CALCULAR.setFont(new Font("arial",Font.BOLD,25));//establecer tipo de letra, negrilla,tamaño de letra
        //CALCULAR.setMnemonic('a');//establecer un boton para activar boton alt + tecla
        CALCULAR.setBackground(Color.LIGHT_GRAY);//establecer el color del fondo del boton
        CALCULAR.addMouseListener(Eve2);
        
        panel6.add(FINALIZAR);
        panel6.add(CALCULAR);
    }
    
    private void calcular(String info[]){
        int restad,restam,restaa,total;
        int diaIN, mesIN,añoIN,diaSN,mesSN,añoSN;
        String diaE,mesE,añoE,diaSa,mesSa,añosSa;
        
        diaE = info[4];
        mesE = info[5];
        añoE = info[6];
        diaSa = diaS.getText();
        mesSa = mesS.getText();
        añosSa = añoS.getText();
        
        diaIN = Integer.parseInt(diaE);
        mesIN = Integer.parseInt(mesE);
        añoIN = Integer.parseInt(añoE);
        diaSN = Integer.parseInt(diaSa);
        mesSN = Integer.parseInt(mesSa);
        añoSN = Integer.parseInt(añosSa);
        
            if(añoSN == añoIN){
                if(mesSN == mesIN){
                    if(diaSN > diaIN){
                    restad = diaSN - diaIN;
                    total = restad*2000;
                    }
                    else{
                    total = 2000;
                    }
                }
                else{
                    restam = mesSN-mesIN;
                    restad = diaSN - diaIN; 
                    total = ((restam*30)+restad)*2000;
                    }
                }
            else{
                restaa = añoSN - añoIN;
                restam = mesSN-mesIN;
                restad = diaSN - diaIN; 
                total = ((restaa*360)+(restam*30)+restad)*2000;
            
                }
            
            String totaltext = Integer.toString(total);
            valor.setText(totaltext);
        
        FINALIZAR.setEnabled(true);
    }
    
    public void verificaraño(String info[]){
        String añosSa = añoS.getText();
        int añoSN = Integer.parseInt(añosSa);
        
        String añoE = info[6];
        int añoIN = Integer.parseInt(añoE);
        
        if(añoSN < añoIN){
            CALCULAR.setEnabled(false);
            JOptionPane.showMessageDialog(null, "EL AÑO ES MENOR AL DEL REGISTRO");
        }
        else{
            CALCULAR.setEnabled(true);
        }
    }
}
