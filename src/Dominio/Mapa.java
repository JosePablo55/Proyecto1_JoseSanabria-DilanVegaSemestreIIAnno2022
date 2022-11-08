/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

import java.awt.Graphics;

import java.util.ArrayList;

/**
 *
 * @author Jose Pablo
 */
public class Mapa{
    //Se crea una clase Mapa porque las casillas deben de distibuirse de dos formas: casillas circulares(armas), y 
    //casillas de octagono(cartas), entonces a la hora de crear las cartas se podría hacer un arreglo para cada tipo.
    private Casilla casillas[];
    //private Casilla casillas2[];
    private Carta cartas[];
    private Carta cartas2[];
   // private Juego juego;  //eliminar este de esta clase
   // private Jugador jugadores[];  //eliminar este de esta clase
    public Mapa(){
     this.casillas=new Casilla[24];
     this.cartas=new Carta[24];
     this.cartas2=new Carta[12];
     
     ColocarCasillas();
    }//Fin constructor
    
   
    
    public void ColocarCasillas(){

       casillas[0]=new Casilla(350,30,0);
       casillas[1]=new Casilla(440,40,1);
       casillas[2]=new Casilla(510,60,2);
       casillas[3]=new Casilla(570,110,3);
       casillas[4]=new Casilla(620,180,4);
       casillas[5]=new Casilla(650,250,5);
       casillas[6]=new Casilla(670,320,6);
       casillas[7]=new Casilla(660,390,7);
       casillas[8]=new Casilla(640,450,8);
       casillas[9]=new Casilla(610,510,9);
       casillas[10]=new Casilla(540,550,10);
       casillas[11]=new Casilla(450,570,11);
       casillas[12]=new Casilla(350,580,12);
       casillas[13]=new Casilla(260,570,13);
       casillas[14]=new Casilla(170,550,14);
       casillas[15]=new Casilla(110,510,15);
       casillas[16]=new Casilla(70,450,16);
       casillas[17]=new Casilla(50,390,17);
       casillas[18]=new Casilla(40,320,18);
       casillas[19]=new Casilla(50,250,19);
       casillas[20]=new Casilla(70,180,20);
       casillas[21]=new Casilla(120,110,21);
       casillas[22]=new Casilla(180,60,22);
       casillas[23]=new Casilla(260,40,23);
       
        cartas2[0] = new Carta(350, 110);
        cartas2[1] = new Carta(180, 180);
        cartas2[2] = new Carta(510, 180);
        cartas2[3] = new Carta(350, 250);
        cartas2[4] = new Carta(120, 320);
        cartas2[5] = new Carta(260, 320);
        cartas2[6] = new Carta(440, 320);
        cartas2[7] = new Carta(570, 320);
        cartas2[8] = new Carta(350, 390);
        cartas2[9] = new Carta(180, 450);
        cartas2[10] = new Carta(510, 450);
        cartas2[11] = new Carta(350,510);
                
       //Colocar cartas en las casillas de manera aleatoria
       
       int r=0, cantidad2=24, rango2=24;
       int arreglo2[]= new int[cantidad2];
       
       arreglo2[r]=(int)(Math.random()*rango2);
        for (r = 1; r < cantidad2; r++) {
            arreglo2[r] = (int) (Math.random() * rango2);
            for (int j = 0; j < r; j++) {
                if (arreglo2[r] == arreglo2[j]){
                    r--;
                }//Fin if
            }//Fin for j
        }//Fin for r
       
       for(int kw=0;kw<cantidad2;kw++){
           if(arreglo2[kw]==0){
                this.cartas[kw] = new CartaAlabarda(casillas[kw].getPosX(), casillas[kw].getPosY());
           }else  if(arreglo2[kw]==1){
                this.cartas[kw] = new CartaAlfanaje(casillas[kw].getPosX(), casillas[kw].getPosY());
           }else if(arreglo2[kw]==2){
                this.cartas[kw] = new CartaArco(casillas[kw].getPosX(), casillas[kw].getPosY());
           }else if(arreglo2[kw]==3){
                this.cartas[kw] = new CartaBarco(casillas[kw].getPosX(), casillas[kw].getPosY());
           }else if(arreglo2[kw]==4){
                this.cartas[kw] = new CartaCanion(casillas[kw].getPosX(), casillas[kw].getPosY());
           }else if(arreglo2[kw]==5){
                this.cartas[kw] = new CartaDaga(casillas[kw].getPosX(), casillas[kw].getPosY());
           }else if(arreglo2[kw]==6){
                this.cartas[kw] = new CartaEsporton(casillas[kw].getPosX(), casillas[kw].getPosY());
           }else  if(arreglo2[kw]==7){
                this.cartas[kw] = new CartaGarfio(casillas[kw].getPosX(), casillas[kw].getPosY());
           }else  if(arreglo2[kw]==8){
                this.cartas[kw] = new CartaHacha(casillas[kw].getPosX(), casillas[kw].getPosY());
           }else if(arreglo2[kw]==9){
                this.cartas[kw] = new CartaMosquete(casillas[kw].getPosX(), casillas[kw].getPosY());
           }else  if(arreglo2[kw]==10){
                this.cartas[kw] = new CartaPedernal(casillas[kw].getPosX(), casillas[kw].getPosY());
           }else if(arreglo2[kw]==11){
                this.cartas[kw] = new CartaPistola(casillas[kw].getPosX(), casillas[kw].getPosY());
           }else if(arreglo2[kw]==12){
                this.cartas[kw] = new CartaAlabarda(casillas[kw].getPosX(), casillas[kw].getPosY());
           }else if(arreglo2[kw]==13){
                this.cartas[kw] = new CartaAlfanaje(casillas[kw].getPosX(), casillas[kw].getPosY());
           }else if(arreglo2[kw]==14){
                this.cartas[kw] = new CartaArco(casillas[kw].getPosX(), casillas[kw].getPosY());
           }else if(arreglo2[kw]==15){
                this.cartas[kw] = new CartaBarco(casillas[kw].getPosX(), casillas[kw].getPosY());
           }else if(arreglo2[kw]==16){
                this.cartas[kw] = new CartaCanion(casillas[kw].getPosX(), casillas[kw].getPosY());
           }else if(arreglo2[kw]==17){
                this.cartas[kw] = new CartaDaga(casillas[kw].getPosX(), casillas[kw].getPosY());
           }else if(arreglo2[kw]==18){
                this.cartas[kw] = new CartaEsporton(casillas[kw].getPosX(), casillas[kw].getPosY());
           }else if(arreglo2[kw]==19){
                this.cartas[kw] = new CartaGarfio(casillas[kw].getPosX(), casillas[kw].getPosY());
           }else if(arreglo2[kw]==20){
                this.cartas[kw] = new CartaHacha(casillas[kw].getPosX(), casillas[kw].getPosY());
           }else if(arreglo2[kw]==21){
                this.cartas[kw] = new CartaMosquete(casillas[kw].getPosX(), casillas[kw].getPosY());
           }else if(arreglo2[kw]==22){
                this.cartas[kw] = new CartaPedernal(casillas[kw].getPosX(), casillas[kw].getPosY());
           }else if(arreglo2[kw]==23){
                this.cartas[kw] = new CartaPistola(casillas[kw].getPosX(), casillas[kw].getPosY());
           }//Fin else
       }//Fin for
       
       
      
       //COLOCAR 12 CARTAS DENTRO DEL CIRCULO DE LAS CASILLAS
               int i=0, cantidad=12, rango=12;
       int arreglo[]= new int[cantidad];
       
       arreglo[i]=(int)(Math.random()*rango);
       for(i=1;i<cantidad;i++){
       arreglo[i]=(int)(Math.random()*rango);
       for(int jjj=0;jjj<i;jjj++){
          if(arreglo[i]==arreglo[jjj])
              i--;
       }//Fin for j
    }//Fin for i
       for(int k=0;k<cantidad;k++){
           if(arreglo[k]==0){
           this.cartas2[k] = new CartaAlabarda(cartas2[k].getPosX(),cartas2[k].getPosY());
           } else if(arreglo[k]==1){
                this.cartas2[k] = new CartaAlfanaje(cartas2[k].getPosX(),cartas2[k].getPosY());
           }else if(arreglo[k]==2){
                this.cartas2[k] = new CartaArco(cartas2[k].getPosX(),cartas2[k].getPosY());
           }else if(arreglo[k]==3){
                this.cartas2[k] = new CartaBarco(cartas2[k].getPosX(),cartas2[k].getPosY());
           }else if(arreglo[k]==4){
                this.cartas2[k] = new CartaCanion(cartas2[k].getPosX(),cartas2[k].getPosY());
           }else if(arreglo[k]==5){
                this.cartas2[k] = new CartaDaga(cartas2[k].getPosX(),cartas2[k].getPosY());
           }else if(arreglo[k]==6){
                this.cartas2[k] = new CartaEsporton(cartas2[k].getPosX(),cartas2[k].getPosY());
        }else if(arreglo[k]==7){
                this.cartas2[k] = new CartaGarfio(cartas2[k].getPosX(),cartas2[k].getPosY());
           }else if(arreglo[k]==8){
                this.cartas2[k] = new CartaHacha(cartas2[k].getPosX(),cartas2[k].getPosY());
           }else if(arreglo[k]==9){
                this.cartas2[k] = new CartaMosquete(cartas2[k].getPosX(),cartas2[k].getPosY());
           }else if(arreglo[k]==10){
                this.cartas2[k] = new CartaPedernal(cartas2[k].getPosX(),cartas2[k].getPosY());
         }else if(arreglo[k]==11){
                this.cartas2[k] = new CartaPistola(cartas2[k].getPosX(),cartas2[k].getPosY());
         }//Fin if
       }//Fin for
    }//Fin método ColocarCasillas
        
     public void dibujar(Graphics g){
      for(int i=0;i<casillas.length;i++){
          if(casillas[i]!=null)
            this.cartas[i].dibujar(g); 
        }//Fin for
       for(int i=0;i<cartas2.length;i++){
          if(cartas2[i]!=null)
          this.cartas2[i].dibujar(g);
        }//Fin for
        }//Fin metodo dibujar
    
     public Casilla getCasillaporID(int id){
         return this.casillas[id];
     }

    public Casilla[] getCasillas() {
        return casillas;
    }

    public void setCasillas(Casilla[] casillas) {
        this.casillas = casillas;
    }

    public Carta[] getCartas() {
        return cartas;
    }

    public void setCartas(Carta[] cartas) {
        this.cartas = cartas;
    }
  
//getCartas2 y setCartas2 son los metodos de acceso para las cartas del centro(util a la hora de compararla con la volteada)
    public Carta[] getCartas2() {
        return cartas2;
    }

    public void setCartas2(Carta[] cartas2) {
        this.cartas2 = cartas2;
    }

    

}//Fin clase Mapa
