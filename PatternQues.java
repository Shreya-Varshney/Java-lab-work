/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week5;

/**
 *
 * @author shrey
 */
public class PatternQues {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int n=5;
        for(int i=1;i<=n;i++)
        { for(int k=1;k<=n-i;k++)
            System.out.print("   ");
         for(int j=1;j<=i;j++)
         {
             System.out.print(j+ "  ");
         }
         for(int m=i-1;m>0;m--)
         {
             System.out.print(m+ "  ");
         }
         System.out.println(" ");
    }
    
  }
}
