/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labw6;

/**
 *
 * @author kitti
 */
public class Food {
    private static double price = 50;
    private final static int energy = 10;

    public static double getPrice() {
        return price;
    }

    public static void setPrice(double price) {
        if (price > Food.price){
            Food.price = price;
        }
        else{
            System.out.println("Cannot update the food price.");
        }
    }

    public static int getEnergy() {
        return energy;
    }
    
}
