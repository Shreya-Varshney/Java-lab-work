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
public class SumofArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];   
       System.out.println("enter no. of elements");
       int n=sc.nextInt();
       System.out.println("enter elements of array");
       for(int i=0; i<n;i++)
       {
           a[i]=sc.nextInt();
       }
       
        int len= a.length;
        int sum=0;
        for(int i=0;i<len;i++)
        {
            sum=sum+a[i];
        }
        System.out.println("sum of the array is "+sum);
    }
    
}
