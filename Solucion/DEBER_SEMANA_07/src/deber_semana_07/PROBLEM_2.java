
package deber_semana_07;

import java.util.Scanner;

public class PROBLEM_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int i=1,n=0,n1,n2=8,n3,num1,num2;
        System.out.println("ingrese el numerador limite");
        num1 = teclado.nextInt();
        System.out.println("ingrese el denominador limite");
        num2 = teclado.nextInt();
        while (i<(num1)){
            n1=n+5;
            n3=n2+2;
            System.out.println("=============================================");
            System.out.println(n1+"/"+n3);
            
            n2=n3;
            n=n1;
            i=n1;
        }
    }
    
}
