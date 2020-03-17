
import java.util.Scanner;


public class Main {
    
    public static void selamlama() {
        System.out.println("Merhaba Nasılsınız ?");
        System.out.println("Selamlar...");
    }
    
    public static void faktoriyel() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int sayi = scanner.nextInt();
        
        int fakt = 1;
        while (sayi > 0) {            
            fakt *= sayi;
            sayi--;
        }
        System.out.println("Faktöriyel : " + fakt);
    }
    
    public static void main(String[] args) {
        /*
        Erişim_Belirleyici(Opsiyonel) Ekstra_Özellikler Dönüş_Tipi Metod_Adı(Parametreler) {
            //Burası Fonksiyon Bloğu
        
            //Fonksiyonun yapacağı işlemler burada olacak.
        }
        */
        
        faktoriyel();
        faktoriyel();
    }
}
