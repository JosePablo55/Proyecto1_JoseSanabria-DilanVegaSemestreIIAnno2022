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
        //this.botonInicioJuego.setBounds();
        
        this.setVisible(true);
        
        this.cargarRuleta();
        
        
    }//Fin constructor

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        this.ruleta.dibujar(this.getGraphics());
        g.setColor(Color.WHITE);
        g.fillRect(300,300, 50, 50);
        g.setColor(Color.BLACK);
        g.drawString("" + this.turnoRandom, 325, 325);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == giraRuletaBtn){
            delay = (int) (Math.random() * 10 + 1);
            this.giraRuletaTimer.start();
        }
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
                if(delay >= 200){
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
                        label=new JLabel(""+jugadores[nextJugador].getTurno());
                        label.setBounds(315, 215, 150, 150);
                        add(label);
                        label.setVisible(true);
                        
                        nextJugador++;
                    }
                    
                    if(nextJugador == jugadores.length){
                        //dispose();
                    }
                }
                
                repaint();
            }
        });
    }
}