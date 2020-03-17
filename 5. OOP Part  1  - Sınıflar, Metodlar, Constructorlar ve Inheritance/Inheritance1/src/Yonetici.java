
public class Yonetici extends Calisan { //SubClass

    private int sorumluKisi;
    
    public Yonetici(String isim, String departman, int maas, int sorumluKisi) {
        super(isim, departman, maas);
        
        this.sorumluKisi = sorumluKisi;
    }
    
    public void zamYap(int zamMiktari) {
        System.out.println("Çalışanlara " + zamMiktari + " TL zam yapıldı.");
    }
    
    public void bilgileriGoster() {
        super.bilgileriGoster();
        
        System.out.println("Sorumlu Kişi Sayısı: " + this.sorumluKisi);
    }
    
}
