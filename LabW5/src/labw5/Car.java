/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labw5;

/**
 *
 * @author kitti
 */
public class Car extends Vehicle{
    private String typeEngine;
    public String getTypeEngine(){
        return typeEngine;
    }
    public void setCarInfo(int s, String t, String y){
        this.setFuel(s);
        this.setTopSpeed(t);
        this.typeEngine = y;
    }
    public void setTypeEngine(String t){
        this.typeEngine = t;
    }
    public void move(){
        if (this.getFuel() < 50){
            System.out.println("Please add fuel.");
        }
        else{
            System.out.println("Move.");
            this.setFuel(this.getFuel()-50);
        }
    }
    public void showCarInfo(){
        System.out.println("Car engine is " + this.typeEngine + ".");
        this.showInfo();
    }
}
