/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author Jose Pablo
 */
public class CartaAlabarda extends Carta {
    
    public CartaAlabarda(int posX, int posY) {
        super(posX, posY);
        this.num=0;
        try{
            //EN EL CONSTRUCTOR NO DEBE SER ALABARDA, DEBE SER VOLTEADA
            this.imagen= ImageIO.read(getClass().getResourceAsStream("/Assets/espalda.png"));
        }catch(IOException e){
             e.printStackTrace();
        }
    }//Fin constructor

    @Override
    public void dibujar(Graphics g) {
        //super.dibujar(g); 
        g.drawImage(this.imagen, posX, posY, 50, 50, null);
    }//Fin método dibujar

    @Override
    public void voltear(int voltea) {
        try {
            if(voltea == 1){
                this.imagen = ImageIO.read(getClass().getResourceAsStream("/Assets/alabarda.png"));
            }else{
                this.imagen= ImageIO.read(getClass().getResourceAsStream("/Assets/espalda.png"));
            }
        } catch (IOException ex) {
            Logger.getLogger(CartaAlabarda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

  
    
    
    
    
    
    
}//Fin clase Alabarda
