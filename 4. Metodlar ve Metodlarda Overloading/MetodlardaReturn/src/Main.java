
public class Main {
    /*public static int toplama(int a, int b, int c) {
        //System.out.println("Toplam : " + (a + b + c));
        return (a + b + c);
    }*/
    
    public static int ikiIleCarp(int a) {
        return a * 2;
    }
    public static int ikiIleTopla(int a) {
        return a + 2;
    }
    public static int dortIleCarp(int a) {
        return a * 4;
    }
    
    public static void main(String[] args) {
        //System.out.println("Toplam : " + toplama(1, 2, 3));
        
        System.out.println("Sonuc : " + dortIleCarp(ikiIleTopla(ikiIleCarp(8))));
    }
    
}
