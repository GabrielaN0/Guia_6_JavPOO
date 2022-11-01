package pooejercicio10;

import java.util.Arrays;

/**
 *
 * @author Gaby
 */
public class POOejercicio10 {

    public static void main(String[] args) {
        
        double [] a1 = new double[50];
        double [] b2 = new double[20];
        
        System.out.println("Array 'A' ");
        for (int i = 1; i < 50; i++) {
            a1[i] = Math.random()*80;
            System.out.println(a1[i]);
        }
        
       
        System.out.println(" ");
        System.out.println("La variable 'A' asendente: ");
        Arrays.sort(a1);
        for (int i = 1; i < 11; i++) {
            System.out.println(a1[i] + " ");
        }
        
        
        System.out.println("");
        System.out.println("Array 'B' ");
        for (int i = 1; i < 20; i++) {
            if(i<11){
                b2[i] = a1[i];
            }else{ b2[i] = Math.random()*0.5;}
            
            System.out.println(b2[i]);
        }
        
    }
    
}
