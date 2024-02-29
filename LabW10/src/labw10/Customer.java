/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labw10;
import java.util.*;

/**
 *
 * @author kitti
 */
public class Customer {
    private String firstName;
    private String lastName;
//    private Account acct[];
    private ArrayList acct;
    private int numOfAccount;


    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
//        acct = new Account[5];
        acct = new ArrayList();
    }
    
    public Customer() {
        this("", "");
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public Account getAccount(int index){
//        return acct[index];
        return (Account) acct.get(index);
    }
    
    public void addAccount(Account acct){
//        this.acct[numOfAccount] = acct;
        this.acct.add(acct);
        numOfAccount += 1;
    }
    
    public int getNumAccount(){
//        return numOfAccount;
        return acct.size();
    }
    
    @Override
    public String toString(){
        String tmp;
        tmp = "Firstname: " + firstName + " LastName: " + lastName + " NumberOfAccount: " + numOfAccount;
        return tmp;
    }
    
    public boolean equals(Customer c){
        return this.getFirstName().equals(c.getFirstName());
    }
}
