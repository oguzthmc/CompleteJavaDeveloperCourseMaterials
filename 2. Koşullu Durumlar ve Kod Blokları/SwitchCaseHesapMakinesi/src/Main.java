
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //Switch-case kullanarak 4 islem yapan bir hesap makinesi tasarlayalim.
        Scanner scanner = new Scanner(System.in);
        System.out.println("************************************");
        String islemler = "1. Toplama Islemi\n"
                          +"2. Cikarma Islemi\n"
                          +"3. Carpma Islemi\n"
                          +"4. Bolme Islemi";
        System.out.println(islemler);
        System.out.println("************************************");
        
        System.out.println("Islemi Seciniz:");
        String islem = scanner.nextLine();
        int a, b;
        switch(islem) {
            case "1":
                System.out.print("Birinci Sayi : ");
                a = scanner.nextInt();
                System.out.print("Ikinci Sayi : ");
                b = scanner.nextInt();
                System.out.println("Toplama : " + (a+b));
                break;
            case "2":
                System.out.print("Birinci Sayi : ");
                a = scanner.nextInt();
                System.out.print("Ikinci Sayi : ");
                b = scanner.nextInt();
                System.out.println("Cikarma : " + (a-b));
                break;
            case "3":
                System.out.print("Birinci Sayi : ");
                a = scanner.nextInt();
                System.out.print("Ikinci Sayi : ");
                b = scanner.nextInt();
                System.out.println("Carpma : " + (a*b));
                break;
            case "4":
                System.out.print("Birinci Sayi : ");
                a = scanner.nextInt();
                System.out.print("Ikinci Sayi : ");
                b = scanner.nextInt();
                System.out.println("Bolme : " + ((double)a/b));
                break;
            default:
                System.out.println("Gecersiz Islem!!");
                break;
        }
    }
}
