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

    public Casilla(int posX, int posY, int iD) {
        this.posX = posX;
        this.posY = posY;
        this.iD=iD;
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
    
    
    
    
}//Fin clase Casilla
