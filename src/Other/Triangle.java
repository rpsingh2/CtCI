/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Other;

import static Strings.AnagramPalindrome.palin;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Shubham
 */
public class Triangle {
    public static void tri(int[] arr){

    int first = arr[0];
    int second= arr[1];
    int third= arr[2];
    int fourth = arr[3];
    int diag= first;
    int diag2= second;
    int diag3=third;
    if(second+fourth+third > diag){
        System.out.println("Possible");
        return;
    }
    if(third + fourth+first > diag2) {
        System.out.println("Possible");
        return;
    }
    if(second + fourth+ first > diag3) {
        System.out.println("Possible");
        return;
    }
    if(second + third+ first > fourth) {
        System.out.println("Possible");
        return;
    }
    
        System.out.println("Impossible");
    }
    
    public static void main(String args[]) throws FileNotFoundException, IOException{
        Scanner scanner = new Scanner(new File("1.txt"));
        int [] tall = new int [100];
        int i = 0;
        int len = scanner.nextInt();
        while(scanner.hasNextInt()){
        if(i%4==0 && i!=0){
            tri(tall);
            i=0;
        }
        tall[i++] = scanner.nextInt();
        }
       
     
    }
}
