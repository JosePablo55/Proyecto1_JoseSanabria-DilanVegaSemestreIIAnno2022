/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author Jose Pablo
 */
public class Ruleta {
    private ImageIcon imagenRuleta;
    private int numeroImagen;
    private int numeroRandom;
    
    public Ruleta(){
        this.imagenRuleta = new ImageIcon(getClass().getResource("/Assets/bola0.png"));
        this.numeroImagen = 0;
        this.numeroRandom = 0;
    }
    
    public void addNumeroImagen(){
        if(this.numeroImagen == 13){
            this.numeroImagen = 0;
        }else{
            this.numeroImagen++;
        }
    }
    
    public int getNumeroImagen(){
        return this.numeroImagen;
    }
    
    public void setImagenRuleta(String path){
        this.imagenRuleta = new ImageIcon(getClass().getResource(path));
    }
    
    public ImageIcon getImagenRuleta(){
        return this.imagenRuleta;
    }
    
    public void dibujar(Graphics g){
        g.drawImage(this.imagenRuleta.getImage(), 140, 85, 350, 350, null);
    }
}
