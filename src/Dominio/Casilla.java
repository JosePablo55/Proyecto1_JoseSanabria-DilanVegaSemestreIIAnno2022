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

    public Casilla(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
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
    
    
}//Fin clase Casilla
