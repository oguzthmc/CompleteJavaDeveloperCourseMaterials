
public class GelismisAbone {
    
    private String ad;
    private int bakiye = 120;
    private String sehir;

    public GelismisAbone(String ad, int bakiye, String sehir) {
        this.ad = ad;
        this.sehir = sehir;
        
        if (bakiye >= 0 && bakiye <= 120) {
            this.bakiye = bakiye;
        }
    }
    
    public void dogalgazKullan(int miktar) {
        if (this.bakiye - miktar < 0) {
            System.out.println("Yeterli Bakiye Yok.");
        }
        else {
            this.bakiye -= miktar;
            
            if (this.bakiye <= 0) {
                System.out.println("Bakiyeniz bitmiştir. Lütfen en yakın abone"
                + " merkezine giderek kredi yükleyin.." + " Kredi Limiti = 120 TL");
            }
            else {
                System.out.println("Yeni Bakiye = " + bakiye);
            }
        }
    }
    
    public void bakiyeOgren() {
        System.out.println("Bakiye = " + bakiye);
    }
}
