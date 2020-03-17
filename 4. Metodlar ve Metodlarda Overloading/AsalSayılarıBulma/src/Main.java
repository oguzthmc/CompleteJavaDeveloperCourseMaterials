
public class Main {
    public static boolean asalMi(int sayi) {
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void yazdir() {
        System.out.println("1000'e kadar olan asal sayılar");
        System.out.println("------------------------------");
        for (int i = 2; i < 1000; i++) {
            if (asalMi(i)) {
                if (i >= 2 && i < 10) {
                    System.out.println("\t    " + i);
                }
                else if (i >= 10 && i < 100) {
                    System.out.println("\t   " + i);
                }
                else {
                    System.out.println("\t  " + i);
                }
            }
        }
    }
    public static void main(String[] args) {
        /*
        1'den 1000'e kadar olan sayılardan asal olanları ekrana yazdıralım.
        
        Asal Sayı : 1'e ve kendisinden başka hiçbir sayıya bölünmeyen sayı.
        */
        yazdir();
    }
}
