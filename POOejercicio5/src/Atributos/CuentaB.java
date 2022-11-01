package Atributos;

/**
 *
 * @author Gaby
 */
public class CuentaB {

    private int numeroCuenta;
    private long DNI;
    private double SA;
    private double ingreso;
    private double retiro;
    private int opcion;

    public CuentaB() {
    }

    public CuentaB(int numeroCuenta, long DNI, double SA) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.SA = SA;
    }
//-----------------------------------------------------------------

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public double getSA() {
        return SA;
    }

    public void setSA(double SA) {
        this.SA = SA;
    }

    public double getIngreso() {
        return ingreso;
    }

    public void setIngreso(double ingreso) {
        this.ingreso = ingreso;
    }

    public double getRetiro() {
        return retiro;
    }

    public void setRetiro(double retiro) {
        this.retiro = retiro;
    }

    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }

//----------------------------------------
    public double ingreso(double ingresos) {
        this.ingreso = ingresos;
        this.SA = ingresos + getSA();
        return SA;
    }

    public void exR(double retiro) {
        this.retiro = retiro;

        if (retiro > (getSA() * 0.2) && retiro < getSA()) {
            System.out.println("La cantidad ingresada no es valida, ingrese un monto menor: ");
        } else {
            this.SA -= retiro;
        }
    }

    public void consultarS() {

        System.out.println("Su saldo es: " + getSA());
    }

    public void consultarDato() {

        System.out.println("Cuenta: " + " numeroCuenta=" + numeroCuenta + ", DNI=" + DNI + ", SA=" + SA);
    }

}
