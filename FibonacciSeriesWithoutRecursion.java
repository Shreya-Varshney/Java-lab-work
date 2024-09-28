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
public class FibonacciSeriesWithoutRecursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int a=0;
        int b=1;
        System.out.print(+a );
        System.out.print(" "+b+" ");
        for(int i=1; i<=n-2; i++)          //n-2 beacuse two numbers(a and b)are already printed
        {
            int c=a+b;
            a=b;
            b=c;
            System.out.print(c+ " ");
        }
    }
    
}
