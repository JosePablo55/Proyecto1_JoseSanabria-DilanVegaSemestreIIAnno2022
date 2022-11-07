/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import Utility.NumJugadores;
import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author Jose Pablo
 */
public class RegistroJugadores extends JFrame implements ActionListener {
private JTextField textfield1;
  private JLabel label1,label2,label3;
  private JButton boton1,boton2, boton3,boton4,boton5;
  public int num2;
  private ImageIcon imagen1,imagen2,imagen3,imagen4;
  Jugador jugador2[];
  public JFrame ventana;
    
  public RegistroJugadores(int num2){
     setLayout(null);
      setBounds(450,200,400,300);
      setTitle("Registro de Jugadores");
      setResizable(false);
      setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      //Aquí terminan las configuraciones de la ventana
      label1=new JLabel("Usuario jugador:");
      label1.setBounds(10,10,250,30);
      add(label1);
      label2=new JLabel("Seleccione el Avatar");
      label2.setBounds(10,60,250,30);
      add(label2);
      label3=new JLabel("El usuario ingresado ya está registrado");
      label3.setBounds(10,30 , 250,30);
      add(label3);
      label3.setVisible(false);
      //Aquí termina de diseñarse la etiqueta para el num de jugadores
      textfield1=new JTextField();
      textfield1.setBounds(120, 15, 150, 20);
      add(textfield1); //Añadir el campo de texto a la ventana
      //Aquí termina de diseñarse el campo de texto
      boton1=new JButton("Confirmar");
      boton1.setBounds(10,200,100,30);
      add(boton1);
       boton2=new JButton("1");
       this.imagen1=new ImageIcon("/src/Assets/loro.png");
       boton2.setIcon(imagen1);
       boton2.setIconTextGap(2);
       boton2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boton2.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
         boton2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
          boton2.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
      boton2.setBounds(10,100,50,50);
      add(boton2);
      boton3=new JButton("2");
      boton3.setBounds(90,100,50,50);
      add(boton3);
      boton4=new JButton("3");
      boton4.setBounds(170,100,50,50);
      add(boton4);
      boton5=new JButton("4");
      boton5.setBounds(250,100,50,50);
      add(boton5);
      
      //Aquí termina de diseñarse el boton
      boton1.addActionListener(this); //inicializar escuchar el boton
      boton2.addActionListener(this);
      boton3.addActionListener(this);
      boton4.addActionListener(this);
      
      setVisible(true); //Se hace la ventana Visible
      
      this.num2=num2;
     this.jugador2=new Jugador[num2];
     ventana=this;
    }//Fin constructor
  
    int i=0;
   @Override
    public void actionPerformed(ActionEvent e) {
        //El siguiente ciclo for es para evitar que al correr el código devuelva error de null en jugador2[i]
        for(int r=0;r<num2;r++){
           // jugador2[r]=new Jugador(0, 0);
        }//Fin for
        
        //NumJugadores num=new NumJugadores();
        //dispose();
        //for(int i=0;i<num2;i++){
        boolean esDiferente=true;
       if(e.getSource()==boton1){
         String usuario=textfield1.getText();
         //jugador2[i].setNombreUsuario(usuario);
         if(jugador2[0]!=null){
             
             for(int j=0;j<jugador2.length;j++){
                 if(jugador2[j]!=null){
                     if(jugador2[j].getNombreUsuario().equals(usuario)){
                         esDiferente=false;
                         break;
                     }else{
                         esDiferente=true;
                     }
                 }     
             }//Fin for 
       }//Fin else
         if(esDiferente==true){
             jugador2[i]=new Jugador(0,0);
          jugador2[i].setNombreUsuario(usuario);
          i++; 
         }else{
             System.out.println("1");
             label3.setVisible(true);
         }
            
       }
       if(e.getSource()==boton2){
           jugador2[i].setFotoPerfil1(new ImageIcon(getClass().getResource("/Assets/loro.png")));
           System.out.println("hola");
       }else if(e.getSource()==boton3){
         jugador2[i].setFotoPerfil2(new ImageIcon(getClass().getResource("/Assets/pirata1.png")));
       }  if(e.getSource()==boton4){
          jugador2[i].setFotoPerfil3(new ImageIcon(getClass().getResource("/Assets/pirata2.png")));
       } else if(e.getSource()==boton5){
          jugador2[i].setFotoPerfil4(new ImageIcon(getClass().getResource("/Assets/pirata3.png")));
       }
       textfield1.setText(null);
       if(jugador2[num2-1]!=null){
           this.dispose();
       }
       //i++;
        //}//Fin for
    }//Fin metodo actionPerformed

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    
}//Fin claser RegistroJugadores
