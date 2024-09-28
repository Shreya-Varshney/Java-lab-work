/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week6;

/**
 *
 * @author shrey
 */
public class PrimeNum0to100 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i=0; i<=100; i++)
        { 
            boolean isPrime=true;
            for(int j=2; j<i; j++)
            {
                if(i%j==0)
                    isPrime=false;
                break;
            }
                if(isPrime)
                    System.out.print(i+ " ");
        }
    }
    
}
