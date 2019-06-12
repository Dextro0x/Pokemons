/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonapp;
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
        
        int ataque = (int)(Math.random()*5 + 5);        
        int critico = (int)(Math.random()*100);     
        int esquivar = (int)(Math.random()*100);
        
        
        
        if(critico <= 20){
            ataque = (int)(ataque * 2);
        if(esquivar <= 15){
            ataque = (int)(ataque*0);
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
    public String UsarHP(pokemon este){
        String hp = "";
        int HP = this.vida + 15;
        este.vida =  HP;
        hp = este.nombre + " ha usado poción, su vida aumenta a " + HP;
        return hp;
        
    }
}
    
 
    

        
       
    
    
    


   


    





    