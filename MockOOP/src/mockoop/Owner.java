/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mockoop;

/**
 *
 * @author User
 */
public class Owner {
    protected Animal animal;
    
    protected final String name;
    
    public Owner(){
        this("", null);
    }
    
    public Owner(Animal animal){
        this("", animal);
    }
    
    public Owner(String name){
        this(name, null);
    }
    
    public Owner(String name, Animal animal){
        this.name = name;
        this.animal = animal;
    }
    
    public Animal getAnimal(){
        return animal;
    }
    
    public String getName(){
        return name;
    }
    
    public void setAnimal(Animal animal){
        this.animal = animal;
    }
    
    public void feedFood(Food f){
        animal.eat(f);
    }
    
    public void protectOwnerFrom(Animal a){
        if ("Dog".equals(animal.getClass().getName())){
            ((Dog) animal).kick(a);
        }
        else{
            ((Pigeous) animal).wingAttack(a);
        }
    }
    
    @Override
    public String toString(){
        return "Owner : name = " + name + ", Animal : name = " + animal.getName() + ", power = " + animal.getPower() + ", age = " + animal.getAge();
    }
    
}
