/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week7;

/**
 *
 * @author shrey
 */
import java.util.Scanner;
public class FibonacciSeriesWithRecursion {

    /**
     * @param args the command line arguments
     */
    public static int fib(int n){
            if(n<=1)
                return n;
            else
                return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        for(int i=0; i<=n-1; i++)
            System.out.print(fib(i)+ " ");
    }
    
}
