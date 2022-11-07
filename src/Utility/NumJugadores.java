/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utility;

import Dominio.Jugador;
import Dominio.RegistroJugadores;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author Jose Pablo
 */
public class NumJugadores extends JFrame implements ActionListener{
    private JTextField textfield1;
  private JLabel label1,label2,label3;
  private JButton boton1;
  public Jugador jugador;
  public int numJugadores;
  
public NumJugadores(){
    setLayout(null);
      setBounds(450,300,400,200);
      setTitle("Numero de Jugadores");
      setResizable(false);
      setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      //Aquí terminan las configuraciones de la ventana
      label1=new JLabel("Número de Jugadores:");
      label1.setBounds(10,10,250,30);
      add(label1); //Añadir el label a la ventana
      label2= new JLabel("Nota: Min. 2 y Max. 4 jugadores");
      label2.setBounds(10,40,250,30);
      add(label2);
      //Aquí termina de diseñarse la etiqueta para el num de jugadores
      textfield1=new JTextField();
      textfield1.setBounds(150, 15, 150, 20);
      add(textfield1); //Añadir el campo de texto a la ventana
      //Aquí termina de diseñarse el campo de texto
      boton1=new JButton("Confirmar");
      boton1.setBounds(10,80,100,30);
      add(boton1);
      //Aquí termina de diseñarse el boton
      boton1.addActionListener(this); //inicializar escuchar el boton
      setVisible(true); //Se hace la ventana Visible
      setBackground(Color.yellow);
      this.numJugadores=numJugadores;
      

}//Fin constructor
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==boton1){
           
         int num=Integer.parseInt(textfield1.getText());
         if(num>=2 && num<=4){
             //setNumJugadores(num);
              this.dispose();
              
              
            RegistroJugadores registro=new RegistroJugadores(num);
            // registro.setNum2(num);
            registro.setVisible(true);
           
        
            this.dispose();
         
         }
        
     }
     
    }//Fin método actionPerformed
    
    public void actionPerformed2(ActionEvent e){
        if(e.getSource()==textfield1){
           
            
            
            
        }
    }//Fin método actionPerformed

    public int getNumJugadores() {
        return numJugadores;
    }

    public void setNumJugadores(int numJugadores) {
        this.numJugadores = numJugadores;
    }
    
    
    
    
    
}//Fin clase NumJugadores
