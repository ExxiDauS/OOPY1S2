/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mockoop;

/**
 *
 * @author User
 */
public abstract class Food {
   protected String name;
   
   public Food(){
       this.name = "";
   }
   
   public String getName(){
       return name;
   }
   
   public abstract int getPower();
   
   public void setName(String name){
       this.name = name;
   }
}
