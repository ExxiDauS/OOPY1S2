/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labw4;

/**
 *
 * @author kitti
 */
public class Account {
 public double balance;
 public String name;
 
 public void deposit(double b){
     if (b >= 0){
         this.balance += b;
     }
     else{
         System.out.println("The balance variable must be greater than or equal to zero.");
     }
 }
 public void showInfo(){
     System.out.println("In " + this.name + " account, there is a balance equal to " + this.balance + " baht. ");
 }
 public double withdraw(double b){
     if (b < 0 || b >= this.balance){
         System.out.println("Your account balance is insufficient.");
         return 0;
     }
     else{
        if (b >= 0 && b <= this.balance){
            this.balance -= b;
            return b;
        }
        else{
            System.out.println("The balance variable must be greater than or equal to zero.");
            return 0;
        }
     }
 }
}
