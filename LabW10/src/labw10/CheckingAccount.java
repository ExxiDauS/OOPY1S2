/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labw10;

/**
 *
 * @author kitti
 */
public class CheckingAccount extends Account{
    private double credit;
    
    public CheckingAccount(){
        super(0, "");
        this.credit = 0;
    }
    
    public CheckingAccount(double balance, String name, double credit) {
        super(balance, name);
        this.credit = credit;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        if(credit > 0){
            this.credit += credit;
        }
        else{
            System.out.println("Input number must be a positive integer.");
        }
    }
    
    @Override
    public String toString(){
        String check = "The " + this.getName() + " account has " + this.getBalance() + " baht and " + this.getCredit() + " credits.";
        return check;
    }
    
    @Override
    public void withdraw(double a){
        if((this.getBalance() - a) >= 0){
            super.balance -= a;
            System.out.println(a + " baht is withdrawn from " + this.getName() + " and your credit balance is " + this.getCredit() + ".");

        }
        else if(((this.getBalance() - a) + this.getCredit() ) > 0 ){
            this.setBalance(-this.getBalance());
            this.setCredit(this.getBalance() - a);
            System.out.println(a + " baht is withdrawn from " + this.getName() + " and your credit balance is " + this.getCredit() + ".");
        }
        else{
            System.out.println("Not enough money!");
        }
    }
    
    public void withdraw(String a){
        this.withdraw(Double.parseDouble(a));
    }
    
}
