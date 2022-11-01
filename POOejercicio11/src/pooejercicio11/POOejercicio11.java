package pooejercicio11;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Gaby
 */
public class POOejercicio11 {

    public static void main(String[] args) {
        
        Date fecha = new Date();
        Date fechaActual = new Date();
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese una fecha del mes: ");
        fecha.setDate(leer.nextInt());
        System.out.println("ahora un mes del año en numeros: ");
        fecha.setMonth(leer.nextInt());
        System.out.println("por ultimo un año, posterior a 1900: ");
        fecha.setYear(leer.nextInt());
        
        System.out.println("la fecha es " + fecha.getDate() + " " + fecha.getMonth() + " " + fecha.getYear());
        System.out.println("hay " + (fechaActual.getYear() + (1900 - fecha.getYear())) + " años de diferencia");
    }
    
}
