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
import Dominio.Juego;
import Dominio.Jugador;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.Timer;
import javax.swing.WindowConstants;

/**
 *
 * @author Jose Pablo
 */
public class JPAreaJuego extends JPanel implements MouseListener{
    private Juego juego;
    private JLabel label,label2;
    private int numTurno=0;
    private Jugador jugadores[];
    private Timer timerCartas;
    private int delay;
    //MensajeGanador mensaje;
    //EstructuraMapa mapa1;
    //Ruleta ruleta;
    public JPAreaJuego(Jugador jugadores[]) {
        this.setSize(800, 800);
        this.juego = new Juego(jugadores);
        this.jugadores=this.juego.getJugadores();
       this.setLayout(null);
       this.label=new JLabel("TURNO DE : "+this.jugadores[0].getNombreUsuario());
       this.label.setBounds(610,10,180,50);
       add(label);
       label.setVisible(true);
       this.label2=new JLabel("MONEDAS : "+this.jugadores[0].getMonedas());
       this.label2.setBounds(610,25,180,50);
       add(label2);
       label2.setVisible(true);
    }//constructor

    public void paintComponent(Graphics g) {
        this.juego.dibujar(g);

    }//paintcomponent

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
       
    }

    @Override
    public void mouseReleased(MouseEvent e) {
       
    }

    @Override
    public void mouseEntered(MouseEvent e) {
       
    }

    @Override
    public void mouseExited(MouseEvent e) {
      
    }

    
    
    
    
    
    
    
    
    
}//Fin clase JPAreaJuego
