
public class Main {
    public static void main(String[] args) {
        String a = "Merhaba";
        System.out.println(a + " Hosgeldiniz..");
        System.out.println("");
        
        String b = "Java ";
        String c = "Programlama ";
        String d = "Dili";
        String toplam = b + c + d;
        System.out.println(toplam);
        System.out.println("");
        
        int e = 35;
        String f = a + e;
        System.out.println("f = " + f);
        System.out.println("");
        
        double g = 3.52;
        byte h = 10;
        
        a = a + g + h;
        System.out.println("a = " + a);
        System.out.println("");
        
        String t = "Java\tProgramlama\tDili";
        String n = "Java\nProgramlama\nDili";
        System.out.println(t);
        System.out.println(n);
    }
}
