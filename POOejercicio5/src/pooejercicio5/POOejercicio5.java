package pooejercicio5;

import Atributos.CuentaB;
import java.util.Scanner;
/**
 *
 * @author Gaby
 */
public class POOejercicio5 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        CuentaB c1 = new CuentaB();
//-----------------------------------------------------------
        System.out.println("Bienvenido!!!");
        System.out.println("Ingrese sus datos: ");
        System.out.println("*Numero de cuenta: ");
        c1.setNumeroCuenta(leer.nextInt());
        System.out.println("*DNI: ");
        c1.setDNI(leer.nextLong());
        System.out.println("*Su saldo inicial: ");
        c1.setSA(leer.nextDouble());
        int opcion=0;
//-----------------------------------------------------------        
        do { 
        System.out.println(" ");
        System.out.println("Menu:");
        System.out.println("1: Consulta de dato");
        System.out.println("2: Ingresar efectivo");
        System.out.println("3: Retirar efectivo");
        System.out.println("4: Consultar saldo");
        System.out.println("5: Salir");
        System.out.println(" ");
        opcion = leer.nextInt();

        switch (opcion) {

            case 1:
                System.out.println("Sus datos:");
                c1.consultarDato();
                break;
            case 2:
                System.out.println("Escriba el monto a ingresar:");
                c1.ingreso(leer.nextDouble());
                c1.consultarS();
                break;
            case 3:
                System.out.println("Ingrese la cantidad a retirar: ");
                c1.exR(leer.nextDouble());
                c1.consultarS();
                break;
            case 4:
                System.out.println("Su saldo");
                c1.consultarS();
                break;
            case 5:
                break;
        }
        
        }while(opcion!=5);                 
    }
}
