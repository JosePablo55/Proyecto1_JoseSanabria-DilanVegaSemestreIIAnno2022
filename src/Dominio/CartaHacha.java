/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Jose Pablo
 */
public class CartaHacha extends Carta{
    
     public CartaHacha(int posX, int posY) {
        super(posX, posY);
        this.num=8;
        try{
            this.imagen= ImageIO.read(getClass().getResourceAsStream("/Assets/hacha.png"));
        }catch(IOException e){
            System.out.println("Image cannot be found!");
        }
    }//Fin constructor

    @Override
    public void dibujar(Graphics g) {
        super.dibujar(g);
        //g.setColor(Color.ORANGE);
       //g.fillOval(this.posX, this.posY, 50, 50);
    }//Fin método dibujar
    
 
}//Fin clase CartaHacha
