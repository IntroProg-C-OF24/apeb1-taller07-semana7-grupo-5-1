package ej;
import java.util.Scanner;
public class ej07 {
        public static void main(String[] args) {
        double sumatoria = 0;
        for (int num = 1; num <= 10; num++) {
            if (num % 2 == 0) {
                sumatoria += 1.0 / num;
                System.out.println("+"+num+"/"+num);
            } else {
                sumatoria -= 1.0 / num;
                System.out.println("-"+num+"/"+num);
            }
        }
        System.out.println("Sumatoria = " + sumatoria);
    }
}
