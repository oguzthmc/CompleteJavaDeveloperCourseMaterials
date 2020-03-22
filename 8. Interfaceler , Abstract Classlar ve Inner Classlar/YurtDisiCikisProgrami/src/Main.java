public class Main {
    public static void main(String[] args) throws InterruptedException {
        
        System.out.println("# Sabiha Gökçen Havalimanına Hoşgeldiniz #");
        
        String sartlar = "Yurtdışı Çıkış Kuralları: \n"
                          + "Herhangi bir siyasi yasağınız olmaması gerekiyor..\n"
                          + "50 TL harç bedelinizi yatırmanız gerekiyor..\n"
                          + "Gideceğiniz ülkeye vizeniz olması gerekiyor..";
        
        String message = "Yurtdışı şartlarının hepsini sağlamalısınız!";
        
        while (true) {
            System.out.println("-------------------------------------------");
            System.out.println(sartlar);
            System.out.println("-------------------------------------------");
            
            Yolcu yolcu = new Yolcu();
            
            System.out.println("Harç Bedeli Kontrol Ediliyor...");
            Thread.sleep(3000);     //3 sn bekle
            if (yolcu.yurtdisiHarci() == false) {
                System.out.println(message);
                continue;
            }
            
            System.out.println("Siyasi Yasak Kontrol Ediliyor...");
            Thread.sleep(3000);     //3 sn bekle
            if (yolcu.siyasiYasak() == false) {
                System.out.println(message);
                continue;
            }
            
            System.out.println("Vize Durumu Kontrol Ediliyor...");
            Thread.sleep(3000);     //3 sn bekle
            if (yolcu.vizeDurumu() == false) {
                System.out.println(message);
                continue;
            }
            
            System.out.println("İşlemleriniz Tamam! Yurtdışına Çıkabilirsiniz.");
            break;
        }
    }
}
