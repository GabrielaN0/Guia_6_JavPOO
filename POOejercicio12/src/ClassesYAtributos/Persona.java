package ClassesYAtributos;
import java.util.Date;
import java.util.Scanner;
/**
 *
 * @author Gaby
 */
public class Persona {

    private String nombre;
    private Date fdn;

    public Persona(String nombre, Date fdn) {
        this.nombre = nombre;
        this.fdn = fdn;
    }
    
    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFdn() {
        return fdn;
    }

    public void setFdn(Date fdn) {
        this.fdn = fdn;
    }

//---------------------------------------------------------    
    
    public static Persona crearPersona(){
        Scanner leer = new Scanner(System.in);
        
        Persona p1 = new Persona();
        
        System.out.println("   ***Bienvenido***");
        System.out.println(" -*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("Porfavor ingrese su nombre completo: ");
        p1.setNombre(leer.nextLine());
        System.out.println(" ");
        System.out.println("Por favor ingrese su dia de nacimiento: ");
        System.out.print("Dia: "); int dia = leer.nextInt();
        System.out.println("ahora su mes(en numero)");
        System.out.print("Mes: "); int mes = leer.nextInt(); mes = mes - 1;
        System.out.println("y el año en que nacio: ");
        System.out.print("Año: "); int anio = leer .nextInt(); anio = anio - 1900;
        Date fdn = new Date(anio,mes,dia);
        p1.setFdn(fdn);
        return p1;
    }

    @Override
    public String toString() {
        return "Persona--> " + " nombre=" + nombre + ", fdn=" + fdn + '}';
    }
    
    

    public int calcularEdad(){
        Date actual = new Date();
        return actual.getYear() - fdn.getYear();
    }
}