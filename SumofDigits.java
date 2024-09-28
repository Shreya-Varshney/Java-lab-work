/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week5;

import java.util.Scanner;

/**
 *
 * @author shrey
 */
public class SumofDigits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int n=sc.nextInt();
        int sum=0;
        int rem;
        while(n != 0)
        {
            rem=n%10;
               sum=sum+rem;
               n=n/10;
        }
        System.out.println("sum of the digits is " +sum);
    }
    
}
