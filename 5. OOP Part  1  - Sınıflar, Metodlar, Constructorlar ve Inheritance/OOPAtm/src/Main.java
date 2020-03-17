
public class Main {
    public static void main(String[] args) {
        // Object Oriented ATM Programı
        
        // Login Class'ı Kullanıcı Girişini Kontrol Edecek.
        
        // Hesap Class'ı Hesap İşlemlerini Yapacak.
        
        // ATM ise atm'mizi çalıştıracak.
        
        ATM atm = new ATM();
        
        Hesap hesap = new Hesap("Oguzhan", "12345", 2200);
        
        atm.calis(hesap);
        System.out.println("Programdan Çıkılıyor...");
    }
}
