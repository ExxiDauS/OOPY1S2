/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labw6;

/**
 *
 * @author kitti
 */
public class Seller extends Employee{
    public Food sell(Employee e){
        Food food = new Food();
        if (e.getWallet().getBalance() > Food.getPrice()){
            this.getWallet().setBalance(Food.getPrice());
            e.getWallet().setBalance(-Food.getPrice());
            return food;
        }
        else{
            System.out.println("Your money is not enough.");
            return null;
        }
    }
}
