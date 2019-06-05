
 
package pokemonapp;

/**
 *
 * @author alumno
 */
public class entrenador {
    String nombre;
    boolean genero;

    public entrenador(String nombre, boolean genero) {
        this.nombre = nombre;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isGenero() {
        return genero;
    }

    public void setGenero(boolean genero) {
        this.genero = genero;
    }
    
    
}
