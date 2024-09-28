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
public class SumofSeries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int n=sc.nextInt();
        double sum=0.0;
        for(double i=1; i<=n;i++)
        { sum= sum+(1/i);
          }
        System.out.println(sum);
    }
    
}
