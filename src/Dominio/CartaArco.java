/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author Jose Pablo
 */
public class CartaArco extends Carta{
   
     public CartaArco(int posX, int posY) {
        super(posX, posY);
        this.num=2;
        try{
            this.imagen= ImageIO.read(getClass().getResourceAsStream("/Assets/espalda.png"));
        }catch(IOException e){
            System.out.println("Image cannot be found!");
        }
    }//Fin constructor

    @Override
    public void dibujar(Graphics g) {
        super.dibujar(g); 
        //g.setColor(Color.CYAN);
       //g.fillOval(this.posX, this.posY, 50, 50);
    }//Fin método dibujar

    @Override
    public void voltear(int voltea) {
        try {
            if(voltea == 1){
                this.imagen = ImageIO.read(getClass().getResourceAsStream("/Assets/arco.png"));
            }else{
                this.imagen= ImageIO.read(getClass().getResourceAsStream("/Assets/espalda.png"));
            }
        } catch (IOException ex) {
            Logger.getLogger(CartaAlabarda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
