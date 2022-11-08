/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;



import java.awt.Graphics;
import javax.swing.JPanel;
import Dominio.Juego;
import Dominio.Jugador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author Jose Pablo
 */
public class JPAreaJuego extends JPanel implements MouseListener{
    private Juego juego;
    private JLabel label,label2;
    private int numTurno;
    private Jugador jugadores[];
    private Timer timerCartas, timerCambiaTurnos, timerVerificaGameOver;
    private int delay, idCartaVoltear;
    private boolean  isClicked, cambiaTurno;
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
        this.delay=1;
        this.isClicked = false;
        this.cambiaTurno = false;
        this.cargarTimerCartas();
        this.cargarTImerCambiaTurnos();
        this.cargarTimerVerificaGameOver();
        this.numTurno = 0;
        this.addMouseListener(this);
    }//constructor

    public void cargarTimerCartas(){
        this.timerCartas= new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Todo lo que el timer va hacer va a estar aquí
                if(delay!=6){
                    delay++;
                }else{
                    timerCartas.stop();
                    //Voltear a espalda de nuevo
                    juego.getMapa().voltearCarta(idCartaVoltear, 0);
                    delay = 1;
                    isClicked = false;
                    cambiaJugadorCasilla();
                    if(numTurno == (jugadores.length - 1)){
                        numTurno = 0;
                    }else{
                        numTurno++;
                    }
                    cambiaTurno = true;
                }
                repaint();
            }
        });
    }
    
    public void cargarTImerCambiaTurnos(){
        this.timerCambiaTurnos = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(cambiaTurno){
                    label.setText("TURNO DE : " + jugadores[numTurno].getNombreUsuario());
                    label2.setText("MONEDAS: " + jugadores[numTurno].getMonedas());
                    cambiaTurno = false;
                }
            }
        });
        this.timerCambiaTurnos.start();
    }
    
    public void cargarTimerVerificaGameOver(){
        this.timerVerificaGameOver = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for(int i = 0; i < jugadores.length; i++){
                    if(jugadores.length == jugadores[i].getMonedas()){
                        System.out.println("GAME OVER.");
                        System.out.println("WINNER: " + jugadores[i].getNombreUsuario());
                    }
                }
            }
        });
        this.timerVerificaGameOver.start();
    }
    
    public void cambiaJugadorCasilla() {
        //guardamos la siguiente casilla
        int nextCasilla = this.jugadores[numTurno].getNumeroCasilla() + 1;
        if(nextCasilla > 23){
            nextCasilla = 0;
        }
        int hayJugador = -1;
        //preguntamos si la siguiente casilla está ocupada
        if (this.juego.getMapa().getCasillaporID(nextCasilla).estaOcupada()) {
            //buscamos la posición del jugador de esa casilla en el array
            hayJugador = this.juego.getIdJugadorPorTurno(this.juego.getMapa().getCasillaporID(nextCasilla).getJugador().getTurno());
            //al estar ocupada, si es la 23, debe saltar a la 0 o solo le suma 1
            if (nextCasilla == 23) {
                nextCasilla = 0;
            } else {
                nextCasilla++;
            }
        }

        int tipoCartaVolteada = this.juego.getMapa().getCarta2porId(idCartaVoltear).getNum();
        int tipoSiguienteCarta = this.juego.getMapa().getCartaporId(nextCasilla).getNum();

        if (tipoCartaVolteada == tipoSiguienteCarta) {
            //al ser iguales se debe mover a la siguiente carta
            this.juego.getMapa().getCasillaporID(this.jugadores[numTurno].getNumeroCasilla()).setJugador(null);
            this.juego.getMapa().getCasillaporID(nextCasilla).setJugador(this.jugadores[numTurno]);
            this.jugadores[numTurno].setPosX(this.juego.getMapa().getCasillaporID(nextCasilla).getPosX());
            this.jugadores[numTurno].setPosY(this.juego.getMapa().getCasillaporID(nextCasilla).getPosY());
            this.jugadores[numTurno].setNumeroCasilla(nextCasilla);
        }

        if (hayJugador != -1) {
            //si es diferente a -1 hay un jugador en la siguiente casilla y debemos robar moneda
            this.jugadores[numTurno].setMonedas(this.jugadores[numTurno].getMonedas() + 1);
            this.jugadores[hayJugador].quitarMoneda();
        }
        repaint();
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.juego.dibujar(g);
    }//paintcomponent

    @Override
    public void mouseClicked(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        if(this.juego.getMapa().checkCarta2porPosicion(x, y) && !isClicked){
            //debemos reconocer la carta
            idCartaVoltear = this.juego.getMapa().getIdCareta2PorPosicion(x, y);
            //indicar que se voltee
            this.juego.getMapa().voltearCarta(idCartaVoltear, 1);
            repaint();
            this.isClicked = true;
            timerCartas.start();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}
}//Fin clase JPAreaJuego
