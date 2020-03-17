
public class Main {
    public static void main(String[] args) {
        double a = 5.25;
        double b = 4.0;
        double c = 4d;
        double d = 4.23d;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("------------");
        
        int i = 22 / 7;
        float f = 22f / 7f;
        double g = 22d / 7d;
        System.out.println("i = " + i);
        System.out.println("f = " + f);
        System.out.println("g = " + g);
        System.out.println("------------");
        
        int k = 5;
        double l = k;
        System.out.println("l = " + l);
        System.out.println("------------");
        
        double m = 2.221993;
        float n = (float)m;
        System.out.println("n = " + n);
        System.out.println("------------");
        
        double sayi1 = 70.25;
        double sayi2 = 60d;
        double sayi3 = 80.2;
        
        float sayi4 = 70.25f;
        float sayi5 = 60f;
        float sayi6 = 80.2f;
        
        System.out.println("Ortalama : " + (sayi1 + sayi2 + sayi3) / 3);
        System.out.println("Ortalama2 : " + (sayi4 + sayi5 + sayi6) / 3);
         
    }
}
