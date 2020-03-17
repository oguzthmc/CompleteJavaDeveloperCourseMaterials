import java.util.Scanner;

public class Main {
    /*
        Çalışanlar Programı
    
        Calisan Sınıfı Şeklinde Bir Üst Sınıf
    
        Calisan Sınıfından Türeyen Yazilimci Adında Bir Alt Sınıf
        Calisan Sınıfından Türeyen Yonetici Adında Bir Alt Sınıf
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("####### ÇALIŞANLAR PROGRAMINA HOŞGELDİNİZ #######");
        
        String islemler = "İŞLEMLER\n"
                            + "1. Yazılımcı İşlemleri\n"
                            + "2. Yönetici İşlemleri\n"
                            + "Çıkış için q'ya basın...\n";
        System.out.println("-------------------------------------------------");
        System.out.print(islemler);
        System.out.println("-------------------------------------------------");
        
        while (true) {
            System.out.println("İşlem Seçiniz : ");
            String islem = scanner.nextLine();
            
            if (islem.equals("q")) {
                System.out.println("Programdan çıkılıyor....");
                break;
            }
            else if (islem.equals("1")) {
                Yazilimci yazilimci = new Yazilimci("Oğuzhan", "Tohumcu", 486, "C,Java,React");
                String yazilimciIslem = "Yazılımcı İşlemleri\n"
                                        + "1. Format At\n"
                                        + "2. Bilgileri Göster\n"
                                        + "Çıkış için q'ya basın..\n";
                System.out.println(yazilimciIslem);
                
                while (true) {
                    System.out.print("İşlem Seçiniz : ");
                    String yazIslem = scanner.nextLine();
                    
                    if (yazIslem.equals("q")) {
                        System.out.println("Yazılımcı İşlemlerinden Çıkılıyor...");
                        break;
                    }
                    else if (yazIslem.equals("1")) {
                        System.out.println("İşletim Sistemi : ");
                        String isletimSistemi = scanner.nextLine();
                        yazilimci.formatAt(isletimSistemi);
                    }
                    else if (yazIslem.equals("2")) {
                        yazilimci.bilgileriGoster();
                    }
                    else {
                        System.out.println("Geçersiz Yazılımcı İşlemi!!");
                    }
                }
            }
            else if (islem.equals("2")) {
                Yonetici yonetici = new Yonetici("Gürkan", "Aksoy", 193, 10);
                String yoneticiIslem = "Yönetici İşlemleri\n"
                                   + "1. Zam Yap\n"
                                   + "2. Bilgileri Göster\n"
                                    + "Çıkış için q'ya basın..\n";
                System.out.println(yoneticiIslem);
                
                while (true) {
                    System.out.println("İşlem Seçiniz: ");
                    String yonIslem = scanner.nextLine();
                    
                    if (yonIslem.equals("q")) {
                        System.out.println("Yönetici İşlemlerinden Çıkılıyor...");
                        break;
                    }
                    else if (yonIslem.equals("1")) {
                        System.out.println("Yöneticinin ne kadar zam yapmasını istiyorsunuz? : ");
                        int zamMiktari = scanner.nextInt();
                        scanner.nextLine();
                        yonetici.zamYap(zamMiktari);
                    }
                    else if (yonIslem.equals("2")) {
                        yonetici.bilgileriGoster();
                    }
                    else {
                        System.out.println("Geçersiz Yönetici İşlemi!!");
                    }
                }
            }
            else {
                System.out.println("Geçersiz İşlem!!!");
            }
        }
        
    }
}
