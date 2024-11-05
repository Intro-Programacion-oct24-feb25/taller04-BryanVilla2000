/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema05;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author villa
 */
public class Problema05 {

    /**
     * @param args the command line arguments
     */
    /**
     * Generar un programa en Java que permite calcular y mostrar el valor total
     * a pagar mensual de servicios digitales de una persona. Los servicios
     * digitales son: netflix, youtube premium, dropbox, spotify. Existe una
     * promoción, para netflix y youtube un descuento del 23% y para dropbox del
     * 45%. Presentar un reporte que muestre todos los datos posibles.
     *
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double netflix;
        double youtube;
        double dropbox;
        double spotify;
        double valorTotal;

        System.out.println("Ingrese el valor a pagar de Netflix");
        netflix = entrada.nextDouble();

        System.out.println("Ingrese el valor a pagar de Youtube Premium");
        youtube = entrada.nextDouble();

        System.out.println("Ingrese el valor a pagar de Dropbox");
        dropbox = entrada.nextDouble();

        System.out.println("Ingrese el valor a pagar de Spotify");
        spotify = entrada.nextDouble();

        valorTotal = (netflix * 0.23) + (youtube * 0.23) + (dropbox * 0.45) + spotify;
        System.out.println("El valor total a pagar es de: " + valorTotal);
    }

}
