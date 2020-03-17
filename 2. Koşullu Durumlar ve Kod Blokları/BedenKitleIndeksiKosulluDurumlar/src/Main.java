
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        /*
        Kullanicidan alinan boy ve kitle degerlerine gore beden kitle indeksi hesaplanarak,
        kilo durumu ekrana yazdirilir.
        
            Beden Kitle Indeksi: Kilo / (Boy(m) * Boy(m))
    
            BKI 18.5'un altindaysa      ------> Zayif
            BKI 18.5 ile 25 arasindaysa ------> Normal
            BKI 25 ile 30 arasindaysa   ------> Fazla Kilolu
            BKI 30'un ustundeyse        ------> Obez
        */
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Kilonuz:");
        int kilo = scanner.nextInt();
        
        System.out.println("Boyunuz (Ornek: 1,72):");
        double boy = scanner.nextDouble();
        
        double bki = kilo / (boy * boy);
        
        if (bki < 18.5) {
            System.out.println("Zayif");
        }
        else if (bki >= 18.5 && bki < 25) {
            System.out.println("Normal");
        }
        else if (bki >= 25 && bki < 30) {
            System.out.println("Fazla Kilolu");
        }
        else {
            System.out.println("Obez");
        }
        System.out.println("BKI : " + bki);
    }
}
