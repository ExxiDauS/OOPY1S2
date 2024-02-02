/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labw6;

/**
 *
 * @author kitti
 */
public class Employee {
    private int energy;
    private String name;
    private Wallet wallet;
    private static String nationality = "Thai";

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy += energy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    public static String getNationality() {
        return nationality;
    }

    public static void setNationality(String nationality) {
        Employee.nationality = nationality;
    }
    
    public boolean buyFood(Seller s){
//        eat and buy foods
        Food food;
        food = s.sell(this);
        if (food != null){
            this.eat(food);
            return true;
        }
        else{
            return false;
        }
    }
    
    public void eat(Food f){
        this.energy += f.getEnergy();
    }
    
    public boolean equals(Employee e){
        return true ? this.name.equals(e.name) : false;
    }
    
    @Override
    public String toString(){
        String sentance = "My name is " + this.name + ". \nI have " + this.energy + " energy left.\nI have a balance of " + this.wallet.getBalance() + " baht.";
        return sentance;
    }
}
