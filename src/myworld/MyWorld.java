/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myworld;

import java.util.Scanner;

/**
 *
 * @author 011526
 */
public class MyWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int k=0;
        int l=0;
        System.out.print("Wat is getal1 ? ");
        k = input.nextInt();
        System.out.print("Wat is getal2 ? ");
        
        
        l = input.nextInt();
        
        System.out.println(k/l);

    System.out.println("Hallo Wereld");
    }
}
