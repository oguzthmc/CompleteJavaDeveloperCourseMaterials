/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor2;

/**
 *
 * @author Acer
 */
public class Constructor2 {

    public static void main(String[] args) {
        Account account1 = new Account();
        
        //System.out.println(account1.getEmail());
        Account account2 = new Account("Ahmet Can", "example@gmail.com", "87987897");
        
        //System.out.println(account2.getEmail());
        //System.out.println(account2.getBakiye());
        
        account2.bilgileriGoster();
    }
    
}
