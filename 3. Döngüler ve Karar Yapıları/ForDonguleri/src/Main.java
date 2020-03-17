
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        /*int i;
        
        for (i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }*/
        
        /*for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }*/
        
        /*for (int i = 10; i >= 0; i--) {
            System.out.println("i = " + i);
        }*/
        
        /*
        int i = 0;
        for ( ; i < 5; i++) {
            System.out.println("Java Ograniyorum...");
        }*/
        
        /*
        int i = 0;
        int j = 10;
        
        for (; i < 10 && j > 0; i++, j--) {
            System.out.print("i = " + i);
            System.out.println("\tj = " + j);
        }*/
        
        /*
        for (int i = 2; i < 100; i *= 2) {
            System.out.println("i = " + i);
        }*/
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayi giriniz:");
        
        int faktoriyel = 1;
        int sayi = scanner.nextInt();
        
        for (int i = 1; i <= sayi; i++) {
            faktoriyel *= i;
            System.out.println("Faktoriyel = " + faktoriyel + " i = " + i);
        }
        System.out.println("--------------------------");
        System.out.println("Faktoriyel = " + faktoriyel);
    }
}
