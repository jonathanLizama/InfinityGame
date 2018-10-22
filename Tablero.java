/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infinityGame;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Jeremias
 */

// clase tablero
public class Tablero {
    
// atributos del tablero
private char tablero[];
private int cantidadCasillas;  

public void tablero(){
this.tablero= new char[cantidadCasillas];

}
public int leerCantidadCasillas(){
   Scanner leer = new Scanner(System.in);
   do{
   this.cantidadCasillas = leer.nextInt();
   }while(this.cantidadCasillas<20);
   return this.cantidadCasillas;
 }
public int casillas(int casillas){
    Scanner leer = new Scanner(System.in);
    boolean lectura = false;
    do{
      try{
           System.out.println("ingrese la cantidad de casillas del tablero: ");
           casillas = leer.nextInt();
           lectura = true;
              
            }
            catch(InputMismatchException e){
            System.out.println("Debes ingresar un numero entero");
            }
        }while(!lectura);
        return casillas;
    }

public int getCasillasTablero(int casillas){
  return this.casillas(casillas);  
}
}

