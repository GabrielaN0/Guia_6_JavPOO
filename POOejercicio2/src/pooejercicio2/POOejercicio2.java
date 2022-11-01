package pooejercicio2;

import Circunferencia.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author Gaby
 */
public class POOejercicio2 {

    public static void main(String[] args) {
         
        Scanner leer = new Scanner(System.in);
         
        Circunferencia m1 = new Circunferencia();
        
        System.out.println("ingresar radio: ");
        m1.crearCircunferencia(leer.nextDouble());
        
        System.out.println("Area ----------------------------------");
        System.out.println(m1.getArea());
        System.out.println("");
        System.out.println("Perimetro--------------------------------");
        System.out.println(m1.getPerimetro());
        
        
    }
    
}
