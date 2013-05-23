/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package account;

import Domain.Account2;

/**
 *
 * @author anri
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Account2 Aso  = new Account2(); 
        Aso.deposit(2000);
          System.out.println(Aso.getBalance());
    }
 
}
