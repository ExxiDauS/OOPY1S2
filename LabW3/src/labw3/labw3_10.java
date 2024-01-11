/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labw3;
import java.util.*;

/**
 *
 * @author kitti
 */
public class labw3_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int count = 1;
        for(int j = 0; j < i; j++) {
            if (count == 5){
                System.out.print("/");
                count = 0;
            }else{
                System.out.print("|");
            }
            count = count + 1;
        }
    }
}
