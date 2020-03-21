
import java.util.Scanner;

public class Test {
    private static Sarkicilar sarkicilar = new Sarkicilar();
    private static Scanner scanner = new Scanner(System.in);
    
    public static void islemleriBastir() {
        System.out.println("\t 0-İşlemleri Görüntüle");
        System.out.println("\t 1-Şarkıcıları Görüntüle");
        System.out.println("\t 2-Şarkıcı Ekle");
        System.out.println("\t 3-Şarkıcı Güncelle");
        System.out.println("\t 4-Şarkıcı Sil");
        System.out.println("\t 5-Şarkıcı Ara");
        System.out.println("\t 6-Çıkış");
    }
    
    public static void goruntule() {
        sarkicilar.sarkicilariBastir();
    }
    
    public static void sarkici_ekle() {
        System.out.println("Eklemek istediğiniz şarkıcı adı:");
        
        String ad = scanner.nextLine();
        sarkicilar.sarkiciEkle(ad);
    }
    
    public static void sarkici_guncelle() {
        System.out.println("Güncellemek istediğiniz şarkıcı pozisyonu(1,2,3,...):");
        
        int pozisyon = scanner.nextInt();
        scanner.nextLine();
        
        String yeniAd = scanner.nextLine();
        sarkicilar.sarkiciGuncelle(yeniAd, pozisyon-1);
    }
    
    public static void sil() {
        System.out.println("Silmek istediğiniz pozisyon (1,2,3,...)");
        
        int pozisyon = scanner.nextInt();
        sarkicilar.sarkiciSil(pozisyon-1);
    }
    
    public static void ara() {
        System.out.println("Aramak istediğiniz şarkıcı:");
        
        String ad = scanner.nextLine();
        sarkicilar.sarkiciAra(ad);
    }
    
    public static void main(String[] args) {
        System.out.println("\t # Şarkıcı Uygulamasına Hoşgeldiniz #");
        
        islemleriBastir();
        
        boolean cikis = false;
        int islem;
        
        while (!cikis) {
            System.out.println("Bir İşlem Seçiniz:");
            islem = scanner.nextInt();
            scanner.nextLine();
            
            switch(islem) {
                case 0:
                    islemleriBastir();
                    break;
                case 1:
                    goruntule();
                    break;
                case 2:
                    sarkici_ekle();
                    break;
                case 3:
                    sarkici_guncelle();
                    break;
                case 4:
                    sil();
                    break;
                case 5:
                    ara();
                    break;
                case 6:
                    cikis = true;
                    System.out.println("Uygulamadan Çıkılıyor...");
                    break;
                default:
                    System.out.println("Yanlış işlem seçtiniz! Tekrar deneyin (1-6)..");
            }
            
        }
    }
}
