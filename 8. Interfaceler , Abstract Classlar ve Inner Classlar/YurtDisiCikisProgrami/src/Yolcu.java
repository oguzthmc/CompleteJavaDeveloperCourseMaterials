
import java.util.Scanner;

public class Yolcu implements YurtDisiKurallari {

    private int harc;
    private boolean yasak;
    private boolean vize;
    
    //no parameter constructor
    public Yolcu() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Yatırdığınız Harç Bedeli : ");
        this.harc = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Siyasi Yasağınız Var mı? (evet / hayır) : ");
        String cevap = scanner.nextLine();
        cevap = cevap.toLowerCase();
        
        if (cevap.equals("evet")) {
            this.yasak = true;
        }
        else {
            this.yasak = false;
        }
        
        System.out.print("Vizeniz Var mı? (evet / hayır) : ");
        String cevap2 = scanner.nextLine();
        
        if (cevap2.equals("evet")) {
            this.vize = true;
        }
        else {
            this.vize = false;
        }
    }

    @Override
    public boolean yurtdisiHarci() {
        if (this.harc < 50) {
            System.out.println("Lütfen yurtdışı çıkış harcını tam yatırın!");
            return false;
        }
        else {
            System.out.println("Yurtdışı harcı işlemi tamam.");
            return true;
        }
    }

    @Override
    public boolean siyasiYasak() {
        if (this.yasak == true) {
            System.out.println("Siyasi yasağınız vardır. Yurtdışına çıkamazsınız!!");
            return false;
        }
        else {
            System.out.println("Siyasi yasağınız yoktur..");
            return true;
        }
    }

    @Override
    public boolean vizeDurumu() {
        if (this.vize == true) {
            System.out.println("Vize işlemleri tamam.");
            return true;
        }
        else {
            System.out.println("Gideceğiniz ülkeye vizeniz yoktur!!!");
            return false;
        }
    }
    
}
