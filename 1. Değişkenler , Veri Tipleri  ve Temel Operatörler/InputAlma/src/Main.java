
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        System.out.println("Lutfen yasinizi girin : ");
        Scanner scanner = new Scanner(System.in);
        int yas = scanner.nextInt();
        System.out.println("Yasiniz : " + yas);
        System.out.println("");
        
        System.out.println("Lutfen sayi girin : ");
        Scanner scanner2 = new Scanner(System.in);
        double sayi = scanner2.nextDouble();
        System.out.println("Sayiniz : " + sayi);
        System.out.println("");
        
        System.out.println("Lutfen yazi girin : ");
        Scanner scanner3 = new Scanner(System.in);
        String yazi = scanner3.nextLine();
        System.out.println("Yaziniz : " + yazi);
        System.out.println("");
        
        Scanner input = new Scanner(System.in);
        
        if (input.hasNextInt()) {
            int number = input.nextInt();
            System.out.println("Number : " + number);
        }
        else {
            System.out.println("Lutfen bir sayi giriniz....!");
        }
        
    }
}
