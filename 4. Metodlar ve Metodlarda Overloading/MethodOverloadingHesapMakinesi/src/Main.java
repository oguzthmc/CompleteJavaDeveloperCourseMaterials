
import java.util.Scanner;


public class Main {
    /*
    Method Overloading kullanarak bir tane hesap makinesi tasarlamaya çalışalım.
    Toplama ve Çarpma metodlarını 2 veya 3 parametre alacak şekilde tasarlayalım.
    */
    
    public static int cikarma(int a, int b) {
        return (a - b);
    }
    
    public static double bolme(int a, int b) {
        return ((double) a / b);
    }
    
    public  static int toplama(int a, int b) {
        return (a + b);
    }
    
    public static int toplama(int a, int b, int c) {
        return (a + b + c);
    }
    
    public static int carpma(int a, int b) {
        return (a * b);
    }
    
    public static int carpma(int a, int b, int c) {
        return (a * b * c);
    }
    
    public static void main(String[] args) {
        String islemler = "1. Toplama İşlemi\n"
                          + "2. Çıkarma İşlemi\n"
                          + "3. Çarpma İşlemi\n"
                          + "4. Bölme İşlemi\n"
                          + "Çıkış için q'ya basın.\n";
        
        System.out.println("************************************");
        System.out.println(islemler);
        System.out.println("************************************");
        
        Scanner scanner = new Scanner(System.in);
        while (true) {            
            System.out.print("İşlemi Seçiniz : ");
            String islem = scanner.nextLine();
            
            if (islem.equals("q")) {
                System.out.print("Programdan çıkılıyor...\n");
                break;
            }
            else if (islem.equals("1")) {
                System.out.print("Kaç değer toplayacaksınız? (2 veya 3) : ");
                int kacSayi = scanner.nextInt();
                if (kacSayi == 2) {
                    System.out.print("a : ");
                    int a = scanner.nextInt();
                    System.out.print("b : ");
                    int b = scanner.nextInt();
                    scanner.nextLine(); //enter karakteri okunması
                    
                    System.out.println("İki Sayının Toplamı : " + toplama(a, b));
                }
                else if (kacSayi == 3) {
                    System.out.print("a : ");
                    int a =scanner.nextInt();
                    System.out.print("b : ");
                    int b = scanner.nextInt();
                    System.out.print("c : ");
                    int c = scanner.nextInt();
                    scanner.nextLine(); //enter karakteri okunması
                    
                    System.out.println("Üç Sayının Toplamı : " + toplama(a, b, c));
                }
                else {
                    System.out.println("Bunun için uygun metod bulunmuyor..!");
                }
            }
            else if (islem.equals("2")) {
                System.out.print("a : ");
                int a = scanner.nextInt();
                System.out.print("b : ");
                int b = scanner.nextInt();
                scanner.nextLine(); //enter karakteri okunması

                System.out.println("İki Sayının Farkı : " + cikarma(a, b));
            }
            else if (islem.equals("3")) {
                System.out.print("Kaç değer çarpacaksınız? (2 veya 3) : ");
                int kacSayi = scanner.nextInt();
                if (kacSayi == 2) {
                    System.out.print("a : ");
                    int a = scanner.nextInt();
                    System.out.print("b : ");
                    int b = scanner.nextInt();
                    scanner.nextLine(); //enter karakteri okunması
                    
                    System.out.println("İki Sayının Çarpımı : " + carpma(a, b));
                }
                else if (kacSayi == 3) {
                    System.out.print("a : ");
                    int a =scanner.nextInt();
                    System.out.print("b : ");
                    int b = scanner.nextInt();
                    System.out.print("c : ");
                    int c = scanner.nextInt();
                    scanner.nextLine(); //enter karakteri okunması
                    
                    System.out.println("Üç Sayının Çarpımı : " + carpma(a, b, c));
                }
                else {
                    System.out.println("Bunun için uygun metod bulunmuyor..!");
                }
            }
            else if (islem.equals("4")) {
                System.out.print("a : ");
                int a = scanner.nextInt();
                System.out.print("b : ");
                int b = scanner.nextInt();
                scanner.nextLine(); //enter karakteri okunması

                System.out.println("İki Sayının Bölümü : " + bolme(a, b));
            }
            else {
                System.out.println("Yanlış karakter girdiniz! Lütfen tekrar deneyin..");
            }
        }
    }
}
