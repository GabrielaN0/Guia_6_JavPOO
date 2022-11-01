package pooejemplo02.perro;

import Mascota.entidades.Mascota;
/**
 *
 * @author Gaby
 */
public class POOejemplo02Perro {

    public static void main(String[] args) {
        
        Mascota m1 = new Mascota();
        
        Mascota m2 = new Mascota();
        Mascota m3 = new Mascota();
        
        m1.setNombre("Pepe Chiquito");
        
        m1.pasear(100);
        
        System.out.println(m1.toString());
    }
}    
    /** public String nombre;
    public String apodo;
    //conejo, gato, perro, loro
    public String tipo;
    public String color;
    public int edad;
    public boolean cola;
    public String raza;*/
    

