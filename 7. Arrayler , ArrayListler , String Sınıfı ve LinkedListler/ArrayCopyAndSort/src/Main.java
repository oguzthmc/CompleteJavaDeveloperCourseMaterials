
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int[] arrayDoldur(int sayi) {
        Scanner scanner = new Scanner(System.in);
        int[] cikti = new int[sayi];
        
        for (int i = 0; i < sayi; i++) {
            cikti[i] = scanner.nextInt();    
        }
        
        return cikti;
    }
    
    public static void arrayYazdir(int[] array) {
        
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + (i+1) + ": " + array[i]);
        }
    }
    
    public static void arraySort(int[] array) {
        //Arrays sinifi ile sıralama
        Arrays.sort(array);
        arrayYazdir(array);
    }
    
    public static void main(String[] args) {
        /*int[] a = arrayDoldur(5);
        
        arrayYazdir(a);
        System.out.println("-----------");
        arraySort(a);*/
        
        int[] a1 = {1,2,3,4,5,6};
        int[] a2 = {1,2,3,4,5,6};
        
        //İçerik Kontrolü
        if (Arrays.equals(a1, a2)) {
            System.out.println("Eşitler");
        }
        else {
            System.out.println("Eşit Değiller!");
        }
    }
}
