package pooejercicio1;

import clases.Libro;
import java.util.Scanner;

/**
 *
 * @author Gaby
 */
public class POOejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
         String titulo;
         String autor;
         int nPag;
        
        Libro x1 = new Libro();
        Libro x2 = new Libro();
        
        
//        System.out.println("Ingrese un libro: ");
//        x1.setTitulo(leer.nextLine());
//        System.out.println("Ingrese un autor: ");
//        x1.setAutor(leer.nextLine());
//        System.out.println("Ingrese la cantidad de paginas: ");
//        x1.setnPag(leer.nextInt());
//        
//        System.out.println("Libro 1: " + x1.toString());
        
        System.out.println("-------------------------------");
        
        System.out.println("Ingrese un libro, luego un autor y despues cantidad de paginas:");
        titulo=leer.nextLine();
        autor=leer.nextLine();
        nPag=leer.nextInt();
        x2.Libro(titulo, autor, nPag);
        
        System.out.println("Libro 2: " + x2.toString());
    }
    
}
