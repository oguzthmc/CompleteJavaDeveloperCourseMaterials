
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    
    public static void listeyiBatir(LinkedList<String> yerler) {
        /*for (String s : yerler) {
            System.out.println(s);
        }*/
        
        ListIterator<String> iterator = yerler.listIterator();
        
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    
    public static void siraliEkle(LinkedList<String> yerler, String yeni) {
        ListIterator<String> iterator = yerler.listIterator();
        
        while (iterator.hasNext()) {
            int karsilastir = iterator.next().compareTo(yeni);
            
            if (karsilastir == 0) {
                //iki değer eşit
                System.out.println("Listenizde bu eleman zaten var...");
                
                return;
            }
            else if (karsilastir < 0) {
                //yeni değer iterator.next ten daha büyük
            }
            else if (karsilastir > 0) {
                iterator.previous();
                iterator.add(yeni);
                
                return;
            }
        }
        iterator.add(yeni);
    }

    public static void main(String[] args) {
        LinkedList<String> gidilecekYerler = new LinkedList<String>();
        
        siraliEkle(gidilecekYerler, "Postane");
        siraliEkle(gidilecekYerler, "Market");
        siraliEkle(gidilecekYerler, "Ev");
        
        listeyiBatir(gidilecekYerler);
        
        /*gidilecekYerler.add("Postane");
        gidilecekYerler.add("Market");
        gidilecekYerler.add("Okul");
        gidilecekYerler.add("Kütüphane");
        gidilecekYerler.add("Spor Salonu");
        gidilecekYerler.add("Ev");
        
        listeyiBatir(gidilecekYerler);
        
        System.out.println("-------------------");
        
        //gidilecekYerler.add(4, "Alışveriş Merkezi");
        
        gidilecekYerler.remove(3);
        listeyiBatir(gidilecekYerler);*/
        
        
        
    }
    
}
