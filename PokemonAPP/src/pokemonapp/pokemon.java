/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonapp;

/**
 *
 * @author alumno
 */
public abstract class pokemon {
    public String nombre;
    public int vida;
    public int nivel;

    
    
    public pokemon(String nombre) {
        this.nombre = nombre;
        this.nivel = 5;
        this.vida = 40 + this.nivel *5 ;
        
    }
    
    String MostrarEstado(){
        String estado = this.nombre + "/" + this.vida + "HP";
        return estado;
    }

   


    





}   
    