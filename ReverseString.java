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
public class ReverseString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string:");
        String s=sc.next();
        System.out.println("entered string is "+s);
        String r="";
        int len=s.length();
        for(int i=len-1; i>=0; i--)
        {
            r=r + s.charAt(i);
        }
        System.out.println("reversed string is "+r);

    }
    
}
