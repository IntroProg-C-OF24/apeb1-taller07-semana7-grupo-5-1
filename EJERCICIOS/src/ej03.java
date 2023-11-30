package ej;

import java.util.Scanner;

public class ej03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nombres = new String[5];
        int[] diasTrabajados = new int[5];
        double[] costoPorDia = new double[5];
        double[] valorCancelar = new double[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el nombre del empleado " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();

            System.out.print("Ingrese el número de días trabajados por " + nombres[i] + ": ");
            diasTrabajados[i] = scanner.nextInt();

            System.out.print("Ingrese el costo del día de trabajo para " + nombres[i] + ": $");
            costoPorDia[i] = scanner.nextDouble();
            scanner.nextLine();
            valorCancelar[i] = diasTrabajados[i] * costoPorDia[i];
        }
        System.out.println("\nReporte:");

        for (int i = 0; i < 5; i++) {
            System.out.println(nombres[i] + "\t" + diasTrabajados[i] + "\t$" + costoPorDia[i] + "\t$" + valorCancelar[i]);
        }
        scanner.close();
    }
}
