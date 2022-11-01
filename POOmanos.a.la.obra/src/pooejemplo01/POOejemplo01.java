package pooejemplo01;

import Entidad.Persona;

/**
 *
 * @author Gaby
 */
public class POOejemplo01 {

    public static void main(String[] args) {
                
        Persona p1 = new Persona("julieta", 25, "femenino");
        
        Persona p2 = new Persona();
        
        Persona p3 = new Persona();
        
        p2.nombre = "Joaquin";
        //p2.edad = 15;
        //p2.genero = "masculino";
        
        System.out.println("-------------------");
        System.out.println(p1.toString());
        System.out.println("--------------------");
        
        p2.setEdad(20);
        p2.getEdad();
        
        p2.setGenero("Transgenero");
        p2.getGenero();
        
        System.out.println(p2);
        System.out.println("--------------------");
        
        p3.info("jose", 10, "femenino", "jofre");
        System.out.println(p3.getNombre());
        System.out.println("----------------------");
        
          
        
        
    }
    
}
