/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonapp;
import java.util.Random;
public class pokemon{
    public String nombre;
    public int vida;
    public int nivel;
    public int pocion;

    public pokemon(String nombre){
        this.nivel = 5;
        this.vida = 40 + this.nivel*5;
        this.nombre = nombre;
        
        
    }
    public String Estado(){
        String estado = this.nombre + " / " + this.vida + " HP";
        return estado;
    }
    public String Atacar(pokemon contrincante) {
        String resultado = "";
        
        int ataque = (int)(new Random().nextInt(5)+5);        
        int critico = (int)((new Random().nextInt(5)+5)*2);
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
    public int usarHp(){
      int usoHp = this.vida + 15;
      return usoHp;
    }
    
}

   


    





    