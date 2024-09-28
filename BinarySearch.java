/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week7;

/**
 *
 * @author shrey
 */
public class BinarySearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int a[]={10,20,30,40,50};
         int len=a.length;
         int s=0;
         int e=len-1;
         int m;
         int n=20;
         boolean isfound=false;
         while(s<=e)
         {
             m=(s+e)/2;
             if(n==a[m])
             {
                 System.out.println("element found at "+m);
                 isfound=true;
                 break;
             }
             else if(n>a[m])
                 s=m+1;
             else
                 e=m-1;
         }
         if(isfound==false)
             System.out.println("element not found");
    }
    
}