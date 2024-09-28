/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week4;

/**
 *
 * @author shrey
 */
import java.util.Scanner;
public class OddEven {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int i=sc.nextInt();
        if(i%2==0)
            System.out.println(i+ " is even");
        else
            System.out.println(i+ " is odd");
    }
    
}

