
public class Main {
    public static void main(String[] args) {
        //İç içe for döngüsü kullanarak bir çarpım tablosu oluşturalım.
        System.out.println("   Çarpım Tablosu");
        System.out.println("   --------------");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("\t");
                System.out.println(i + "*" + j + "=" + (i * j));
            }
            System.out.println("********************");
        }
    }
}
