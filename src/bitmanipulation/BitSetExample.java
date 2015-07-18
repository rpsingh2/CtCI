/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bitmanipulation;

import java.util.BitSet;

/**
 *
 * @author Shubham
 */
public class BitSetExample {
    
    public static void main(String args[]){
        BitSet b= new BitSet(100);
        int[] a= new int[]{1,3,5,7,9,3,2,11,64,54};
        for(int num:a){
            b.set(num);
        }
        System.out.println(b);
        System.out.println("Bitset for Array"  + " is" + b.nextClearBit(9));
    }
}
