
import java.util.ArrayList;

public class Sarkicilar {
    private ArrayList<String> sarkiciListesi = new ArrayList<String>();
    
    public void sarkicilariBastir() {
        System.out.println("Şarkıcı Listesinde " + sarkiciListesi.size() + " tane şarkıcı var");
        
        for (int i = 0; i < sarkiciListesi.size(); i++) {
            System.out.println((i+1) + ".Şarkıcı : " + sarkiciListesi.get(i));
        }
    }
    
    public void sarkiciEkle(String ad) {
        sarkiciListesi.add(ad);
        
        System.out.println("Şarkıcı Listesi Güncellendi...");
    }
    
    public void sarkiciGuncelle(String yeniAd, int pozisyon) {
        sarkiciListesi.set(pozisyon, yeniAd);
        
        System.out.println("Şarkıcı Listesi Güncellendi..");
    }
    
    public void sarkiciSil(int pozisyon) {
        String ad = sarkiciListesi.get(pozisyon);
        
        sarkiciListesi.remove(pozisyon);
        
        System.out.println(ad + " adlı şarkıcı listeden silindi..!");
    }
    
    public void sarkiciAra(String sarkiciAdi) {
        int pozisyon = sarkiciListesi.indexOf(sarkiciAdi);
        
        if (pozisyon >= 0) {
            System.out.println("Şarkıcı Bulundu.");
            System.out.println(sarkiciAdi + " adlı şarkıcı " + (pozisyon+1) + ". pozisyonda");
        }
        else {
            System.out.println("Şarkıcı Bulunamadı!!");
        }
    }
}
