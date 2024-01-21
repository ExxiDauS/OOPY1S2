/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mockoop;

/**
 *
 * @author User
 */
public class Dog extends Animal{
    public Dog(String name, int age){
        super(name, 200, age);
    }
    
    @Override
    public void eat(Food f){
        this.setPower(this.getPower() + f.getPower());
    }
    
    public void kick(Animal a){
        a.setPower(a.getPower() - 10);
    }
}
