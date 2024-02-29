/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labw11;

/**
 *
 * @author kitti
 */
public class Customer {
    private CheckingAccount acct;
    private String firstName;
    private String lastName;

    public Customer(String firstName, String lastName, CheckingAccount acct) {
        this.acct = acct;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public Customer(String firstName, String lastName) {
        this(firstName, lastName, null);
    }
    
    public Customer() {
        this("", "", null);
    }

    public CheckingAccount getAcct() {
        return acct;
    }

    public void setAcct(CheckingAccount acct) {
        this.acct = acct;
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
    
    @Override
    public String toString(){
        String check;
        if (this.getAcct() == null){
            check = ( this.getFirstName() + " " + this.getLastName() + " doesn’t have account.");
        }
        else{
            check = ("The " + this.getFirstName() + " account has " + this.getAcct().getBalance() + " baht and " + this.getAcct().getCredit() + "  credits.");
        }
        return check;
    }
    
    public boolean equals(Customer c){
        return this.getFirstName().equals(c.getFirstName());
    }
}
