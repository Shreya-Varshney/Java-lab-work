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
public class Divibeby2LessThan10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int a = sc.nextInt();
        while((a/2)>10)
        { a=a/2;
          System.out.println(a);
        }
          System.out.println("loop terminated");
        }
        
    }
    

