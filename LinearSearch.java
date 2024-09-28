/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week6;

/**
 *
 * @author shrey
 */
public class LinearSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[]={56,64,45,34,30};
        int len=a.length;
        int n=40;
        boolean flag=false;
        for(int i=0; i<len; i++)
        {
              if(a[i]==n)
              { 
                  System.out.println(n+ " found");
                  flag=true;
                  break; 
              }
        }
        if(flag==false)
            System.out.println(n+ " not found");
    }
    
}
