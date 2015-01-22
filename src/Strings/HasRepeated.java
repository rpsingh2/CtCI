/*
First non repeated character in the string
 */
package Strings;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Shubham
 */
public class HasRepeated {
    
    
    public char firstNonRepeatedCharacter(String word) { 
       
    HashMap<Character,Boolean> scoreboard = new HashMap<>();
     
      for (int i = 0; i < word.length(); i++) { 
       char c = word.charAt(i);
       if (scoreboard.containsKey(c)) {
           scoreboard.put(c, true);
        }  
       else { 
             scoreboard.put(c, false);
            } 
    }
      System.out.println(scoreboard);
for (int i = 0; i < word.length(); i++) { 
    char c = word.charAt(i);
    if (scoreboard.get(c) == false)
    { return c; } 
}
    throw new RuntimeException("Undefined behaviour"); 
    } 

    public static void main(String args[]){
        System.out.println("Enter String to check for Repeated characters:");
        Scanner s= new Scanner(System.in);
        HasRepeated h=new HasRepeated();
        char l= h.firstNonRepeatedCharacter(s.nextLine());
        System.out.println(" First Non Repeated char is:" + l);
    }
}
