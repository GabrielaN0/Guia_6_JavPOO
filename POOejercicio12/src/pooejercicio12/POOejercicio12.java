package pooejercicio12;

import ClassesYAtributos.Persona;

/**
 *
 * @author Gaby
 */
public class POOejercicio12 {

    public static void main(String[] args) {
       
        Persona p1 = Persona.crearPersona();
        
        System.out.println(p1.toString());
        
        System.out.println(p1.getNombre() + " tienes " + p1.calcularEdad()+ "años?");
        
    }
    
}
