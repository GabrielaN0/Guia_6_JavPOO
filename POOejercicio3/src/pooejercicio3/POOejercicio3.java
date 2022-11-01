package pooejercicio3;

import atributos.Operacion;
import java.util.Scanner;

/**
 *
 * @author Gaby
 */
public class POOejercicio3 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        Operacion s = new Operacion();
        double n1;
        double n2;
        
        
        System.out.println("Ingrese dos numeros a sumar:   ");
        n1 = leer.nextDouble();
        n2 = leer.nextDouble();
        
        s.crearOperacion(n1, n2);
        
        System.out.println("Suma-->"+s.sumar());
        System.out.println("Resta-->"+s.restar());
        System.out.println("Multiplicacion-->"+s.multiplicacion());
        System.out.println("Divicion-->"+s.divicion());
    }
    
}
