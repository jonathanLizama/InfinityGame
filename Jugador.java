/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infinityGame;

/**
 *
 * @author Jeremias
 */

// nombre de la clase
public class Jugador {
    
// atributos de cada jugador
private String nombre;
private int salud;
private int meditar;
private int posicion;

public void jugador(String nombre){
  
    this.nombre= nombre;
    this.salud =15;
    this.posicion=1;
    this.meditar=0;
}

// metodos para mostrar los atributos de la clase jugador
public int getPosicion(){
 return this.posicion; 
}
public int getSalud(){
    return this.salud;
}
public String getNombre(){
    return this.nombre;
}
public int getMeditar(){
    return this.meditar;
}
// metodos para modificar los atributos originales
public void setSalud(int modificar){
   this.salud = modificar;
}
public void setPosicion(int modificar){
    this.posicion = modificar;  
}
public void setMeditar(int modificar){
    this.meditar++;
    this.meditar += modificar;  
  }

  
}
