/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Jose Pablo
 */
public class Jugador {
    private int posX;
    private int posY;
    private int turno;
    private int monedas;
    public String nombreUsuario;
    public ImageIcon fotoPerfil1,fotoPerfil2,fotoPerfil3,fotoPerfil4;
    //public int numJugadores;
    
    //Falta declarar la variable de la foto de perfil
    
    public Jugador(int posX, int posY){
        this.posX=posX;
        this.posY=posY;
        this.monedas=1;
        this.turno=0;//revisar esto
        this.nombreUsuario="";//revisar esto
        
        try{
           fotoPerfil1=new ImageIcon(getClass().getResource("/Assets/loro.png"));
           fotoPerfil2=new ImageIcon(getClass().getResource("/Assets/pirata1.png"));
           fotoPerfil3=new ImageIcon(getClass().getResource("/Assets/pirata2.png"));
           fotoPerfil4=new ImageIcon(getClass().getResource("/Assets/pirata3.png"));
        }catch(Exception e){
            System.out.println("Image cannot be found!");
        }//Fin catch
    }//Fin constructor

    public int getPosX() {
        return posX;
    }//Fin metodo de acceso getPosX

    public void setPosX(int posX) {
        this.posX = posX;
    }//Fin método de acceso setPosX

    public int getPosY() {
        return posY;
    }//Fin método de acceso getPosY

    public void setPosY(int posY) {
        this.posY = posY;
    }//Fin método de acceso setPosY

    public int getTurno() {
        return turno;
    }//Fin método de acceso getTurno

    public void setTurno(int turno) {
        this.turno = turno;
    }//Fin método de acceso setTurno

    public int getMonedas() {
        return monedas;
    }//Fin método de acceso getMonedas

    public void setMonedas(int monedas) {
        this.monedas = monedas;
    }//Fin método de acceso setMonedas

    public String getNombreUsuario() {
        return nombreUsuario;
    }//Fin método de acceso getNombreUsuario

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }//Fin método de acceso setNombreUsuario

    public ImageIcon getFotoPerfil1() {
        return fotoPerfil1;
    }

    public void setFotoPerfil1(ImageIcon fotoPerfil1) {
        this.fotoPerfil1 = fotoPerfil1;
    }

    public ImageIcon getFotoPerfil2() {
        return fotoPerfil2;
    }

    public void setFotoPerfil2(ImageIcon fotoPerfil2) {
        this.fotoPerfil2 = fotoPerfil2;
    }

    public ImageIcon getFotoPerfil3() {
        return fotoPerfil3;
    }

    public void setFotoPerfil3(ImageIcon fotoPerfil3) {
        this.fotoPerfil3 = fotoPerfil3;
    }

    public ImageIcon getFotoPerfil4() {
        return fotoPerfil4;
    }

    public void setFotoPerfil4(ImageIcon fotoPerfil4) {
        this.fotoPerfil4 = fotoPerfil4;
    }

  
    
    

    /* public int getNumJugadores() {   //Revisar esto
        return numJugadores;
    } 

     public void setNumJugadores(int numJugadores) {   //Revisar esto
        this.numJugadores = numJugadores;
    } */
    
    
    public void dibujar(Graphics g){
        g.setColor(Color.BLACK);
        g.fillOval(this.posX, this.posY, 50, 50);
    }//Fin metodo dibujar
    
    public void quitarMoneda(){
        if(this.monedas>=1)
            this.monedas=this.monedas-1;
        else
            this.monedas=0;
    }//Fin metodo quitarMoneda
    

}//Fin clase Jugador
