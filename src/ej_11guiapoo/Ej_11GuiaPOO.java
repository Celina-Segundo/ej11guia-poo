/*
 Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que se
puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 */
package ej_11guiapoo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Celi
 */
public class Ej_11GuiaPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
    int dia = 0;
    int mes = 0;
    int anio = 0;
        System.out.println("Ingrese el DIA de su cumpleaños");
        dia = leer.nextInt();
        System.out.println("El mes de Su cumpleaños(En numeros por favor)");
        mes = leer.nextInt();
        System.out.println("En que año nacio(Sin puntos por favor)");
        anio = leer.nextInt();
       
        Date fecha =new Date(anio, mes-1, dia);
        Date fechaActual = new Date();
        
       
        //System.out.println(fecha);
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
                //String fechaFormateada=sdf.format(fecha);
                System.out.println("La fecha ingresada por el usuario es:");
                System.out.println(sdf.format(fecha));
                System.out.println("La fecha actual es:");
                System.out.println(sdf.format(fechaActual));
                
         int dif = fecha.compareTo(fechaActual);
        System.out.println("La diferencia entre la fecha de nacimiento(" + sdf.format(fecha) + ") Y la fecha actual("+ sdf.format(fechaActual) + ") es :(" + dif);        
    }
    
}
