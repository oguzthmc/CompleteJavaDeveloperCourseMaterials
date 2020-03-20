
import java.util.Scanner;

public class Main {
    
    public static void arrayBastir(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + (i+1) + ": " + array[i]);
        }
    }
    
    public static double ortalamaBul(int[] array) {
        int toplam = 0;
        
        for (int i = 0; i < array.length; i++) {
            toplam += array[i];
        }
        
        return ((double)toplam / array.length);
    }
 
    public static void main(String[] args) {
        //int a = 5;
        int[] a = new int[5];
        
        /*for (int i = 0; i < a.length; i++) {
            a[i] = i * 4 + 2;
        }*/
        
        /*Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println("-----------");*/
        
        int[] b = {10,20,30,40,50,60};
        //System.out.println("Array uzunluğu : " + b.length);
        
        arrayBastir(b);
        
        System.out.println("Ortalama: " + ortalamaBul(b));
        
        /*for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }*/
        
        /*System.out.println(a[0]);
        System.out.println(a[2]);*/
        //System.out.println(a[6]); ArrayIndexOutOfBoundsException hatasını verir.
        /*a[5] = 36;
        a[9] = 75;*/
        
        //double[] b;
        
    }
}
