
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        /*int i = 0;
        
        do {            
            System.out.println("i = " + i);
            i++;
        } while (i < 5);*/
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Bir sayi giriniz : ");
        int sayi = scanner.nextInt();
        
        int toplam = 0;
        do {            
            toplam += sayi % 10;
            sayi /= 10;
            System.out.println("Sayi : " + sayi);
        } while (sayi > 0);
        
        System.out.println("Rakamlari Toplami = " + toplam);
    }
}
