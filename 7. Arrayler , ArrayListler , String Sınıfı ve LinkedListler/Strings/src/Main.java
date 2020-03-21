public class Main {

    public static void main(String[] args) {
        
        //System.out.println(b);
        
        /*System.out.println("Harf Sayısı : " + b.length());
        
        System.out.println("0. indeks : " + b.charAt(0));
        System.out.println("2. indeks : " + b.charAt(2));
        System.out.println("Son eleman : " + b.charAt(b.length()-1));*/
        
        /*for (int i = 0; i < b.length(); i++) {
            System.out.println(b.charAt(i));
        }*/
        
        /*System.out.println(b.startsWith("To"));
        System.out.println(b.endsWith("Oğ"));*/
        
        /*System.out.println(b.lastIndexOf('u'));
        System.out.println(b.toLowerCase());
        System.out.println(b.toUpperCase());*/
        
        /*String tc = "1923";
        
        int tci = Integer.parseInt(tc);
        
        System.out.println(tci - 42);*/
        
        /*int tc2 = 1923;
        String tc2Str = String.valueOf(tc2);
        System.out.println(tc2Str);*/
        
        /*String a1 = "Oğuzhan";
        String a2 = "Oğuzhan";
                
        if (a1 == a2) {
            System.out.println("Eşitler");
        }*/
        
        String b1 = new String("Tohumcu");
        String b2 = new String("Tohumcu");
        
        //equals ile içerik kontrolü
        //"==" ile hem adres hem içerik kontrolü yapılır
        if (b1.equals(b2)) {
            System.out.println("Eşitler");
        }
        else {
            System.out.println("Eşit Değiller!");
        }
        
    }
}
