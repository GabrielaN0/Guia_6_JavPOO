package Circunferencia;
/**
 *
 * @author Gaby
 */
public class Circunferencia {
    
    private double radio;
    public double perimetro;
    public double area;

    public double getPerimetro() {
        return perimetro(this.radio);
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro(this.radio);
    }

    public double getArea() {
        return area(this.radio);
    }

    public void setArea(double area) {
        this.area = area(this.radio);
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public Circunferencia() {
        
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia(double radio){
        this.radio = radio;
    }
    
    public double area(double radio){
        this.radio = radio;
        area = (3.15) * (radio*radio);
        return area;
    }
    
    public double perimetro(double radio){
        perimetro = 2 * 3.15 * getRadio();
        return perimetro;
    }



}
