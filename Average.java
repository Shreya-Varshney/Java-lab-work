/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week3;

/**
 *
 * @author shrey
 */
import java.util.Scanner;
public class Average {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        double a=sc.nextDouble();
        System.out.println("enter second number");
        double b=sc.nextDouble();
        System.out.println("enter third number");
        double c=sc.nextDouble();
        
        System.out.println("average:"+((a+b+c)/3));
    }
    
}
