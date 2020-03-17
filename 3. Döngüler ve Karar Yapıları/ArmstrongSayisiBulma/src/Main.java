
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        /*
        Girilen bir sayının armstrong sayisi olup olmadığını bulmaya çalışalım.
        Örneğin, 4 basamaklı bir sayinin armstrong sayısı olması için şu şartı sağlaması gerekir.
            1634 = 1^4 + 6^4 + 3^4 + 4^4
            371 = 3^3 + 7^3 + 1^3
        
        Bu program do-while döngüsü yardımıyla yapılabilir.
        */
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayi Giriniz : ");
        int sayi = scanner.nextInt();
        /*System.out.print("Basamak Sayisi : ");
        int basamak = scanner.nextInt();*/
        int temp = sayi;
        int armstrongToplam = 0;
        //basamak hesabi degiskenleri
        int x = 1;
        int basamak = 1;
        
        while (temp / x > 9) {            
            x *= 10;
            basamak++;
        }
        
        do {            
            armstrongToplam += Math.pow((temp % 10), basamak);
            temp /= 10;
        } while (temp > 0);
        
        if (sayi == armstrongToplam) {
            System.out.println(sayi + " sayisi bir Armstrong sayisidir.");
        }
        else {
            System.out.println(sayi + " sayisi bir Armstrong sayisi değildir..!");
        }
    }
}
