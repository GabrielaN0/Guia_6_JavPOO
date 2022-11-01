package Atributos;

import java.util.Arrays;

/**
 *
 * @author Gaby
 */
public class Rectangulo {
    
    private double base;
    private double altura;
    double perimetro;
    double superficie;

   
    

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public Rectangulo(){
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    
     public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }
    
    public double calcPerimetro(){
        perimetro = (getBase() + getAltura()) * 2;
        
        return perimetro;
    }
    
    
    public double calcSuperficie(){
        superficie = getBase() * getAltura() / getPerimetro();
        
        return superficie;    
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + ", perimetro=" + perimetro + ", superficie=" + superficie + '}';
    }
    
    public void dibuRec(){
                
        for (int i = 0; i < getAltura(); i++) {
            for (int j = 0; j < getBase(); j++) {
                if (i!=0 && i!=getAltura()-1 && j!=0 && j!=getBase()-1) {
                    System.out.print("   ");
                }else{
                    System.out.print(" * ");
                }                 
            }
            System.out.println("   ");
        }
    }
    
}
