
public class Main {
    public static void main(String[] args) {
        /*Abone abone = new Abone();
        
        abone.ad = "Oğuzhan Tohumcu";
        abone.bakiye = 200;
        abone.sehir = "İstanbul";
        
        abone.dogalgazKullan(200);*/
        
        GelismisAbone gelismisAbone = new GelismisAbone("Oğuzhan Tohumcu", 200, "İstanbul");
        gelismisAbone.bakiyeOgren();
    }
}
