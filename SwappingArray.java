/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week6;

/**
 *
 * @author shrey
 */
public class SwappingArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[]={56,45,27,28};
        int len=a.length;
        int temp=a[0];
        a[0]=a[len-1];
        a[len-1]=temp;
        for(int element:a)
            System.out.println(element);
    }
    
}
