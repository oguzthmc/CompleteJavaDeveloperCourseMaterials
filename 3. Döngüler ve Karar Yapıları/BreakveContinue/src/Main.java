
import java.util.Scanner;


public class Main {
    /*
        break anahtar kelimesi
        ----------------------
        Döngü herhangi bir yerde ve herhangi bir zamanda break ifadesiyle karşılaştığı
        anda çalışmasını durdurur. Böylelikle döngü hiçbir koşula bağlı kalmadan sonlanmış olur.

        break ifadesi sadece ve sadece içinde bulunduğu döngüyü sonlandırır. Eğer içiçe
        döngüler varsa ve içteki döngüde break kullanılmışsa sadece içteki döngü sona erer.

        continue anahtar kelimesi
        -------------------------
        Dögü herhangi bir yerde ve herhangi bir zamanda continue ifadesiyle karşılaştığı
        anda geri kalan işlemlerini yapmadan direkt olarak döngü bloğunun başına döner.
    */
    
    public static void main(String[] args) {
        
        /*int i = 0;

        while (i < 20) {
            if (i == 10) {
                break;
            }

            System.out.println("i = " + i++);
        }*/
        /*
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Bir islem sayisi giriniz : ");
            int islem = scanner.nextInt();
            if (islem == -1) {
                System.out.println("Donguden cikiliyor...");
                break;
            }
            System.out.println("İslem : " + islem);
        }*/
        /*
        for (int i = 0; i < 10; i++) {
            if (i == 3 || i == 5) {
                continue;
            }
            System.out.println("i = " + i);
        }*/
        
        int i = 0;
        
        while (i < 10) {    
            if (i == 3 || i == 5) {
                i++;
                continue;
            }
            System.out.println("i = " + i++);
        }
    }
}
