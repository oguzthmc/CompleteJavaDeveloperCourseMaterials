
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        /*
            if(kosul) {
                Kosul saglaninca(true) bu blok calisir. 
            }
            else {
                Bu blogun ustundeki herhangi bir kosul saglanmadiginda bu blok calisir.
            }
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sayi girin:");
        int sayi = scanner.nextInt();
        
        if (sayi < 0) {
            System.out.println("Negatif");
        }
        else {
            System.out.println("Pozitif veya 0");
        }
    }
}
