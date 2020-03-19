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

class Kus extends Hayvan {

    public Kus(String ad) {
        super(ad);
    }

    @Override
    public String konus() {
        return this.getAd() + " ötüyor..";
    }
}

public class Main {
    
    public static void konustur(Object object) {
        //System.out.println(object.konus());
        
        if (object instanceof Kopek) {
            Kopek kopek = (Kopek) object;
            System.out.println(kopek.konus());
        }
        else if (object instanceof Kedi) {
            Kedi kedi = (Kedi) object;
            System.out.println(kedi.konus());
        }
        else if (object instanceof At) {
            At at = (At) object;
            System.out.println(at.konus());
        }
        else if (object instanceof Hayvan) {
            Hayvan hayvan = (Hayvan) object;
            System.out.println(hayvan.konus());
        }
        else if (object instanceof Kus) {
            Kus kus = (Kus) object;
            System.out.println(kus.konus());
        }
    }
    
    public static void main(String[] args) {
        //instanceof
        /*Kopek kopek = new Kopek("Tarçın");
        
        if(kopek instanceof Kopek) {
            System.out.println("Bu nesne Kopek sınıfındandır...");
        }*/
        
        Kopek kopek = new Kopek("Tarçın");
        Kedi kedi = new Kedi("Boncuk");
        At at = new At("Düldül");
        Hayvan hayvan = new Hayvan("Kömür");
        Kus kus = new Kus("Zıpır");
        
        konustur(kopek);
        konustur(kedi);
        konustur(at);
        konustur(hayvan);
        konustur(kus);
    }
}