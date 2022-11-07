/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

/**
 *
 * @author Jose Pablo
 */
public class FotoPerfil {
    private int posX;
    private int posY;
    private BufferedImage imagen;
    
    public FotoPerfil(int posX, int posY){
        this.posX=posX;
        this.posY=posY;
        
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
    
    public void dibujar(Graphics g){
        g.setColor(Color.red);
        g.fillOval(this.posX, this.posY, 50, 50);
        
    }//Fin método dibujar
    
    
}//Fi n clase FotoPerfil
