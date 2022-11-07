/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

import javax.swing.JOptionPane;
import Utility.NumJugadores;
/**
 *
 * @author Jose Pablo
 */
public class Juego {
    Jugador jugadores[];
    NumJugadores num; //NumJugadores es la clase donde se pide el num jugadores
    Jugador jugador;
    Mapa mapa;
    
    
    public Juego(Mapa mapa, Jugador jugadores[]){
        this.jugadores=new Jugador[num.getNumJugadores()];  //Esto es con el cambio aplicado
        this.mapa=mapa;
    }//Fin constructor
    

   //Esto podría ir en la clase jugador
    /*
    public int numJugadores() {
        int numeroJugadores = 0;
        boolean temp1 = false;
        int num;
        do {
            num = Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "Numero de Jugadores", "Jugadores para la partida: \n -2 Jugadores \n -3 jugadores \n -4 jugadores \n "
                            + "Ingrese el numero de jugadores para la partida", JOptionPane.INFORMATION_MESSAGE));
            if (num >= 2 && num <= 4) {
                numeroJugadores = num;
                temp1 = true;
            } else {
                JOptionPane.showMessageDialog(null, "Error",
                        "El número ingresado no está dentro del rango de jugadores permitidos", JOptionPane.ERROR_MESSAGE);
                temp1 = false; //Esto está de más.
            }//Fin else
        } while (temp1 == false);
        return numeroJugadores;
    }//Fin método numJugadores
    */
    public void ordenarTurnosJugadores() {
        Jugador temp;
        for (int i = 0; i < jugadores.length - 1; i++) {
            for (int j = 0; j < jugadores.length - 1; j++) {
                if (jugadores[j].getTurno() > jugadores[j + 1].getTurno()) {
                    temp = jugadores[j];
                    jugadores[j] = jugadores[j + 1];
                    jugadores[j + 1] = temp;
                }//Fin if
            }//Fin for j
        }//Fin for i

    }//Fin método 
    
    
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
        return jugadores;
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
