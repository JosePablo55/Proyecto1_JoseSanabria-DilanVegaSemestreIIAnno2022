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
    private int numeroCasilla;
    private String nombreUsuario;
    private ImageIcon fotoPerfil;
    //public int numJugadores;
    
    //Falta declarar la variable de la foto de perfil
    
    public Jugador(int posX, int posY){
        this.posX=posX;
        this.posY=posY;
        this.monedas=1;
        this.turno=0;//revisar esto
        this.nombreUsuario="";//revisar esto
        this.numeroCasilla = 0;
        this.fotoPerfil = new ImageIcon(getClass().getResource(""));
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
    
    public void setFotoPerfil(ImageIcon foto) {
        this.fotoPerfil = foto;
    }

    public ImageIcon getFotoPerfil() {
        return fotoPerfil;
    }

    public void setNumeroCasilla(int numeroCasilla) {
        this.numeroCasilla = numeroCasilla;
    }

    public int getNumeroCasilla() {
        return numeroCasilla;
    }
    
    public void dibujar(Graphics g){
       g.drawImage(fotoPerfil.getImage(), this.posX, this.posY,50,50, null);
    }//Fin metodo dibujar
    
    public void quitarMoneda(){
        if(this.monedas>=1)
            this.monedas=this.monedas-1;
        else
            this.monedas=0;
    }//Fin metodo quitarMoneda
    

}//Fin clase Jugador
