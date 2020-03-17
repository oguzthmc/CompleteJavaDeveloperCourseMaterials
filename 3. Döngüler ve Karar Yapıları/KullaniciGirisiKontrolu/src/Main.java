
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //while döngüsü yardımıyla bir kullanıcı girişi yazmaya çalışalım.
        
        Scanner scanner = new Scanner(System.in);
        int girisHakki = 3;
        
        String sysKullaniciAdi = "Oguzhan Tohumcu";
        String sysParola = "12345";
        
        System.out.println("****************************");
        System.out.println("Kullanıcı Girişine Hoşgeldiniz...");
        System.out.println("****************************");
        
        while (true) {            
            System.out.print("Kullanıcı Adı : ");
            String kullanici = scanner.nextLine();
            System.out.print("Parola : ");
            String parola = scanner.nextLine();
            
            if (kullanici.equals(sysKullaniciAdi) && parola.equals(sysParola)) {
                System.out.println("\n\t\tHoşgeldiniz " + kullanici);
                System.out.println();
                break;
            }
            else if (kullanici.equals(sysKullaniciAdi) && !parola.equals(sysParola)) {
                System.out.println("Parolanız Yanlış..!");
                girisHakki--;
                System.out.println("Kalan Giriş Hakkınız : " + girisHakki);
            }
            else if (!kullanici.equals(sysKullaniciAdi) && parola.equals(sysParola)) {
                System.out.println("Kullanıcı Adınız Yanlış.!");
                girisHakki--;
                System.out.println("Kalan Giriş Hakkınız : " + girisHakki);
            }
            else {
                System.out.println("Kullanıcı Adınız ve Parolanız Yanlış!!");
                girisHakki--;
                System.out.println("Kalan Giriş Hakkınız : " + girisHakki);
            }
            
            if (girisHakki == 0) {
                System.out.println("Giris hakkınız bitti! Yine bekleriz..");
                break;
            }
        }
    }
}
