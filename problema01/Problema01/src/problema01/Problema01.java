/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author villa
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double base;
        double altura;
        double area;

        System.out.println("Ingresar la base del triángulo :");
        base = entrada.nextDouble();

        System.out.println("Ingresar la altura del triángulo :");
        altura = entrada.nextDouble();

        area = (base * altura) / 2;

        System.out.println("El áreal del triangulo es: " + area);

    }

}
