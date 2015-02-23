/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Other;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Shubham
 */
public class ThreeNumberSum {
    
     public boolean isSum(int[] arr){
         HashSet hash = new HashSet();
         for(int i:arr){
             hash.add(i);
         }
         
         for(int j =0;j<arr.length;j++)
             for(int k=j;k<arr.length;k++){
                 int c = arr[j] + arr[k];
                 if(hash.contains(-c)){
                     return true;
                 }
             }
         return false;
     }
    
     public static void main(String args[]) {
        System.out.println("Enter Array size: ");
        Scanner str= new Scanner(System.in);
        int size = (str.nextInt());
        int[] arr = new int[size];
        System.out.println("Enter Array elements: ");
        for(int i=0;i<size;i++){
            Scanner num= new Scanner(System.in); 
            arr[i] = num.nextInt();
        }
        ThreeNumberSum ts = new ThreeNumberSum();
        boolean ans = ts.isSum(arr);
        System.out.println(ans);
    }
}
