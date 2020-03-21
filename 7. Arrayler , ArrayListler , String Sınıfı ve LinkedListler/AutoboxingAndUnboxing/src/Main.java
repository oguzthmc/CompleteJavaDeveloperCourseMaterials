
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
            Wrapper Class
            
            boolean ------> Boolean
            char    ------> Character
            byte    ------> Byte
            short   ------> Short
            int     ------> Integer
            long    ------> Long
            float   ------> Float
            double  ------> Double
        */
        
        ArrayList<String> arrayList = new ArrayList<String>();
        
        //ArrayList<double> arrayList2 = new ArrayList<double>();
        
        ArrayList<Integer> arrayList3 = new ArrayList<Integer>();
        
        /*for (int i = 0; i < 10; i++) {
            arrayList3.add(Integer.valueOf(i*4));   //Autoboxing
        }
        
        for (int i = 0; i < arrayList3.size(); i++) {
            System.out.println(arrayList3.get(i).intValue());   //Unboxing
        }*/
        
        for (int i = 0; i < 10; i++) {
            arrayList3.add(i*4);    //Integer.valueOf(i*4)
        }
        
        for (int i = 0; i < arrayList3.size(); i++) {
            System.out.println(arrayList3.get(i));  //arrayList3.get(i).intValue()
        }
        
    }
}
