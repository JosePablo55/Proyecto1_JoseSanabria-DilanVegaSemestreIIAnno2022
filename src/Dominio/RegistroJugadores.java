/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

import GUI.JFRuleta;
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
    private JLabel label1,label2,label3, label4;
    private JButton boton1,boton2, boton3,boton4,boton5;
    public int num2;
    private ImageIcon imagenAvatar;
    Jugador jugador2[];
    private int nextJugador = 0, i=0, num=0,temp=0, numAvatar = 0;
    
    public RegistroJugadores(int num2){
        setLayout(null);
        setBounds(450,200,400,300);
        setTitle("Registro de Jugadores para el juego");
        setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        //Aquí terminan las configuraciones de la ventana
        label1=new JLabel("Usuario jugador:");
        label1.setBounds(10,10,250,30);
        add(label1);
        label2=new JLabel("Seleccione el Avatar");
        label2.setBounds(10,60,250,30);
        add(label2);
        label3=new JLabel("   ");
        label3.setBounds(10,30 , 250,30);
        add(label3);
        label3.setVisible(false);
      label4= new JLabel("Debe llenar este campo");
      label4.setBounds(10,30 , 250,30);
      add(label4);
      label4.setVisible(false);
      //Aquí termina de diseñarse la etiqueta para el num de jugadores
      textfield1=new JTextField();
      textfield1.setBounds(120, 15, 150, 20);
      add(textfield1); //Añadir el campo de texto a la ventana
      //Aquí termina de diseñarse el campo de texto
      boton1=new JButton("Confirmar");
      boton1.setBounds(10,200,100,30);
      add(boton1);
       boton2=new JButton("1");
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
      boton5.addActionListener(this);
      
      setVisible(true); //Se hace la ventana Visible
      
      this.num2=num2;
     this.jugador2=new Jugador[num2];
     
    }//Fin constructor
    
   @Override
    public void actionPerformed(ActionEvent e) {
        this.label3.setVisible(false);
        
        if(e.getSource() == this.boton1){ //BOTÓN DE CONFIRMACIÓN
            String name = this.textfield1.getText();
            if(!name.equals("")){
                boolean isDifferent = true;
                if(this.jugador2[0] != null){
                    for(int i = 0; i < jugador2.length; i++){
                        if(this.jugador2[i] != null){
                            if(jugador2[i].getNombreUsuario().equals(name)){
                                isDifferent = false;
                                break;
                            }
                        }
                    }
                }

                if(isDifferent){
                    if(this.imagenAvatar != null){
                        this.jugador2[nextJugador] = new Jugador(0, 0);
                        this.jugador2[nextJugador].setNombreUsuario(name);
                        this.jugador2[nextJugador].setFotoPerfil(this.imagenAvatar);
                        this.textfield1.setText("");
                        this.imagenAvatar = null;
                        nextJugador++;
                    }else{
                        this.label3.setText("Debe definir un avatar");
                        this.label3.setVisible(true);
                        //this.label3 = new JLabel("Debe definir un avatar");
                    }
                }else{
                    this.label3.setText("El usuario ingresado ya está registrado");
                    this.label3.setVisible(true);
                }

                if(jugador2[num2-1]!=null){  //jugador2[num2-1]!=null
                    System.out.println("true");
                    this.dispose();
                    JFRuleta ruleta= new JFRuleta(jugador2);
                    ruleta.setVisible(true);
                }
            }else{
                this.label3.setText("Debe ingresar un nombre válido");
                this.label3.setVisible(true);
            }
        } //BOTÓN DE CONFIRMACIÓN
        
        if(e.getSource() == this.boton2){
            this.imagenAvatar = new ImageIcon(getClass().getResource("/Assets/loro.png"));
        }
        
        if(e.getSource() == this.boton3){
            this.imagenAvatar = new ImageIcon(getClass().getResource("/Assets/pirata1.png"));
        }
        
        if(e.getSource() == this.boton4){
            this.imagenAvatar = new ImageIcon(getClass().getResource("/Assets/pirata2.png"));
        }
        
        if(e.getSource() == this.boton5){
            this.imagenAvatar = new ImageIcon(getClass().getResource("/Assets/pirata3.png"));
        }
    }//Fin metodo actionPerformed

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    
}//Fin claser RegistroJugadores
