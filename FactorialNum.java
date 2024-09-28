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
public class FactorialNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int n=sc.nextInt();
        int fact=1;
        for(int i=1; i<=n; i++)
        {
            fact=fact*i;
        }
        System.out.println("factorial is:"+fact);
    }
    
}
