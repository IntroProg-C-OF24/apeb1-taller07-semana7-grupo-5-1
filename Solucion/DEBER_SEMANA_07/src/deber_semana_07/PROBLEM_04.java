package deber_semana_07;
import java.util.Scanner;
public class PROBLEM_04 {
    public static void main(String[] args) {
 Scanner teclado = new Scanner(System.in);
        int njuga = 0, n = 0, i = 1;
        System.out.println("cuantos jugadores estaran en su equipo?");
        n = teclado.nextInt();
        double sumaEdades = 0;
        double sumaAlturas = 0;
        while (i <= n) {
            System.out.println("======================================================================================");
            System.out.println("ingrese los datos de manera ordenada, en el orden que se le indica, ademas tener en concideracion que tanto en el nombre como en pocision debe utilizar el _ como espacio");
            System.out.println("Ingrese la edad del jugador: ");
            int edad = teclado.nextInt();
            System.out.println("Ingrese la posición que juega:");
            String posicion = teclado.next();
            System.out.println("Ingrese la altura del jugador: ");
            double estatura = teclado.nextDouble();
            System.out.println("Ingrese el nombre del jugador: ");
            String nombre = teclado.next();
            System.out.println(i + ". " + nombre + " -" + posicion + "-. " + "edad " + edad + ", estatura " + estatura);
            sumaEdades = sumaEdades + edad;
            sumaAlturas = sumaAlturas + estatura;
            i++;
            njuga = njuga + 1;
        }
        System.out.println("Promedio edades: " + sumaEdades / njuga);
        System.out.println("Promedio de estaturas: " + sumaAlturas / njuga);
    }
}
