package numero1;

import basededatos.carga;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author Samuel Celis y Yorman Rodriguez
 */
public class REGISTRO1 extends JFrame{
    
    JPanel panel2;
    JButton CONFIRMAR = new JButton("CONFIRMAR");
    JTextField placa = new JTextField();
    JTextField nombredu = new JTextField();
    JTextField telefonodu = new JTextField();
    JTextField diaE = new JTextField();
    JTextField mesE = new JTextField();
    JTextField añoE = new JTextField();
    
    carga enviar = new carga();//objeto de comunicacion
    
    public REGISTRO1(){
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        setTitle("PARQUEADERO YOLI");
        //setBounds(600, 300, 500, 400);//primer dos tamaño y tercer y cuarto lugar de la ventana
        setLocationRelativeTo(null);//para ubicar la ventana em cualquier lugar de la pantalla
        
        iniciarcomponentes();
        setDefaultCloseOperation(HIDE_ON_CLOSE);   
    }
    
    private void iniciarcomponentes(){
        
       colocarpanel2();
       colocaretiquetas2();
       
    }
    
    private void colocarpanel2(){
        panel2 = new JPanel();// creacion del panel
        panel2.setLayout(null);
        this.getContentPane().add(panel2);
        panel2.setBackground(Color.WHITE);//color panel
    }
    
