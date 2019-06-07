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

    public pokemon(String nombre, int vidamax, int vidamin, String tipo) {
        this.nombre = nombre;
        this.vidamax = vidamax;
        this.vidamin = vidamin;
        this.tipo = tipo;
        this.vida = 100;
        
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
