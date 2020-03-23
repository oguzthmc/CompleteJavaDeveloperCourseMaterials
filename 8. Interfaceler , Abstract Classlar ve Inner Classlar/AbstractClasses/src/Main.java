public class Main {
    public static void main(String[] args) {
        //abstract classlardan obje oluşturulamaz!
        //Sekil sekil = new Sekil("Sekil");
        
        Kare kare1 = new Kare("Kare1", 5);
        Daire daire1 = new Daire("Daire1", 3);
        Sekil sekil = new Kare("Kare2", 6);
        
        kare1.alanHesapla();
        daire1.alanHesapla();
        kare1.cevreHesapla();
        
        sekil.alanHesapla();
        //abstract class kendisinde olmayan bir metodu göremez!
        //sekil.cevreHesapla();
    }
}
