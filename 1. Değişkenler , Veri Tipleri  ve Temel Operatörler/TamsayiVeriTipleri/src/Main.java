
public class Main {
    
    public static void main(String[] args) {
        int a = 4; 
        System.out.println("Max int degeri : " + Integer.MAX_VALUE);
        System.out.println("Min int degeri : " + Integer.MIN_VALUE);
        System.out.println("");
        
        byte b = 100;
        System.out.println("Max byte degeri : " + Byte.MAX_VALUE);
        System.out.println("Min byte degeri : " + Byte.MIN_VALUE);
        System.out.println("");
        
        System.out.println("Max short degeri : " + Short.MAX_VALUE);
        System.out.println("Min short degeri : " + Short.MIN_VALUE);
        System.out.println("");
        
        System.out.println("Max long degeri : " + Long.MAX_VALUE);
        System.out.println("Min long degeri : " + Long.MIN_VALUE);
        System.out.println("");
        
        short j = 100;
        int i = j / 2;
        System.out.println("i = " + i);
        
        short m = 100;
        byte n = 2;
        int k = 4;
        long l = m + n + k;
        System.out.println("l = " + l);
    }
}
