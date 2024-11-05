/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author villa
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    /**
     * Generar un programa en Java que permita calcular y mostrar el costos de
     * una computadora de escritorio. La misma es comprada por partes; CPU,
     * teclado, pantalla, ratón. Presentar el reporte:
     *
     * Reporte: 
     * Nombres de cliente: Luis Alberto Carvajal Ludeña 
     * Valores iniciales: 
     * CPU: $ 600 
     * Teclado: $ 20 
     * Ratón: $ 15 
     * Pantalla: $ 300
     *
     *
     * Valor a cancelar: $935
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double cpu;
        double teclado;
        double raton;
        double pantalla;
        double valorTotal;
        String nombreCompleto;
        
        System.out.println("Ingrese el nombre completo del cliente");
        nombreCompleto = entrada.nextLine();
        
        System.out.println("Ingrese el valor del CPU ");
        cpu = entrada.nextDouble();
        
        System.out.println("Ingrese el valor del teclado ");
        teclado = entrada.nextDouble();
        
        System.out.println("Ingrese el valor del ráton");
        raton = entrada.nextDouble();
        
        System.out.println("Ingrese eñ valor de la pantalla");
        pantalla = entrada.nextDouble();
        
        valorTotal = cpu+teclado+raton+pantalla;
        
        System.out.printf("Reporte: \nNombres de cliente: %s\nValores iniciales: "
                + "\nCPU:$ %.2f\nTeclado: %.2f$ \nRatón: $ %.2f\nPantalla: $ %.2f"
                + "\n\n\nValor a cancelar: $ %.2f\n",nombreCompleto,cpu,teclado,
                raton,pantalla,valorTotal);
        
    }

}
