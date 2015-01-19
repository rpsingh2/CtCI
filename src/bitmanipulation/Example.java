/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bitmanipulation;

/**
 *Implementing getBit for Bit Manipulation
 * @author Shubham
 */
public class Example {
    public boolean getBit(int num, int i){
        return((num & (1 << i)) !=0);
    }
    
public static void main(String args[]){
    int num=8;
    int i=4;
    Example e= new Example();
    System.out.println("Bit at position "+i+" is 1:" + e.getBit(num, i));
}
    
}
