package deber_semana_07;
import java.util.Scanner;
public class venta_tienda {      
        public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
     double costo=0;
      int venta=1, cliente; 
      while (venta<=7){ 
          System.out.println("===================================================================================");
        System.out.println(venta+";"+" ingrese el tipo de cliente: ");
        System.out.println("si es de tipo 1 [1]");
         System.out.println("si es de tipo 2 [2]");
          System.out.println("si no pertenece a ninguno de los anteriores porfavor [3]");
        int n = teclado.nextInt();    
         System.out.println("Por favor si desea utilizar el espacio en su nombre utilizar el ´_´ Muchas gracias");
                System.out.println("Nombre del cliente: ");
        String nombre = teclado.next();
        System.out.println("Costo computadora");
         costo = teclado.nextInt();
        System.out.println("-Nombre: "+nombre);
        System.out.println("-Costo computadora: "+costo);
        switch (n) {
            case 1:
                costo=(costo-(costo*10)/100);
            System.out.println("Cliente tipo "+n+", compra computadora con un precio de "+costo+"$");
            venta++;
            break;
            case 2:
                costo=(costo-(costo*20)/100);
            System.out.println("Cliente tipo "+n+", compra computadora con un precio de "+costo+"$");
            venta++;
            break;
            case 3:
                System.out.println("Cliente tipo "+n+", compra computadora con un precio de "+costo+"$");
                venta++;
        }
        }
}
}
