
public class Main {
    /*public static void toplama(String a, String b) {
        System.out.println(a + " " + b);
    }
    public static void toplama(int a, int b) {
        System.out.println("İkili Toplam : " + (a + b));
    }
    public static void toplama(int a, int b, int c) {
        System.out.println("Üçlü Toplam : " + (a + b + c));
    }*/
    
    public static void skorHesapla(String isim, int puan) {
        System.out.println(isim + " adlı oyuncunun " + puan + " puanı var.");
    }
    public static void skorHesapla(int puan){
        System.out.println("İsimsiz oyuncunun " + puan + " puanı var.");
    }
    public static void skorHesapla(String isim) {
        System.out.println(isim + " adlı oyuncunun hiç puanı yok!");
    }
    
    public static void main(String[] args) {
        /*toplama(3, 4, 5);
        toplama(22, 2);
        toplama("Oguzhan", "Tohumcu");*/
        skorHesapla("Oguzhan", 1000);
        skorHesapla("Fatih");
        skorHesapla(2200);
    }
}
