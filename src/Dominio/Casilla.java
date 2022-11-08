/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

/**
 *
 * @author Jose Pablo
 */
public class Casilla {
    //Preguntar si las casillas sería lo mismo que el mapa(?)
    private int posX;
    private int posY;
    private int iD;
    private int tipoCarta;
    private Jugador jugador;

    public Casilla(int posX, int posY, int iD) {
        this.posX = posX;
        this.posY = posY;
        this.iD=iD;
        this.tipoCarta = 0;
        this.jugador = null;
    }//Fin constructor

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public void setTipoCarta(int tipoCarta) {
        this.tipoCarta = tipoCarta;
    }

    public int getTipoCarta() {
        return tipoCarta;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public Jugador getJugador() {
        return jugador;
    }
    
    public boolean estaOcupada(){
        if(this.jugador != null){
            return true;
        }
        return false;
    }
    
}//Fin clase Casilla
