
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //Kullanicidan alinan 3 sayidan en buyuk olanini bulma
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Birinci Sayi : ");
        int a = scanner.nextInt();
        System.out.print("Ikinci Sayi : ");
        int b = scanner.nextInt();
        System.out.print("Ucuncu Sayi : ");
        int c = scanner.nextInt();

        int max = -1;
        if (a >= b && a >= c) {
            max = a;
        }
        else if (b >=a && b >= c) {
            max = b;
        }
        else {
            max = c;
        }
        System.out.println("Maksimum Sayi : " + max);
    }
}
