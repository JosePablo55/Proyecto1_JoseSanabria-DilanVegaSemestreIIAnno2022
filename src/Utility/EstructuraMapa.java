/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utility;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Jose Pablo
 */
public class EstructuraMapa{
    //Se crea una clase Mapa porque las casillas deben de distibuirse de dos formas: casillas circulares(armas), y 
    //casillas de octagono(cartas), entonces a la hora de crear las cartas se podría hacer un arreglo para cada tipo.
    public EstructuraMapa(){
        
    }
public void dibujar(Graphics g){
    
    //Estructura de las casillas
    
    g.drawOval(40,320,50,50); //Circulo izquierda
    g.drawOval(50,250,50,50); //Circulo izquierda-arriba 1
    g.drawOval(70,180,50,50); //Circulo izquierda-arriba 2
    g.drawOval(120,110,50,50); //Criculo izquierda-arriba 3
    g.drawOval(180,60,50,50); //Circulo izquierda-arriba 4
    g.drawOval(260,40,50,50); //Circulo izquierda-arriba 5
    g.drawOval(350, 30, 50, 50); //Circulo arriba
    g.drawOval(440, 40, 50, 50); //Circulo arriba-derecha 1
    g.drawOval(510, 60, 50, 50); //Circulo arriba-derecha 2
    g.drawOval(570, 110, 50, 50); //Circulo arriba-derecha 3
    g.drawOval(620, 180, 50, 50); //Circulo arriba-derecha 4
    g.drawOval(650, 250, 50, 50); //Circulo arriba-derecha 5
    g.drawOval(670,320,50,50); //Circulo derecha
    g.drawOval(660,390,50,50); //Circulo derecha-abajo 1
    g.drawOval(640,450,50,50); //Circulo derecha-abajo 2
    g.drawOval(610,510,50,50); //Circulo derecha-abajo 3
    g.drawOval(540,550,50,50); //Circulo derecha-abajo 4
    g.drawOval(450,570,50,50); //Circulo derecha-abajo 5
    g.drawOval(350, 580, 50, 50); //Circulo abajo
    g.drawOval(260,570, 50, 50); //Circulo abajo-izquierda 1
    g.drawOval(170,550, 50, 50); //Circulo abajo-izquierda 2
    g.drawOval(110,510, 50, 50); //Circulo abajo-izquierda 3
    g.drawOval(70,450, 50, 50); //Circulo abajo-izquierda 4
    g.drawOval(50,390, 50, 50); //Circulo abajo-izquierda 5
    
    
  //Estructura de las cartas que van dentro del criculo de las casillas
 
  g.drawOval(350,110,50,50); //Carta fila 1 
  g.drawOval(180,180,50,50); //Carta fila 2 columna 1
  g.drawOval(510,180,50,50); //Carta fila 2 columna 2
  g.drawOval(350, 250, 50, 50);   //Carta fila 3
  g.drawOval(120,320,50,50); //Carta fila 4 columna 1
  g.drawOval(260,320,50,50); //Carta fila 4 columna 2
  g.drawOval(440,320,50,50); //Carta fila 4 columna 3
  g.drawOval(570,320,50,50); //Carta fila 4 columna 4
  g.drawOval(350, 390, 50, 50);   //Carta fila 5
  g.drawOval(180,450,50,50); //Carta fila 6 columna 1
  g.drawOval(510,450,50,50); //Carta fila 6 columna 2
  g.drawOval(350, 510, 50, 50);   //Carta fila 7
  
  
  
    
    
    
    
    
    
    
}//Fin método dibujar
}//Fin clase Mapa
