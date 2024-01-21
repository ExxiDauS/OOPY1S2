/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mockoop;

/**
 *
 * @author User
 */
public abstract class Animal {
    private int age;
    private String name;
    private int power;
    
    public Animal(){
        this("", 0, 0);
    }
    
    public Animal(String name, int power, int age){
        this.name = name;
        this.age = age;
        this.power = power;
    }
    
    public int getAge(){
        return age;
    }
    
    public String getName(){
        return name;
    }
    
    public int getPower(){
        return power;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setPower(int power){
        this.power = power;
    }
    
    public abstract void eat(Food f);
    
    public boolean equals(Animal a){
        return a.getName().equals(this.name) && a.getAge() == this.age;
    }
    
    @Override
    public String toString(){
        return "Animal : name = " + name + ", power = " + power + ", age = " + age;
    }
}
