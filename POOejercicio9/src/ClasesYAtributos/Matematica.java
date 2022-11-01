package ClasesYAtributos;

import static java.lang.Math.abs;

/**
 *
 * @author Gaby
 */
public class Matematica {
    
    private double numero1;
    private double numero2;

    public Matematica() {
    }

    public Matematica(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    
//------------------------------------------------------
    
    public void devolverMayor(){
        if (Math.max(numero1, numero2) == numero1) {
            System.out.println("El primer numero es el mayor");
        }else{
            System.out.println("El segundo numero es el mayor");
        }
    }
    
    public void calcularPotencia(){
        int n1 = (int) abs(numero1), n2 = (int) abs(numero2);
        
        if (n1>n2) {
            System.out.println("El mayor numero elevado al segundo es: " + Math.pow(n1, n2));
        }else{
            System.out.println("El mayor numero elevado primero es: " + Math.pow(n2, n1));
        }
    }
    
    public void calcularRaiz(){
        numero1 = (int) abs(this.numero1); 
        numero2 = (int) abs(this.numero2);
    
        if(numero1>numero2){
            System.out.println("La raíz del menor número es " + Math.sqrt(numero2));
        }else {
            System.out.println("La raíz del menor número es " + Math.sqrt(numero1));
        }
    }
}
