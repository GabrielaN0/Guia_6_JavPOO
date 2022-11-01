package pooejercicio8;

import ClasesYAtributos.Cadena;
import java.util.Scanner;

/**
 *
 * @author Gaby
 */
public class POOejercicio8 {

    public static void main(String[] args) {
        
        Cadena f1 = new Cadena();
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("**Ingrese una palabla o frace: **");
        f1.setFrase(leer.nextLine());
        f1.setLongitud(f1.getFrase().length());
        
        System.out.println(" ");
        System.out.println("**A continuacion le mostraremos cuantas vocales contiene su frase**");
        System.out.println("Su frase o palabra contiene: " + f1.mostrarVocales() + " vocales.");
        System.out.println("");
        
        System.out.println("**Ahora su frase pero en sentido contrario :D **");
        f1.InvertirFrase();
        
        System.out.println(" ");
        System.out.println("**Porfavor ingrese una letra que este en su frase para saber cuantas veces se repite: **");
        f1.vecesRepetidas(leer.next());
        leer.nextLine();//esta linea es para consmir el caracter que deja el leer.next()
        
        
        System.out.println("");
        System.out.println("**Ingrese otra frase cualquiera para comparar el tamaño de la primer frase con esta nueva: **");
        Cadena f2 = new Cadena();
        String frasedos = leer.nextLine();
        f2.setFrase(frasedos);
        f1.compararLongitud(f1.getFrase(),f2.getFrase());
        
        System.out.println(" ");
        System.out.println("**Ingresar una frase para unificarla con la primera**");
        f1.unirFrase(leer.nextLine());
        System.out.println(" ");
        
        System.out.println(" ");
        System.out.println("**Escribir un caracter cualquiera para remplazarlo por la letrta 'a' **");
        f1.reemplazar(leer.next());
        System.out.println(" ");
        
        System.out.println("");
        System.out.println("**ingresar cualquier letra para averiguar si esta en la frase**");
        f1.contiene(leer.next());
    }
    
}
        