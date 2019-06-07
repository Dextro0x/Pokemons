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
    int vida;

    public pokemon(String nombre, int vidamax, int vidamin, String tipo, int vida) {
        this.nombre = nombre;
        this.vidamax = vidamax;
        this.vidamin = vidamin;
        this.tipo = tipo;
        this.vida = vida;
        
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
    String MostrarEstado() {
        String estado = this.nombre + " / " + this.vida 
                + " HP";
        return estado;
    }
    
    String Atacar(pokemon contrincante) {
        String resultado = "";
        
        int ataque = (int) (Math.random() * 10 + 10);        
        int critico = (int) (Math.random() * 100);
        
        if (critico <= 10) {
            ataque = (int) (ataque * 2.5);
        }
        
        contrincante.vida = contrincante.vida - ataque;
        
        if (contrincante.vida < 0) {
            contrincante.vida = 0;
        }
        
        if (critico <= 10) {
            resultado = contrincante.nombre 
                    + " recibió un ataque crítico de " + ataque;
        }
        else {
            resultado = contrincante.nombre 
                    + " recibió un ataque de " + ataque;
        }
        
        return resultado;
    
    }
          
    
}
