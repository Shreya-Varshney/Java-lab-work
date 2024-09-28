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
public class FactorialByRecursion {

    /**
     * @param args the command line arguments
     */
    public static int factorial(int a){
        if(a==0)
            return 1;
        else
            return a*factorial(a-1);
    }
   
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a number");
      int n= sc.nextInt();
      int c=factorial(n);
      System.out.println("factorial is " +c);
    }
    
}
