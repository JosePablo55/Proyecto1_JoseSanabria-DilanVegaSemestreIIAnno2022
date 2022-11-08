/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

import javax.swing.JOptionPane;
import Utility.NumJugadores;
import java.awt.Graphics;
/**
 *
 * @author Jose Pablo
 */
public class Juego {
    Jugador jugadores[];
    NumJugadores num; //NumJugadores es la clase donde se pide el num jugadores
    Jugador jugador;
    Mapa mapa;
    
    
    public Juego( Jugador jugadores[]){
        this.jugadores=jugadores;  //Esto es con el cambio aplicado
        this.mapa= new Mapa();
        this.ordenarTurnosJugadores();
        this.colocarJugadores();
    }//Fin constructor
    

    public void ordenarTurnosJugadores() {
        Jugador temp;
        for (int i = 0; i < jugadores.length - 1; i++) {
            for (int j = 0; j < jugadores.length - 1; j++) {
                if (jugadores[j].getTurno() < jugadores[j + 1].getTurno()) {
                    temp = jugadores[j];
                    jugadores[j] = jugadores[j + 1];
                    jugadores[j + 1] = temp;
                }//Fin if
            }//Fin for j
        }//Fin for i
    }//Fin método 
    
    public void colocarJugadores(){
        this.jugadores[0].setPosX(this.mapa.getCasillaporID(0).getPosX());
        this.jugadores[0].setPosY(this.mapa.getCasillaporID(0).getPosY());
        int posiciones=(int) this.mapa.getCasillas().length/this.jugadores.length;  
        for (int i=0; i < this.jugadores.length; i++) {
            int casilla = posiciones * i;
            if (casilla == 24) {
                this.jugadores[i].setPosX(this.mapa.getCasillaporID(casilla-1).getPosX());
                this.jugadores[i].setPosY(this.mapa.getCasillaporID(casilla-1).getPosY());
            }else{
                this.jugadores[i].setPosX(this.mapa.getCasillaporID(casilla).getPosX());
                this.jugadores[i].setPosY(this.mapa.getCasillaporID(casilla).getPosY());
            }
        }
        
    }//Fin metodo
    
    public void dibujar(Graphics g){
        this.mapa.dibujar(g);
        for(int i=0;i<this.jugadores.length;i++){
            this.jugadores[i].dibujar(g);
        }
    }
    
    //Completar bien el método TurnoJuego con los métodos que hacen falta(jugadores colocados)
    //Discutir si este método va más bien en el JPAreaJuego
    public void TurnoJuego(){ 
        boolean finJuego=false;
        int i=0;
        do{
          
            
         if(jugadores[i].getMonedas()==jugadores.length){
             finJuego=true;
         }//Fin if
         
         if(i==jugadores.length-1){
             i=0;
         }else{
             i++;
         }//Fin else
         
    }while(finJuego==false);
    }//Fin método TurnoJuego

    public Jugador[] getJugadores() {
        return this.jugadores;
    }

    public void setJugadores(Jugador[] jugadores) {
        this.jugadores = jugadores;
    }

    public Mapa getMapa() {
        return mapa;
    }

    public void setMapa(Mapa mapa) {
        this.mapa = mapa;
    }
    
    
}//Fin clase Juego
