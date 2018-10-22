/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infinityGame;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Jeremias
 */
public class Juego_Infinity {
    
    public static void main(String[]args ){
   int casillas;
    Scanner leer = new Scanner(System.in);
    Random azar = new Random();
   
    
    System.out.println("ingrese cuantos casilleros tendra su juego?... (debe ser mayor a 20.)");
    casillas = leer.nextInt();
       
   char tablero[] = new char[casillas];
   
   tablero(tablero,casillas,azar);
   mostrarTablero(tablero,casillas);
    
    } 
    
    public static void tablero(char tablero[] ,int casillas, Random azar){
        
        char juego[]= {'b','p','s'};
        juego[0]= 'i';
        juego[casillas-1]= 'f';
        for (int i=0;i<casillas;i++) {
            int random =azar.nextInt(4);
          tablero[i]= juego[random];
        }
    }
    public static void mostrarTablero(char tablero[] ,int casillas){
        for (int i = 0; i <casillas; i++) {
            System.out.print("["+tablero[i]+"]");
        }
        System.out.println("");
    }
    public static int lanzarDados(Random azar){
     int dado1 = azar.nextInt(7);
     int dado2 = azar.nextInt(7);
     return dado1+dado2;  
    }
    
    
}
