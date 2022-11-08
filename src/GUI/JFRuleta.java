/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import Dominio.Jugador;
import Dominio.Ruleta;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author Jose Pablo
 */
public class JFRuleta extends JFrame implements ActionListener{
    private Ruleta ruleta;
    private Jugador jugadores[];
    private JButton giraRuletaBtn, botonInicioJuego;
    private Timer giraRuletaTimer;
    private int delay, nextJugador = 0, turnoRandom = 0;
    JLabel label;
  
    
    public JFRuleta(Jugador jugadores[]){
        this.setLayout(null);
        this.setSize(600, 600);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        this.ruleta = new Ruleta();
        this.jugadores = jugadores;
        
        this.giraRuletaBtn = new JButton("GIRAR");
        this.giraRuletaBtn.setBounds(10, 10, 100, 50);
        this.giraRuletaBtn.addActionListener(this);
        add(this.giraRuletaBtn);
        
        this.botonInicioJuego=new JButton("INICIAR JUEGO");
       this.botonInicioJuego.setBounds(220,450,180,50);
       add(botonInicioJuego);
       botonInicioJuego.setVisible(false);
       botonInicioJuego.addActionListener(this);
        this.setVisible(true);
        
        this.cargarRuleta();
        this.label=new JLabel("");
        label.setBounds(440,10,170,50);
        add(label);
        label.setVisible(false);
        
        
    }//Fin constructor

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        this.ruleta.dibujar(this.getGraphics());
        g.setColor(Color.WHITE);
        g.fillRect(290,235, 50, 50);
        g.setColor(Color.BLACK);
        g.drawString("" + this.turnoRandom, 310, 266);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == giraRuletaBtn){
           label.setText("TURNO DE "+jugadores[nextJugador].getNombreUsuario());
           label.setVisible(true);
            delay = (int) (Math.random() * 10 + 1);
            this.giraRuletaTimer.start();
        }
          if(e.getSource()==botonInicioJuego){
           dispose();
           JFVentanaPrincipal ventana= new JFVentanaPrincipal(this.jugadores);
           ventana.setVisible(true);
          }//Fin if
    }
    
    public void cargarRuleta(){
        this.giraRuletaTimer = new Timer(delay, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //HAY QUE CAMBIAR LAS IMÁGENES DE LA RULETA
                String path = "/Assets/bola"+ ruleta.getNumeroImagen() +".png";
                ruleta.setImagenRuleta(path);
                ruleta.addNumeroImagen();
                turnoRandom = (int) (Math.random() * 12 + 1);
                delay = delay + 2;
                giraRuletaTimer.setDelay(delay);
                if(delay >= 100){
                    boolean turnoExiste = false;
                    for(int i = 0; i < jugadores.length; i++){
                        if(jugadores[i].getTurno() == turnoRandom){
                            turnoExiste = true;
                            break;
                        }
                    }
                    
                    if(turnoExiste==false){ //!turnoExiste
                        jugadores[nextJugador].setTurno(turnoRandom);
                        System.out.println("J: " + jugadores[nextJugador].getNombreUsuario());
                        System.out.println("T: " + jugadores[nextJugador].getTurno());
                        
                        giraRuletaTimer.stop();
                        label.setText("TURNO DE "+jugadores[nextJugador].getNombreUsuario()+ ": " + turnoRandom);
                        label.setVisible(true);
                        nextJugador++;
                    }
                    
                    if(nextJugador == jugadores.length){
                        //dispose();
                        botonInicioJuego.setVisible(true);
                      
                       
                    }
                }
                
                repaint();
            }
        });
    }
}