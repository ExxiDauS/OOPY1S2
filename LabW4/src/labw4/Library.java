/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labw4;

/**
 *
 * @author kitti
 */
public class Library {
    public Book book1;
    public Book book2;
    public Book book3;
    public String libraryName;
    public void addBook(Book book, int slot){
        switch (slot) {
            case 1:
                this.book1 = book;
                break;
            case 2:
                this.book2 = book;
                break;
            case 3:
                this.book3 = book;
                break;
        }
    }
    public void checkBookAvailability(int slot){
        switch (slot) {
            case 1:
                if (this.book1 != null){
                    System.out.println(this.book1.title + " is available");
                }else{
                    System.out.println("Book in slot " + slot +" is not available.");
                }
            case 2:
                if (this.book2 != null){
                    System.out.println(this.book2.title + " is available");
                }else{
                    System.out.println("Book in slot " + slot +" is not available.");
                }
            default:
                if (this.book3 != null){
                    System.out.println(this.book3.title + " is available");
                }else{
                    System.out.println("Book in slot " + slot +" is not available.");
                }
        }
    }
    public void printBookDetails(Book book){
        if (book != null){
            book.printDetails();
            System.out.println();
        }else{
            System.out.println("No book in this slot." + "\n");
        }
    }
    public void printLibraryDetails(){
        System.out.println("Library: " + this.libraryName + "\n");
        printBookDetails(book1);
        printBookDetails(book2);
        printBookDetails(book3);
    }
    public void removeBook(int slot){
        switch (slot) {
            case 1:
                this.book1 = null;
                break;
            case 2:
                this.book2 = null;
                break;
            case 3:
                this.book3 = null;
                break;
        }
    }
    public void updateBookPrice(int slot, double newPrice){
        switch (slot) {
            case 1:
                if (this.book1 != null){
                    this.book1.price = newPrice;
                    System.out.println("Updated price of " + this.book1.title + " to $" + newPrice + ".");
                }else{
                    System.out.println("No book in this slot.");
                }
                break;
            case 2:
                if (this.book2 != null){
                    this.book2.price = newPrice;
                    System.out.println("Updated price of " + this.book2.title + " to $" + newPrice + ".");
                }else{
                    System.out.println("No book in this slot.");
                }
                break;
            case 3:
                if (this.book3 != null){
                    this.book3.price = newPrice;
                    System.out.println("Updated price of " + this.book3.title + " to $" + newPrice + ".");
                }else{
                    System.out.println("No book in this slot.");
                }
                break;
        }
    }
}
