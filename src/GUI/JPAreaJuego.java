/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;



import java.awt.Graphics;
import javax.swing.JPanel;
import Dominio.Mapa;
import Dominio.Ruleta2;
import Utility.EstructuraMapa;
import Dominio.JFMensajeGanador;
import javax.swing.WindowConstants;

/**
 *
 * @author Jose Pablo
 */
public class JPAreaJuego extends JPanel{
    Mapa mapa2;
    //MensajeGanador mensaje;
    //EstructuraMapa mapa1;
    //Ruleta ruleta;
      public JPAreaJuego(){
        this.setSize(800,800);
         this.mapa2=new Mapa();
        //this.mensaje=new MensajeGanador();
        //this.mapa1= new EstructuraMapa();
       //this.ruleta=new Ruleta();
        //this.setFocusable(true);
       // this.requestFocus();
        //this.addKeyListener(this);
    }//constructor
     
        public void paintComponent(Graphics g){
            //this.mapa1.dibujar(g);
            
      this.mapa2.dibujar(g);
      //  this.mensaje.dibujar(g);
       //this.ruleta.dibujar(g);
    
    }//paintcomponent
}//Fin clase JPAreaJuego
