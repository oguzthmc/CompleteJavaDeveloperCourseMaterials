public class Main {
    public static void main(String[] args) {
        
        String[] array = {"Elma", "Armut", "Kiraz"};
        int[] array2 = {1,2,3,4,5,6,7};
        Deneme[] array3 = {new Deneme("Oğuzhan"),new Deneme("Murat"),new Deneme("Fatih")};
        
        /*for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }*/
        
        for (Deneme d : array3) {
            d.yazdir();
        }
        
        for (int i : array2) {
            System.out.println(i);
        }
        
        for (String a : array) {
            System.out.println(a);
        }
    }
}
