/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonapp;

public class Contrincante extends pokemon{
     
    public Contrincante(String nombre) {
        super(nombre);
    }
    @Override
    public String Estado(){
        String estado = this.nombre + " / " + this.vida + " HP";
        return estado;
    }
    @Override
    public String Atacar(pokemon contrincante) {
        String resultado = "";
        
        int ataque = (int)(Math.random()*5 + 7);        
        int critico = (int)(Math.random()*100);     
        int esquivar = (int)(Math.random()*100);
        int probataque = (int)(Math.random()*100);     
        
        if(critico <= 20){
            ataque = (int)(ataque * 3);
        if(esquivar <= 20){
            ataque = (int)(ataque*0);
        if(probataque <= 75){
            ataque = (int)(ataque*1);
            
        }
        }
        }
        contrincante.vida = contrincante.vida - ataque;
        if(contrincante.vida <= 0){
            contrincante.vida = 0;
        }
        
        if (critico <= 20) {
            resultado = contrincante.nombre 
                    + " recibió un ataque crítico de " + ataque;
        if(esquivar <= 15){
            resultado = contrincante.nombre
                    + " esquivo el ataque.";
        }
        }
        else {
            resultado = contrincante.nombre 
                    + " recibió un ataque de " + ataque;
        }
        
        return resultado;
    }
    @Override
    public String UsarHP(pokemon este){
        String hp = "";
        int usopocion = (int)(Math.random()*100);
            usopocion = este.vida + 15;
            
       


    
     
        
    
    

