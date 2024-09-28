/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week7;

/**
 *
 * @author shrey
 */

public class SortingArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int a[]={-21,0,-5,29};
       int len=a.length;
       for(int i=0; i<len-1;i++)
       {
           for(int j=0; j<len-1;j++)
               if(a[j]>a[j+1])
               {
                   int t=a[j];
                   a[j]=a[j+1];
                   a[j+1]=t;
               }
       }
       for(int e:a)
           System.out.print(e+ " ");
    }
}
  
