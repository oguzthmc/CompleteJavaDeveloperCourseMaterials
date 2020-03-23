
public class Kare extends Sekil {
    private int kenar;

    public Kare(String ad, int kenar) {
        super(ad);
        this.kenar = kenar;
    }

    @Override
    public void alanHesapla() {
        System.out.println(getAd() + " alanı : " + (kenar * kenar));
    }
    
}
