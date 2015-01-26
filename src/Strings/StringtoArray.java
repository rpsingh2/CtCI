package Strings;
import java.util.Arrays;
import java.util.Scanner;

/*
Converting a String to Array of characters assuming It is ASCII.
package Strings;

/**
 *
 * @author Shubham
 */
public class StringtoArray {
    
    
    public static void main(String args[]){
        System.out.println("Please enter a String:");
        Scanner s1=new Scanner(System.in);
        String s=s1.nextLine();
        
        char[] c= s.toCharArray();
        int[] c1= new int[256];
        int i;
        for(char c2:c){
            c1[c2]++;  
        }
        System.out.println("String in array form:" + Arrays.toString(c1));
    }
}
