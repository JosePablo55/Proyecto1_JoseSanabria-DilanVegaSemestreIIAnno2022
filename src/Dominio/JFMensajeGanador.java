/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;




import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;


/**
 *
 * @author Jose Pablo
 */
public class JFMensajeGanador extends JFrame{
    JPanel panel;
    JLabel etiqueta1, etiqueta2;
    JTextArea area,area2;
    public JFMensajeGanador(){
    super("GANADOR DEL JUEGO");
        setLocation(180, 300);
        setSize(400, 200);
       setVisible(true);
       // setLayout(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        panel = new JPanel();
        add(panel);
       iniciarComponentes();
       
    }//Fin constructor
    
    public void iniciarComponentes(){
        /*
         g.setColor(Color.BLACK);   //g.setColor(Color.BLACK);
        g.drawString("JUGADOR GANADOR=" +0,195,90);
        g.drawString("MONEDAS OBTENIDAS= "+0,195,150);
        g.setColor(Color.BLUE);
        g.fillRect(195,100, 40,40);
     // g.drawImage(this.imagen2, this.posX,this.posY,null);  //Para poner la foto de perfil del ganador
        */
        panel=new JPanel();
        add(panel);
         setLayout(null);
        panel.setBackground(Color.CYAN);
        panel.setBounds(50, 30, 300,100);
        
        
        etiqueta1= new JLabel("JUGADOR GANADOR=");
        etiqueta1.setBounds(60,60,200,50);
        panel.add(etiqueta1);
       
        //setVisible(true);
        etiqueta2=new JLabel("MONEDAS OBTENIDAS=");
        etiqueta2.setBounds(60,130, 200, 50);
        panel.add(etiqueta2);
         
        setVisible(true);
       
    }//Fin método iniciarComponentes
    
    
}//Fin clase mensaje Ganador
