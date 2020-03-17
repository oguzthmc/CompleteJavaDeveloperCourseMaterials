
public class Test {
    public static void main(String[] args) {
        
        Account account1 = new Account();
        
        account1.setHesapNo("123456");
        account1.setBakiye(1000.0);
        account1.setIsim("Oğuzhan Tohumcu");
        account1.setEmail("oguzthmc@gmail.com");
        account1.setTelefonNo("2141023158");
        
        System.out.println("Bakiye " + account1.getBakiye());
    }
}
