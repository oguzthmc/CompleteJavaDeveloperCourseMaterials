
public class Main {
    public static void main(String[] args) {
        /*
        System.out.println(3 + 4.2);
        System.out.println(3 - 5f);
        System.out.println(10 / 4.0);
        System.out.println(3 * 4.5);
        System.out.println(10 % 4);
        */
        int a = 4;
        a += 2;
        a *= 4;
        ++a;    //prefix
        System.out.println("a = " + a);
        int b = 6;
        b--;    //postfix
        System.out.println("b = " + b);
        
        System.out.println(3f / (4 + 4) * 5);   //soldan saga islem yapilir.
    }
}
