public class Kare extends Sekil {
    
    private int kenar;

    public Kare(String ad, int kenar) {
        super(ad);
        this.kenar = kenar;
    }

    @Override
    void alanHesapla() {
        System.out.println(getAd() + " alanı : " + (kenar * kenar));
    }
    
    public void cevreHesapla() {
        System.out.println(getAd() + " çevresi : " + (4 * kenar));
    }
    
}
