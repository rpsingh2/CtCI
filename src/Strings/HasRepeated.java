/*
First repeated character in the string
 */
package Strings;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Shubham
 */
public class HasRepeated {
    
    
    public char hasRepeated(String word) { 
    HashMap<Character, Boolean> h = new HashMap<>();
    for(int i=0; i<word.length();i++){
        if(h.containsKey(word.charAt(i))){
            return word.charAt(i);
        }
        else{
            h.put(word.charAt(i), true);
           
        }
    }
    return 0;
    }
    public static void main(String args[]){
        System.out.println("Enter String to check for Repeated characters:");
        Scanner s= new Scanner(System.in);
        HasRepeated h=new HasRepeated();
        char l= h.hasRepeated(s.nextLine());
        System.out.println(" First Non Repeated char is:" + l);
    }
}
