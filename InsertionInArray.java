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
public class InsertionInArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[]=new int[10];
       Scanner sc=new Scanner(System.in);
       for(int i=0; i<10;i++)
           a[i]=sc.nextInt();
       for(int element:a)
           System.out.println(element);
    }
    
}
