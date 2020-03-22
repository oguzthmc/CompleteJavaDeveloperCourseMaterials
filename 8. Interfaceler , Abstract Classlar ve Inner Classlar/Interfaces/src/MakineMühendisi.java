public class MakineMühendisi implements IMuhendis, ICalisma {

    @Override
    public void calis() {
        System.out.println("Makine Mühendisi Çalışıyor...");
    }

    private boolean askerlik;
    private boolean adliSicil;

    public MakineMühendisi(boolean askerlik, boolean adliSicil) {
        this.askerlik = askerlik;
        this.adliSicil = adliSicil;
    }
    
    @Override
    public void askerlikDurumuSorgula() {
        if (askerlik) {
            System.out.println("Askerliğimi Yaptım.");
        }
        else {
            System.out.println("Askerliğimi Henüz Yapmadım!");
        }
    }

    @Override
    public String mezuniyetOrtalamasi(double derece) {
        return "Ortalamam: " + derece;
    }

    @Override
    public void adliSicilSorgula() {
        if (adliSicil) {
            System.out.println("Adli Sicil Kaydım Bulunuyor!");
        }
        else {
            System.out.println("Herhangi bir adli sicil kaydım bulunmuyor.");
        }
    }

    @Override
    public void isTecrubesi(String[] array) {
        if (array.length == 0) {
            System.out.println("Herhangi bir iş tecrübem bulunmuyor!");
        }
        else {
            System.out.println("Makine Mühendisi Olarak Şu Şirketlerle Çalıştım:");
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        }
    }
    
    public void referansGoster(String[] array) {
        if (array.length == 0) {
            System.out.println("Herhangi bir referansım bulunmuyor!");
        }
        else {
            System.out.println("Referanslarım:");
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        }
    }
    
}
