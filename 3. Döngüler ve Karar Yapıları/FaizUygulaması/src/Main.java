
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        /*
        Faiz Uygulaması
        ---------------
        Kullanıcıdan anapara değerini ve parasını vadeli yatıracağı yıl süresi
        bilgisini alarak; her sene sonunda toplam para miktarını ekrana yazdıralım.
            Faiz Oranı : %6 Faiz Oranı
        */
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bankamıza Hoşgeldini!. Faiz Oranı %6..");
        
        int anapara;
        int vade;
        System.out.print("Yatırmak istediğiniz tutar : ");
        anapara = scanner.nextInt();
        System.out.print("Paranızı kaç yıl vadeli yatırmak istiyorsunuz? : ");
        vade =scanner.nextInt();
        
        double toplamPara = anapara;
        double faizOranı = 0.06;
        
        for (int i = 1; i <= vade; i++) {
            toplamPara += toplamPara * faizOranı;
            System.out.println(i + ". yılın sonunda toplam para : " + (int)toplamPara + " TL");
        }
    }
}
