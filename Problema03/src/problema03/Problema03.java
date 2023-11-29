/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author LAB.ELECT
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int n;
        int m;
        int suma;
        suma = 0;
        System.out.println("Ingrese el valor del multiplicando: ");
        n = entrada.nextInt();
        System.out.println("Ingrese el valor del multiplicador: ");
        m = entrada.nextInt();
        do {
            n = n * 2;
            m = m / 2;
            if (m % 2 == 1) {
                suma = suma + n;
            }

        } while (m >= 1);
        {
            System.out.printf("El resultado de la multiplicacion es: %d\n",suma);
        }
    }
}
