class Hayvan {
    private String ad;

    public Hayvan(String ad) {
        this.ad = ad;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }
    
    public String konus() {
        return "Hayvan konuşuyor...";
    }
}

class Kedi extends Hayvan {
    public Kedi(String ad) {
        super(ad);
    }

    @Override
    public String konus() {
        return this.getAd() + " miyavlıyor..";
    }
}

class Kopek extends Hayvan {
    public Kopek(String ad) {
        super(ad);
    }

    @Override
    public String konus() {
        return this.getAd() + " havlıyor..";
    }
}

class At extends Hayvan {
    public At(String ad) {
        super(ad);
    }

    @Override
    public String konus() {
        return this.getAd() + " kişniyor..";
    } 
}


public class Main {
    
    public static void konustur(Hayvan hayvan) {
        System.out.println(hayvan.konus());
    }
    
    public static void main(String[] args) {
        /*Hayvan hayvan1 = new Kedi("Boncuk");
        Hayvan hayvan2 = new Kopek("Tarçın");
        Hayvan hayvan3 = new At("Düldül");
        
        System.out.println(hayvan1.konus());
        System.out.println(hayvan2.konus());
        System.out.println(hayvan3.konus());*/
        
        konustur(new Kedi("Boncuk"));
        konustur(new Kopek("Tarçın"));
        konustur(new At("Düldül"));
    }
}