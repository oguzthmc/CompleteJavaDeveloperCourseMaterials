public class Main {
    public static void main(String[] args) {
        //Interfacelerden obje oluşturulamaz!
        //IMuhendis muhendis1 = new IMuhendis();
        
        //IMuhendis muhendis1 şeklinde de olabilir.
        PcMuhendisi muhendisi1 = new PcMuhendisi(false, false);
        
        muhendisi1.askerlikDurumuSorgula();
        muhendisi1.adliSicilSorgula();
        System.out.println(muhendisi1.mezuniyetOrtalamasi(3.07));
        
        String[] tecrube = {"Vestel","Havelsan","Turkcell"};
        muhendisi1.isTecrubesi(tecrube);
        
        System.out.println("--------------------------------------");
        
        //IMuhendis muhendis1 şeklinde olamaz!
        //Çünkü interface de olmayan bir metot yazdık.
        MakineMühendisi muhendis2 = new MakineMühendisi(true, false);
        
        String[] tecrube2 = {};
        String[] referans = {"İbrahim Özçelik","Seçkin Arı"};
        
        muhendis2.askerlikDurumuSorgula();
        muhendis2.adliSicilSorgula();
        System.out.println(muhendis2.mezuniyetOrtalamasi(2.31));
        muhendis2.isTecrubesi(tecrube2);
        muhendis2.referansGoster(referans);
        muhendis2.calis();
    }
}
