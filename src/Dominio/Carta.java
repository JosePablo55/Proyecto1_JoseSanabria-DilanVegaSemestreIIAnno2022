/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

/**
 *
 * @author Jose Pablo
 */
public class  Carta {
    protected BufferedImage imagen;
    protected int posX;
    protected int posY;
    protected int num;
 
    public Carta(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
       // this.num=getNum();
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

    public int getNum() {
        return num;
    }
 
    //agregar metodo public void voltear que lo que desempeñe sea la accion de cambairle
 
    
public void dibujar(Graphics g){
     g.drawImage(this.imagen, this.posX,this.posY,50,50,null);
}//Fin método dibujar

public void voltear(int voltea){}
}//Fin clase Carta
