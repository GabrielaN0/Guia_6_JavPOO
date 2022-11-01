package pooejercicio9;

import ClasesYAtributos.Matematica;

/**
 *
 * @author Gaby
 */
public class POOejercicio9 {

    public static void main(String[] args) {
        
        Matematica intro = new Matematica(Math.random()*50, Math.random()*50);
        
        System.out.println(intro.getNumero1()+"  "+ intro.getNumero2());
        System.out.println(" ");
        intro.devolverMayor();
        System.out.println("--------------------------------------");
        System.out.println(" ");
        intro.calcularPotencia();
        System.out.println("---------------------------------------");
        System.out.println(" ");
        intro.calcularRaiz();
        System.out.println(" ");
    }
    
}
