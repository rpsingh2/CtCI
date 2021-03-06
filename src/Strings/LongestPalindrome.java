/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

import java.util.Scanner;

/**
 *
 * @author Shubham
 */
class LongestPalindrome {

    /**
     * @param input is a String input
     * @return The longest palindrome found in the given input.
     */
    public static String getLongestPalindrome(final String input) {
        int rightIndex, leftIndex;
        String currentPalindrome, longestPalindrome = "";
        if(input.length()==1){
            return input;
        }
        if(input.length()==2){
            if(input.charAt(0)==input.charAt(1))
                return input;
            else
                return "";
        }
        for (int centerIndex = 2; centerIndex < input.length() - 1; centerIndex++) {
            if(input.charAt(centerIndex)==input.charAt(centerIndex-1) && input.charAt(centerIndex)!= input.charAt(centerIndex+1) ){
                leftIndex=centerIndex - 2;
                rightIndex = centerIndex + 1;                        
            }
            else{
            leftIndex = centerIndex - 1;  rightIndex = centerIndex + 1;
            }
            while (leftIndex >= 0 && rightIndex < input.length()) {
                if (input.charAt(leftIndex) != input.charAt(rightIndex)) {
                    break;
                }
                currentPalindrome = input.substring(leftIndex, rightIndex + 1);
                longestPalindrome = currentPalindrome.length() > longestPalindrome.length() ? currentPalindrome : longestPalindrome;
                leftIndex--;  rightIndex++;
            }
        }
        return longestPalindrome;
    }

    public static void main(String ... args) {
        System.out.println("Enter String to check for Repeated characters:");
        Scanner str= new Scanner(System.in);
        String longestPali = getLongestPalindrome(str.nextLine());
        
        System.out.println("Longest Palindrome: " + longestPali);
    }
}