package pooejercicio4;

import Atributos.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Gaby
 */
public class POOejercicio4 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        Rectangulo r1 = new Rectangulo();
        
        System.out.println("Ingrese la base y luego la altura");
        r1.setBase(leer.nextDouble());
        r1.setAltura(leer.nextDouble());
        
        r1.getClass();
        
        System.out.println("perimetro-->"+r1.calcPerimetro());
        System.out.println("superficie-->"+r1.calcSuperficie());
        
        System.out.println("--------------------------------------------");
        System.out.println(r1.toString());
        System.out.println("-------------");
        
        r1.dibuRec();
    }
    
}
