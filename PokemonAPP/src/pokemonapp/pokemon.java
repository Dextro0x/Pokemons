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
public class pokemon {
    String nombre;
    int vidamax;
    int vidamin;
    String tipo;

    public pokemon(String nombre, int vidamax, int vidamin, String tipo) {
        this.nombre = nombre;
        this.vidamax = vidamax;
        this.vidamin = vidamin;
        this.tipo = tipo;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVidamax() {
        return vidamax;
    }

    public void setVidamax(int vidamax) {
        this.vidamax = vidamax;
    }

    public int getVidamin() {
        return vidamin;
    }

    public void setVidamin(int vidamin) {
        this.vidamin = vidamin;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
          
    
}
