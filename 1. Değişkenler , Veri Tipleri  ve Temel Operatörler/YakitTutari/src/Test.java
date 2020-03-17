
import java.util.Scanner;

/*
 * Bir aracin kilometrede ne kadar yaktigi ve kac kilometre yol yaptigi bilgilerini
 * alarak, toplam odenecek tutari hesaplar.
 */

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Araciniz kilometrede kac kurus yakiyor? (Ornek: 0,32) ");
        double kurus = scanner.nextDouble();
        
        System.out.print("Aracinizla kac kilometre gittiniz? : ");
        int km = scanner.nextInt();
        
        System.out.println("Toplam odemeniz gereken tutar : " + (kurus * km) + " TL dir.");
    }
}
