
public class Main {
    public static void toplama(int a, int b, int c) {
        int deneme = 0;
        System.out.println("Toplama Sonucu : " + (a + b + c));
    }
    public static void main(String[] args) {
        toplama(10, 20, 30);
        //metod içindeki lokal değişkenlere main'den ulaşılamaz!
        //System.out.println(deneme);
        /*
        int a = 4;
        String yazdir = "Merhaba";
        int b = 5;
        
        if (a < 10) {
            System.out.println(yazdir);
        }
        
        System.out.println(b);
        */
        /*
        int i;
        for (i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println(i);
        */
        
        /*
        int i = 1;
        while (i < 10) {            
            if (i % 2 == 0) {
                String yazdir = "Çift";
                System.out.println(yazdir);
            }
            //hatalı kullanım
            //System.out.println(yazdir);
            i++;
        }
        */
    }
}
