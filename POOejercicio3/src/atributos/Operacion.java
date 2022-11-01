package atributos;
/**
 *
 * @author Gaby
 */
public class Operacion {

    private double numero1;
    private double numero2;
    
    //class
    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    public Operacion() {
    }
    
    //gete y seter-----------------------------------------
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

        
    //metodos------------------------------------------------------
    
    public void crearOperacion(double numero1, double numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    public double sumar(){
        double suma = getNumero1() + getNumero2();
    return suma;
    }
    
    public double restar(){
        double resta = getNumero1() - getNumero2();
    return resta;
    }
    
    public double multiplicacion(){
        double multiplicar;
        if (getNumero1()==0 || getNumero2()==0) {
            multiplicar = 0;
            System.err.println("'0' no esta dentro de los parametros de divicion,ya que todo numero dividido por este daria '0'");
        }else{
            multiplicar = getNumero1() * getNumero2();
        } 
    return multiplicar;
    }
    
    public double divicion(){ 
        double dividir;
        if (getNumero1()==0 || getNumero2()==0) {
            dividir = 0;
            System.err.println("'0' no esta dentro de los parametros de divicion,ya que todo numero dividido por este daria '0'");
        }else{
            dividir = getNumero1() / getNumero2();
        }
    return dividir;
    }

    
}
