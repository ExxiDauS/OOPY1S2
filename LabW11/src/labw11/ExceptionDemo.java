/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labw11;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author kitti
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        double a = 0;
        double b = 0;
        double c = 0;
        double x1 = 0;
        double x2 = 0;
        try {
            a = Double.parseDouble(args[0]);
            b = Double.parseDouble(args[1]);
            c = Double.parseDouble(args[2]);
            x1 = (- b + (Math.sqrt((b * b) - (4 * a * c)))) / (2 * a);
            x2 = (- b - (Math.sqrt((b * b) - (4 * a * c)))) / (2 * a);
            System.out.println("x1: " + x1);
            System.out.println("x2: " + x2);
        } catch(InputMismatchException e){
            System.out.println("Please input data in number format only");
        } catch(Exception e){
            System.out.println("Please enter 3 numbers as a, b and c respectively.");
        }
    }
}
