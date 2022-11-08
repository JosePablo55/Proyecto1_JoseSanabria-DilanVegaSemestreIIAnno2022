/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import Dominio.Jugador;
import javax.swing.JFrame;


/**
 *
 * @author Jose Pablo
 */
public class JFVentanaPrincipal extends JFrame{
    JPAreaJuego jpareajuego;
   
    public JFVentanaPrincipal(Jugador jugadores[]){
        
     super("Tesoro pirata");
        setSize(800,800);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.jpareajuego=new JPAreaJuego(jugadores);
        this.add(jpareajuego);
        setVisible(true);
        
    }//Fin constructor
    
}//Fin método ventanaprincipal
