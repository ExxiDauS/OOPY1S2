/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labw10;

/**
 *
 * @author kitti
 */
public class Main {
    public static void main(String[] args) {
//  ** Prob.01 **
//        Account a1 = new Account(5000, "Sommai");
//        Account a2 = new Account(3000, "Somchai");
//        Account a3 = new Account(900, "Somsri");
//        
//        Bank myBank = new Bank();
//        myBank.addAccount(a1);
//        myBank.addAccount(a2);
//        myBank.addAccount(a3);
//        
//        System.out.println("Number of Account: " + myBank.getNumAccount());
//        myBank.getAccount(0).showAccount();
//        System.out.println("Deposit 500...");
//        myBank.getAccount(0).deposit(500);
//        myBank.getAccount(0).showAccount();
//        System.out.println("Show all accounts");
//        
//        System.out.println("=====================");
//        for (int i = 0; i < myBank.getNumAccount(); i++) {
//            myBank.getAccount(i).showAccount();   
//        }

//  ** Prob.02 **
        Customer cust = new Customer("Somsri", "Boonjing");
        Account acct1 = new Account(5000, "Somsri01");
        Account acct2 = new Account(3000, "Somsri02");
        cust.addAccount(acct1);
        cust.addAccount(acct2);
//        Test for Deposit and Withdraw.
        cust.getAccount(0).withdraw(3000);
        cust.getAccount(1).deposit(3000);
//        Show info of the customer.
        System.out.println(cust);
//        Add another acct to that customer and test. Can it be overloaded ?
        Account acct3 = new Account(0, "");
        Account acct4 = new Account(0, "");
        Account acct5 = new Account(0, "");
        Account acct6 = new Account(0, "");
        cust.addAccount(acct3);
        cust.addAccount(acct4);
        cust.addAccount(acct5);
        cust.addAccount(acct6);
        for (int i = 0; i < cust.getNumAccount(); i++){
            cust.getAccount(i).showAccount();
        }
    }
}
