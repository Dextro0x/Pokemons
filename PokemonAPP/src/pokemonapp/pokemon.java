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
public class pokemon{
    String nombre;
    int vida;
    int nivel;
    int pocion;

    public pokemon(String nombre){
        this.vida = 40 + this.nivel*5;
        this.nombre = nombre;
        this.nivel = 5;
        
    }
    public String Estado(){
        String estado = this.nombre + " / " + this.vida + " HP";
        return estado;
    }
    

   


    





}   
    