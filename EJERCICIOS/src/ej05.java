package ej;

import java.util.Scanner;

public class ej05 {
   public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] nombres = new String[4];
        double[] promedios = new double[4];
        String[] resultados = new String[4];
        for (int i = 0; i < 4; i++) {
            System.out.print("Ingrese el nombre del estudiante " + (i + 1) + ": ");
            nombres[i] = teclado.nextLine();

            System.out.print("Ingrese el promedio de ciclo para " + nombres[i] + ": ");
            promedios[i] = teclado.nextDouble();
            teclado.nextLine();
            resultados[i] = (promedios[i] >= 6.0) ? "Aprobado" : "Reprobado";
        }
        System.out.println("\nReporte:");

        for (int i = 0; i < 4; i++) {
            System.out.println(nombres[i] + "\t" + promedios[i] + "\t" + resultados[i]);
        }
        teclado.close();
    }
}