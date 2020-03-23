public abstract class Sekil {
    
    private String ad;

    public Sekil(String ad) {
        this.ad = ad;
    }
    
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }
    
    public void adiniSoyle() {
        System.out.println("Bu obje " + ad + " objesidir.");
    }
    
    abstract void alanHesapla();

}
