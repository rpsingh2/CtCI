/*
Implement a function which reverses a given String
 */
package Strings;

import java.util.Scanner;

/**
 *
 * @author Shubham
 */
public class StringReverse {
    public StringBuilder reverse(String str){
        int i,j;
        StringBuilder st=new StringBuilder(str);
        
        j=str.length()-1;
        for(i=0;i<=j;i++){
            char temp;
            temp=str.charAt(i);
            st.setCharAt(i, str.charAt(j));
            st.setCharAt(j, temp); 
            j--;    
        }
        return st;
    }
    
    public static void main(String args[]){
        StringReverse q=new StringReverse();
        System.out.println("Enter the String:");
        Scanner s= new Scanner(System.in);
        StringBuilder result = q.reverse(s.nextLine());
        System.out.println(result);
    }
}
