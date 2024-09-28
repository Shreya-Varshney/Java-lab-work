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
public class Largestnum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER FIRST NUMBER:");
        int a=sc.nextInt();
        System.out.println("ENTER SECOND NUMBER:");
        int b=sc.nextInt();
        System.out.println("ENTER THIRD NUMBER:");
        int c=sc.nextInt();
        
      if(a>b)
        {if(a>c)
            System.out.println("a is largest");
         else
            System.out.println("c is largest");
        }
      else
        {if(b>c)
            System.out.println("b is largest");
         else
            System.out.println("c is largest");
        }
    }
    
}
