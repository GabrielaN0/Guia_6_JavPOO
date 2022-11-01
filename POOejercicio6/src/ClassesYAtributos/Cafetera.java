package ClassesYAtributos;
/**
 *
 * @author Gaby
 */
public class Cafetera {

    public int capacidadMaxima;
    public int capacidadActual;
//----------------------------------------------------------------------------------
    public Cafetera(int capacidadMaxima, int capacidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadActual = capacidadActual;
    }
    
    public Cafetera() {
        capacidadMaxima = 3000;
    }
//-----------------------------------------------------------------------------------

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }
    
//-----------------------------------------------------------------------------------
    
    public void llenarCafetera(){
        this.capacidadActual = this.capacidadMaxima;           
    }
    
    public void servirTaza(int cantidad){
        
        if(cantidad>capacidadActual){
            cantidad = capacidadActual;
            System.out.println("La taza no se pudo llenar por completo. Se llenó con " + cantidad + "ml.");
            capacidadActual-=cantidad;
        }else{
            System.out.println("La taza se lleno por completo");
            capacidadActual-=cantidad;
        } 
    
    }
    
    public void vaciarCafetera(){
        capacidadActual = getCapacidadActual()*0;
    }
    
    public void agregarCafe(int cantidad){
        if((cantidad + this.capacidadActual) > this.capacidadMaxima){
            System.out.println("La cantidad supera el maximo; se recomienda ingresar menos ml.");
        }else{
            capacidadActual = cantidad + this.capacidadActual;
        }
    }
    
    
}
