/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author villa
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    /**
     * Generar un programa en Java que permita calcular y mostrar el valor de la
     * planilla de teléfono de un casa. Se debe ingresar el costo por minutos,
     * el número de minutos consumidos en el mes, la dirección del domicilio, el
     * nombre completo del dueño de la línea telefónica. Finalmente presentar el
     * siguiente reporte
     *
     * Reporte: Nombres completos: Luis Alberto Carvajal Ludeña Dirección: Calle
     * primera entre segunda y décima Costo por minuto: $1.5 Número de minutos
     * consumidos: 50 Valor a cancelar: $75
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double costoMinuto;
        double valorTotal;
        int minutosConsumidos;
        String direccion;
        String nombreCompleto;

        System.out.println("Ingrese el nombre completo del cliente");
        nombreCompleto = entrada.nextLine();

        System.out.println("Ingrese la direcci del cliente");
        direccion = entrada.nextLine();

        System.out.println("Ingrese los minutos consumidos durante el mes");
        minutosConsumidos = entrada.nextInt();

        System.out.println("Ingrese el costo por minuto");
        costoMinuto = entrada.nextDouble();

        valorTotal = costoMinuto * minutosConsumidos;

        System.out.printf("Reporte:\nNombres completos: %s\n\tDirección: %s\n"
                + "Costo por minuto: %.2f\n\tNúmero de minutos consumidos: "
                + "%d\n\t\tValor a cancelar: %.2f\n", nombreCompleto, direccion,
                costoMinuto, minutosConsumidos, valorTotal);
    }

}
