/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.Timer;

/**
 *
 * @author Jose Pablo
 */
public class Ruleta2 extends JFrame implements ActionListener{
    JLabel etiqueta1;
    Timer tiempo1;
    int t;
    ImageIcon triangulo;
    String imagenes[]={"Ruleta/recursos/triangulo.png",};
    public int num;
    public Jugador jugador[];
    public Ruleta2(){  //Jugador jugador[]
         this.setSize(600, 600);
        //tiempo1=new Timer(50, this);
        //tiempo1.start();
         etiqueta1 = new JLabel("1566"); //esta etiqueta va ser para colocar el numero aleatorio en el centro de la ruleta
         
        etiqueta1.setBounds(580, 590,50,50);
        add(etiqueta1);
        this.num=num;
        this.jugador=jugador;
                this.setVisible(true);
       
    }//Fin constructor
/*
    @Override
    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    */
    
    
    //public void dibujar(Graphics g){
        //g.setColor(Color.red);
        //g.drawOval(200,50, 350, 350);
        
        /*
        //PRIMER TRIANGULO
        //A=340,80
        //B=380,80
        //C=360,140
        int puntosX1[]={340,380,360};
        int puntosY1[]={80,80,140};
        g.setColor(Color.RED);
        g.fillPolygon(puntosX1, puntosY1, 3);
        
        //SEGUNDO TRIANGULO
        //B=380,80
        //H=420,120
        //C=360,140
        int puntosX2[]={380,420,360};
        int puntosY2[]={80,120,140};
        g.setColor(Color.BLUE);
        g.fillPolygon(puntosX2, puntosY2, 3);
        
        //TERCER TRIANGULO
        //H=420,120
        //E=420,160
        //C=360,140
        int puntosX3[]={420,420,360};
        int puntosY3[]={120,160,140};
        g.setColor(Color.CYAN);
        g.fillPolygon(puntosX3, puntosY3, 3);
        
         //CUARTO TRIANGULO
         //E=420,160
         //G=380,200
        //C=360,140
        int puntosX4[]={420,380,360};
        int puntosY4[]={160,200,140};
        g.setColor(Color.ORANGE);
        g.fillPolygon(puntosX4, puntosY4, 3);
        
        //QUINTO TRIANGULO
        //G=380,200
        //D=340,200
        //C=360,140
        int puntosX5[]={380,340,360};
        int puntosY5[]={200,200,140};
        g.setColor(Color.YELLOW);
        g.fillPolygon(puntosX5, puntosY5, 3);
        
        //SEXTO TRIANGULO
        //D=340,200
        //F=300,160
        //C=360,140
        int puntosX6[]={340,300,360};
        int puntosY6[]={200,160,140};
        g.setColor(Color.PINK);
        g.fillPolygon(puntosX6, puntosY6, 3);
        
        //SEPTIMO TRANGULO
        //F=300,160
        //I=300,120
        //C=360,140
        int puntosX7[]={300,300,360};
        int puntosY7[]={160,120,140};
        g.setColor(Color.MAGENTA);
        g.fillPolygon(puntosX7, puntosY7, 3);
        
        //OCTAVO TRIANGULO
        //I=300,120
        //A=340,80
        //C=360,140
        int puntosX8[]={300,340,360};
        int puntosY8[]={120,80,140};
        g.setColor(Color.GREEN);
        g.fillPolygon(puntosX8, puntosY8, 3);
      */
        public void dibujar(Graphics g){
            
        //PRIMER TRIANGULO
        //A=320,80
        //B=400,80
        //C=360,180
        int puntosX1[]={320,400,360};
        int puntosY1[]={80,80,180};
        g.setColor(Color.RED);
        g.fillPolygon(puntosX1, puntosY1, 3);
            
        //SEGUNDO TRIANGULO
        //B=400,80
        //H=480,140
        //C=360,180
        int puntosX2[]={400,480,360};
        int puntosY2[]={80,140,180};
        g.setColor(Color.BLUE);
        g.fillPolygon(puntosX2, puntosY2, 3);
        
        //TERCER TRIANGULO
        //H=480,140
        //E=480,220
        //C=360,180
        int puntosX3[]={480,480,360};
        int puntosY3[]={140,220,180};
        g.setColor(Color.CYAN);
        g.fillPolygon(puntosX3, puntosY3, 3);
        
         //CUARTO TRIANGULO
         //E=480,220
         //G=400,280
        //C=360,180
        int puntosX4[]={480,400,360};
        int puntosY4[]={220,280,180};
        g.setColor(Color.ORANGE);
        g.fillPolygon(puntosX4, puntosY4, 3);
        
        //QUINTO TRIANGULO
        //G=400,280
        //D=320,280
        //C=360,180
        int puntosX5[]={400,320,360};
        int puntosY5[]={280,280,180};
        g.setColor(Color.YELLOW);
        g.fillPolygon(puntosX5, puntosY5, 3);
        
        //SEXTO TRIANGULO
        //D=320,280
        //F=240,220
        //C=360,180
        int puntosX6[]={320,240,360};
        int puntosY6[]={280,220,180};
        g.setColor(Color.PINK);
        g.fillPolygon(puntosX6, puntosY6, 3);
        
        //SEPTIMO TRANGULO
        //F=240,220
        //I=240,140
        //C=360,180
        int puntosX7[]={240,240,360};
        int puntosY7[]={220,140,180};
        g.setColor(Color.MAGENTA);
        g.fillPolygon(puntosX7, puntosY7, 3);
        
        //OCTAVO TRIANGULO
        //I=240,140
        //A=320,80
        //C=360,180
        int puntosX8[]={240,320,360};
        int puntosY8[]={140,80,180};
        g.setColor(Color.GREEN);
        g.fillPolygon(puntosX8, puntosY8, 3);
        
        
        //CIRCULO DEL CENTRO
        g.setColor(Color.WHITE);
        g.fillOval(340, 160, 40, 40);
       
    }//Fin clase dibujar

    @Override
    public void actionPerformed(ActionEvent e) {
     
      
    }//Fin metodo
    
    public void AsignarNum(){
        for(int i=0;i<num;i++){
            int num2=(int)(Math.random()*(12-1+1)+1);
            jugador[i].setTurno(num2);
        }//Fin for
        
    }//Fin metodo AsignarNum
    
    
      
}//Fin clase Ruleta
