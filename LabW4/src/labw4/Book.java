/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labw4;

/**
 *
 * @author kitti
 */
public class Book {
    public String author;
    public boolean isAvailable;
    public double price;
    public String publisher;
    public String title;
    public int yearPublished;
    public boolean isPublishedAfter(int year) {
        boolean check = (year < yearPublished);
        return check;
    }
    public void markAsAvailable(){
        isAvailable = true;
    }
    public void markAsUnavailable(){
        isAvailable = false;
    }
    public void printDetails(){
        String check = (isAvailable == true) ? "Yes" : "No";
        System.out.println("Title: " + title + "\n"
                + "Author: " + author + "\n"
                + "Publisher: " + publisher + "\n"
                + "Year Published: " + yearPublished + "\n"
                + "Price: $" + price +"\n"
                + "Available: " + check);
    }
    public void updatePrice(double newPrice){
        this.price = newPrice;
    }
}

