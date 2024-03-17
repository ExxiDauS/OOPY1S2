package prefinal_open;

import java.io.Serializable;

public class Book implements Serializable{
    private String name;
    private double price;
    private String type;
    
    public Book(){
        this(null, 0.0, null);
    }
    
    public Book(String name, double price, String type){
        this.name = name;
        this.price = price;
        this.type = type;
    }
    
    public String getName(){
        return name;
    }
    
    public double getPrice(){
        return price;
    }
    
    public String getType(){
        return type;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
    
    public void setType(String type){
        this.type = type;
    }
}
