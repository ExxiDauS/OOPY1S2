/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labw4;

/**
 *
 * @author kitti
 */
public class Student {
    public double fScore;
    public double mScore;
    public String name;
    
    public void showGrade(){
        double s = 0;
        String grade = "A";
        s = (mScore * 0.4) + (fScore * 0.4) + 20;
        if (s < 50){
            grade = "F";
        }
        else if (s >= 50 && s <60){
            grade = "D";
        }
        else if (s >= 60 && s <70){
            grade = "C";
        }
        else if (s >= 70 && s <80){
            grade = "B";
        }
        else{
            grade = "A";
        }
        System.out.println("Your grade is " + grade + ".");
    }
}
