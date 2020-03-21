import java.util.ArrayList;

public class Main {

    public static void yazdir(ArrayList<String> as) {
        for (int i = 0; i < as.size(); i++) {
            System.out.println("Element " + (i+1) + ": " + as.get(i));
        }
    }
    
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        
        arrayList.add("Metallica");
        arrayList.add("Guns' n Roses");
        arrayList.add("Black Sabbath");
        arrayList.add("Iron Maiden");
        arrayList.add("AC/DC");
        
        //System.out.println(arrayList.get(0));
        //System.out.println(arrayList.get(3));
        //System.out.println(arrayList.get(5));
        
        //System.out.println(arrayList.size());
        
        //arrayList.remove(1);
        //arrayList.remove("Metallica");
        
        /*System.out.println(arrayList.indexOf("Metallica"));
        System.out.println(arrayList.lastIndexOf("Metallica"));
        System.out.println(arrayList.indexOf("Led Zeppelin"));*/
        
        /*arrayList.set(4, "Megadeth");
        
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }*/
        
        yazdir(arrayList);
        
    }
}
