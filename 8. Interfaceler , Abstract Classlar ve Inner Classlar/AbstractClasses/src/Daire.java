public class Daire extends Sekil {

    private int yaricap;
    
    public Daire(String ad, int yaricap) {
        super(ad);
        this.yaricap = yaricap;
    }

    @Override
    void alanHesapla() {
        System.out.println(getAd() + " alanı : " + (Math.PI * yaricap * yaricap));
    }

    
    
}
