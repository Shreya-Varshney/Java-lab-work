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
public class MultiplicationTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int n=sc.nextInt();
        for(int i=1; i<=10; i++)
        {
            System.out.println(n+"x"+i+"="+n*i);
        }
    }
    
}
