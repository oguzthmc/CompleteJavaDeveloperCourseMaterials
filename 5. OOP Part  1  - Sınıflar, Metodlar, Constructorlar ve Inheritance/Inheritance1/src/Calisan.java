
public class Calisan {  //Superclass or BaseClass
    private String isim;
    private String departman;
    private int maas;

    public Calisan(String isim, String departman, int maas) {
        this.isim = isim;
        this.departman = departman;
        this.maas = maas;
    }
    
    public void calis() {
        System.out.println("Çalışan Çalışıyor...");
    }
    public void bilgileriGoster() {
        System.out.println("İsim: " + isim);
        System.out.println("Departman: " + departman);
        System.out.println("Maaş: " + maas);
    }
    public void departmanDegistir(String yeniDepartman) {
        System.out.println("Departman değiştiriliyor...");
        this.departman = yeniDepartman;
        
        System.out.println("Yeni departman: " + this.departman);
    }

    /**
     * @return the isim
     */
    public String getIsim() {
        return isim;
    }

    /**
     * @param isim the isim to set
     */
    public void setIsim(String isim) {
        this.isim = isim;
    }

    /**
     * @return the departman
     */
    public String getDepartman() {
        return departman;
    }

    /**
     * @param departman the departman to set
     */
    public void setDepartman(String departman) {
        this.departman = departman;
    }

    /**
     * @return the maas
     */
    public int getMaas() {
        return maas;
    }

    /**
     * @param maas the maas to set
     */
    public void setMaas(int maas) {
        this.maas = maas;
    }
}
