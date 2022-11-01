package pooejercicio6;

import ClassesYAtributos.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Gaby
 */
public class POOejercicio6 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        Cafetera p1 = new Cafetera();
        
        int opcion = 0;
        do {            
            System.out.println("");
            System.out.println("----------------------------------------------");
            System.out.println("****Nespresso****");
            System.out.println("__MENU Empleados__");
            System.out.println("1: saber la cantidad actual de cafe");
            System.out.println("2: saber la pacidad maxima en mililitros");
            System.out.println("3: llenar cafetera");
            System.out.println("4: servir tazas");
            System.out.println("5: vaciar cafetera");
            System.out.println("6: agregar cafe");
            System.out.println("7: salir");
            opcion = leer.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("La cantidad actual es de " + p1.getCapacidadActual() + " de ml.");
                    continue;
                case 2:
                    System.out.println("Lo maximo es: " + p1.getCapacidadMaxima() + " de ml.");
                    continue;
                case 3:
                    p1.llenarCafetera();
                    continue;
                case 4:
                    System.out.println("ingrese el tamaño de la taza en mililitros:");
                    p1.servirTaza(leer.nextInt());
                    continue;
                case 5:
                    p1.vaciarCafetera();
                    continue;
                case 6:
                    System.out.println("ingrese la cantidad de cafe a sumar a la cafetera:");
                    p1.agregarCafe(leer.nextInt());
                    break;
                case 7:
                    break;
            }
            
        } while (opcion==6 && opcion>0);
        
    }
    
}
