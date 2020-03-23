
public class Ucgen extends Sekil {
    private int a;
    private int b;
    private int c;

    public Ucgen(String ad, int a, int b, int c) {
        super(ad);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void alanHesapla() {
        double u = (a + b + c) / 2.0;
        
        double alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.println(getAd() + " alanı : " + alan);
    }
    
    
}
