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
public class labw3_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int even = 0;
        int odd = 0;
        while (true){
            int i = sc.nextInt();
            if (i == -1){
                break;
            }
            if (i % 2 == 0){
                even = even + 1;
            }
            else{
                odd = odd + 1;
            }
        }
        System.out.println("Odd number = " + odd + " and Even number = " + even);
    }
}
