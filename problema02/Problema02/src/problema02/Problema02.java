/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author villa
 */
public class Problema02 {

    /**
     * @param args the command line arguments Generar un programa en Java que
     * permita ingresar los gastos de tres hijos de un padre de familia;
     * calcular y mostrar el total de gastos de los hijos del padre de familia,
     * además del nombre de cada hijo.
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombreHijo1;
        String nombreHijo2;
        String nombreHijo3;

        double gastoHijo1;
        double gastoHijo2;
        double gastoHijo3;
        double gastoTotal;

        System.out.println("Ingrese el nombre del primer hijo");
        nombreHijo1 = entrada.nextLine();
        System.out.println("Ingrese el gasto del primer hijo");
        gastoHijo1 = entrada.nextDouble();
        entrada.nextLine();

        System.out.println("Ingrese el nombre del segundo hijo");
        nombreHijo2 = entrada.nextLine();
        System.out.println("Ingrese el gasto del segundo hijo");
        gastoHijo2 = entrada.nextDouble();
        entrada.nextLine();

        System.out.println("Ingrese el nombre del tercer hijo");
        nombreHijo3 = entrada.nextLine();
        System.out.println("Ingrese el gasto del tercer hijo");
        gastoHijo3 = entrada.nextDouble();

        gastoTotal = gastoHijo1 + gastoHijo2 + gastoHijo3;

        System.out.printf("Hijo 1 : %s \nHijo 2 : %s \nHijo 2 : %s \n"
                + "El gasto total de los tres hijos es : %.2f \n",nombreHijo1, 
                nombreHijo2, nombreHijo3,gastoHijo1);

    }

}
