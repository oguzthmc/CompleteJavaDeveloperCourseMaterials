
public class Main {
    public static void main(String[] args) {
        char a = 'A';
        char b = '?';
        char c = 2000;
        char d = '\u01FE';
        
        System.out.println(c);
        System.out.println(d);
        System.out.println();
        
        boolean x = true;
        boolean y = false;
        boolean z = x & y;
        boolean w = x | y;
        
        System.out.println(x);
        System.out.println(y);
        System.out.println("z = " + z);
        System.out.println("w = " + w);
    }
}
