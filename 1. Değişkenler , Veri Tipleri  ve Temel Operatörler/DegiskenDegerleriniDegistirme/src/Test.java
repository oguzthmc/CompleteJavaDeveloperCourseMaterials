
import java.util.Scanner;

/*
 * Kullanicidan alinan iki sayinin degerlerini degistirir.
 */

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi1;
        int sayi2;
        
        System.out.print("Birinci Sayi : ");
        sayi1 = scanner.nextInt();
        
        System.out.print("Ikinci Sayi : ");
        sayi2 = scanner.nextInt();
        System.out.println();
        
        System.out.println("Degistirlmeden Once...");
        System.out.println("Birinci Sayi : " + sayi1 + "\tIkinci Sayi : " + sayi2);
        System.out.println("---------------");
        
        int gecici = sayi1;
        sayi1 = sayi2;
        sayi2 = gecici;
        
        System.out.println("Degistirldikten Sonra...");
        System.out.println("Birinci Sayi : " + sayi1 + "\tIkinci Sayi : " + sayi2);
    }
}