    private void colocaretiquetas2(){
            
        JLabel etiqueta = new JLabel("PARQUEADERO YOLI",SwingConstants.CENTER);//nombre parqueadero
        //etiqueta.setText("PARQUEADERO YOLI");
        etiqueta.setBounds(450,80,1090,40);//ubicacion y tamaño de la caja de texto
        //etiqueta.setForeground(Color.green);//color letra
        etiqueta.setOpaque(false);
        etiqueta.setBackground(Color.WHITE);//color de fondo de la etiqueta
        etiqueta.setFont(new Font("Wide Latin",Font.BOLD,50));
       
        JLabel etiqueta3 = new JLabel();
        etiqueta3.setText("DATOS DE REGISTRO");//titulo registro
        etiqueta3.setBounds(400,200,500,40);//ubicacion y tamaño de la caja de texto
        //etiqueta3.setForeground(Color.green);//color letra
        etiqueta3.setOpaque(false);
        etiqueta3.setBackground(Color.WHITE);//color de fondo de la etiqueta
        etiqueta3.setFont(new Font("arial",Font.BOLD,40));
        
        JLabel etiqueta4 = new JLabel();
        etiqueta4.setText( "→ ¿Que tipo de vehiculo va a ingresar?" );//pregunta1
        etiqueta4.setBounds(200,300,600,40);//ubicacion y tamaño de la caja de texto
        //etiqueta4.setForeground(Color.green);//color letra
        etiqueta4.setOpaque(false);
        etiqueta4.setBackground(Color.WHITE);//color de fondo de la etiqueta
        etiqueta4.setFont(new Font("arial",Font.BOLD,30));
        
        JLabel etiqueta5 = new JLabel();
        etiqueta5.setText( "→ Placa del vehiculo" );//pregunta2
        etiqueta5.setBounds(200,450,300,40);//ubicacion y tamaño de la caja de texto
        //etiqueta5.setForeground(Color.green);//color letra
        etiqueta5.setOpaque(false);
        etiqueta5.setBackground(Color.WHITE);//color de fondo de la etiqueta
        etiqueta5.setFont(new Font("arial",Font.BOLD,30));
        
        JLabel etiqueta6 = new JLabel();
        etiqueta6.setText( "→ Nombre del protetario " );//pregunta3
        etiqueta6.setBounds(200,550,400,40);//ubicacion y tamaño de la caja de texto
        //etiqueta6.setForeground(Color.green);//color letra
        etiqueta6.setOpaque(false);
        etiqueta6.setBackground(Color.WHITE);//color de fondo de la etiqueta
        etiqueta6.setFont(new Font("arial",Font.BOLD,30));
        
        JLabel etiqueta7 = new JLabel();
        etiqueta7.setText( "→ Telefono del protetario " );//pregunta4
        etiqueta7.setBounds(200,650,400,40);//ubicacion y tamaño de la caja de texto
        //etiqueta7.setForeground(Color.green);//color letra
        etiqueta7.setOpaque(false);
        etiqueta7.setBackground(Color.WHITE);//color de fondo de la etiqueta
        etiqueta7.setFont(new Font("arial",Font.BOLD,30));
        
        JLabel etiqueta8 = new JLabel();//mensaje de exito
        etiqueta8.setText("→ DIA:");
        etiqueta8.setBounds(200,750,80,30);//ubicacion y tamaño de la caja de texto
        etiqueta8.setBackground(Color.WHITE);//color de fondo de la etiqueta
        etiqueta8.setFont(new Font("arial",Font.BOLD,20));
        
        JLabel etiqueta9 = new JLabel();//mensaje de exito
        etiqueta9.setText("→ MES:");
        etiqueta9.setBounds(400,750,80,30);//ubicacion y tamaño de la caja de texto
        etiqueta9.setBackground(Color.WHITE);//color de fondo de la etiqueta
        etiqueta9.setFont(new Font("arial",Font.BOLD,20));
        
        JLabel etiqueta10 = new JLabel();//mensaje de exito
        etiqueta10.setText("→ AÑO:");
        etiqueta10.setBounds(600,750,80,30);//ubicacion y tamaño de la caja de texto
        etiqueta10.setBackground(Color.WHITE);//color de fondo de la etiqueta
        etiqueta10.setFont(new Font("arial",Font.BOLD,20));
        
        ImageIcon Imagen = new ImageIcon("logoparqueadero.jpg");//llamado de imagen
        JLabel etiqueta2 = new JLabel();
        etiqueta2.setBounds(1000,180,600,600);
        etiqueta2.setIcon(new ImageIcon(Imagen.getImage().getScaledInstance(600,600,Image.SCALE_SMOOTH))); //tamaño de la imgaen ( largo, ancho, escalar)
       
        panel2.add(etiqueta);//poner etiqueta en el panel
        panel2.add(etiqueta3);//titulo registro
        panel2.add(etiqueta4);//pregunta1
        panel2.add(etiqueta5);//pregunta2
        panel2.add(etiqueta6);//pregunta3
        panel2.add(etiqueta7);//pregunta4
        panel2.add(etiqueta8);//DIA
        panel2.add(etiqueta9);//MES
        panel2.add(etiqueta10);//AÑO
        panel2.add(etiqueta2);//imagen parqeuadero
        
        //CAJA PLACA
        placa.setBounds(200,500,150,30);
        placa.setFont(new Font("arial",Font.PLAIN,25));
        
        //CAJA NOMBRE
        nombredu.setBounds(200,600,400,30);
        nombredu.setFont(new Font("arial",Font.PLAIN,25));
        
        //CAJA TELEFONO
        telefonodu.setBounds(200,700,400,30);
        telefonodu.setFont(new Font("arial",Font.PLAIN,25));
        
        //caja de dia
        diaE.setBounds(300,750,50,30);
        diaE.setFont(new Font("arial",Font.PLAIN,25));
        
        //caja de mes
        mesE.setBounds(500,750,50,30);
        mesE.setFont(new Font("arial",Font.PLAIN,25));
        
        //caja de año
        añoE.setBounds(700,750,100,30);
        añoE.setFont(new Font("arial",Font.PLAIN,25));
        
        
        panel2.add(placa);
        panel2.add(nombredu);
        panel2.add(telefonodu);
        panel2.add(diaE);
        panel2.add(mesE);
        panel2.add(añoE);
        
        
        JRadioButton ramoto = new JRadioButton("MOTO",true);
        ramoto.setBounds(200,350,100,50);
        panel2.add(ramoto);
        
        JRadioButton racarro = new JRadioButton("CARRO",false);
        racarro.setBounds(200,400,100,50);
        panel2.add(racarro);
        
        MouseListener Eve = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
             int res = comprobarcam();
                if(res == 1){
                    int renum = comprobarnum();
                        if(renum == 1){
                            String placav = placa.getText();
                            String nombredueño = nombredu.getText();
                            String telefonodueño = telefonodu.getText();
                            String tipov;
                            String diaEI = diaE.getText();
                            String mesEI = mesE.getText();
                            String añoEI = añoE.getText();

                            if(racarro.isSelected() == true){
                               tipov = racarro.getText();
                            }
                            else{
                               tipov = ramoto.getText();
                            }

                            VENTANAEXITO mandar = new VENTANAEXITO(placav,nombredueño,telefonodueño,tipov,diaEI);
                            mandar.setVisible(true);

                            
                            enviar.registrarpersonas(tipov, placav,nombredueño,telefonodueño,diaEI,mesEI,añoEI);
                            enviar.registrarinforme(tipov, placav,nombredueño,telefonodueño,diaEI,mesEI,añoEI);
                            setVisible(false);
                                        diaE.setText("");
                                        mesE.setText("");
                                        añoE.setText("");
                                    }
                            }
                            else{
                                JOptionPane.showMessageDialog(null, "POR FAVOR LLENAR LOS ESPACIOS EN BLANCO");
                                CONFIRMAR.setEnabled(false);
                            }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                int res = comprobarcam();
                if(res == 1){
                 CONFIRMAR.setEnabled(true);//sirve para activar/desactivar la interaccion del boton
                        
                }
                else{
                    CONFIRMAR.setEnabled(false);
                }
                
            String complaca = placa.getText();
            int resul = enviar.buscarsimilar(complaca);
            if(resul == 1){
                JOptionPane.showMessageDialog(null, "ESTA PLACA YA SE ENCUENTRA EN EL LUGAR");
                CONFIRMAR.setEnabled(false);
                 }
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                
            }
        };
                
        ActionListener Eve2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Numero1 llamar = new Numero1();
                //llamar.setVisible(true);
                setVisible(false);
                
            }    
        };
        
        CONFIRMAR.setBounds(400,850,200,100);
        CONFIRMAR.setEnabled(true);//sirve para activar/desactivar la interaccion del boton
        //REGISTRAR.setForeground(Color.ORANGE);//color de la letra del boton
        CONFIRMAR.setFont(new Font("arial",Font.BOLD,25));//establecer tipo de letra, negrilla,tamaño de letra
        CONFIRMAR.setMnemonic('a');//establecer un boton para activar boton alt + tecla
        CONFIRMAR.setBackground(Color.ORANGE);//establecer el color del fondo del boton
        CONFIRMAR.addMouseListener(Eve);
        panel2.add(CONFIRMAR);
        
        JButton REGRESAR = new JButton("VOLVER");
        REGRESAR.setBounds(1700,900,150,80);
        REGRESAR.setEnabled(true);//sirve para activar/desactivar la interaccion del boton
        //REGISTRAR.setForeground(Color.ORANGE);//color de la letra del boton
        REGRESAR.setFont(new Font("arial",Font.BOLD,25));//establecer tipo de letra, negrilla,tamaño de letra
        //REGRESAR.setMnemonic('a');//establecer un boton para activar boton alt + tecla
        REGRESAR.setBackground(Color.LIGHT_GRAY);//establecer el color del fondo del boton
        REGRESAR.addActionListener(Eve2);
        panel2.add(REGRESAR);
        
        ButtonGroup botonesradio = new ButtonGroup();
        botonesradio.add(ramoto);
        botonesradio.add(racarro);
        
    }
    
    private int comprobarcam(){
        
       if(diaE.getText().equals("")){
            return 0;
        }
        
        if(mesE.getText().equals("")){
            return 0;
        }
        
        if( añoE.getText().equals("")){
            return 0;
        }     
        
        if( placa.getText().equals("")){
            return 0;
        }
        
        if( nombredu.getText().equals("")){
            return 0;
        }
        
        if( telefonodu.getText().equals("")){
            return 0;
        }
        return 1;
       }
    
    private int comprobarnum(){
        
        int dia,mes,año;
        dia = Integer.parseInt(diaE.getText());
        mes = Integer.parseInt(mesE.getText());
        año = Integer.parseInt(añoE.getText());
        
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
