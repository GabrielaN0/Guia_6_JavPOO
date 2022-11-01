package Entidad;
/**
 *
 * @author Gaby
 */
public class Persona {
    
    public String nombre;
    private int edad;
    private String genero;
    private String apellido;
    
    public void info(String nombre, int edad, String genero, String apellido) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.apellido = apellido;
    }

    public Persona(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.apellido = "Gimenez";
    }

    public Persona() {
        apellido = "Gimenez";
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return "Persona " + "nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + ", apellido=" + apellido ;
    }

    
    
    
    
    
    
}


 