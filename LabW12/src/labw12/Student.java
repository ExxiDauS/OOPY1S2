/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labw12;

import java.io.Serializable;

/**
 *
 * @author kitti
 */
public class Student implements Serializable{
    private String name;
    private int ID;
    private Double money;
    
    public Student(){
        this(null, 0, 0d);
    }
    
    public Student(String name, int ID, Double money){
        this.name = name;
        this.ID = ID;
        this.money = money;
    }
    
    public String getName(){
        return name;
    }
    
    public int getID(){
        return ID;
    }
    
    public Double getMoney(){
        return money;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setID(int ID){
        this.ID = ID;
    }
    
    public void setMoney(Double money){
        this.money = money;
    }
    
}
