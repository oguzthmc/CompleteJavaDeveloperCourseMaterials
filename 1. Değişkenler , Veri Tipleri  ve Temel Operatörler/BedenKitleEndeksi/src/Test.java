
import java.util.Scanner;

/*
    Kullanicidan aldiginiz boy ve kilo degerlerine gore kullanicinin beden kitle endeksini bulur.
    Beden Kitle Endeksi : Kilo / (Boy(m) * Boy(m))
*/

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Kilonuzu Girin : ");
        int kilo = scanner.nextInt();
        System.out.print("Boyunuzu Girin (Ornek : 1,72) : ");
        double boy = scanner.nextDouble();
        
        double bki = kilo / (boy * boy);
        System.out.println("Beden Kitle Endeksiniz : " + bki);
    }
}
