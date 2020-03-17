
public class Main {
    public static void main(String[] args) {
        /*
            Mantiksal Operatorler
            ---------------------
            && ---> and Operatoru
            Butun sonuclar kendi icinde true ise genel sonuc true, 
            en az birisi false ise genel sonuc false olur.
        
            || ---> or Operatoru
            Sonuclardan en az birisi bile true ise genel sonuc true, 
            hepsi false ise genel sonuc false olur.
        
            ! ---> not Operatoru
        */
        System.out.println(3 == 3);
        System.out.println(2 < 3);
        System.out.println("Murat" == "Murat");
        
        System.out.println(3 == 3 && 2 < 3 && "Murat" == "Murat");
        System.out.println(3 != 3 || 2 > 3 || "Murat" != "Murat");
        
        System.out.println(!(3 < 4));
        
        System.out.println(!((3 < 4 && "Murat" == "Murat") || 3.4 > 2.1));
    }
}
