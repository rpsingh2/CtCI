/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hackerrank.DP;

/**
 *
 * @author sbhawsin
 */
import java.util.*;

public class Dijkshtra {
    public static int[] out(int v, int[][] store, int start){
        Set<Integer> temp = new HashSet<>();
        Queue<Integer> q = new LinkedList<Integer>() {};
        int[] output = new int[v];
        for(int i=0;i<v;i++){
            output[i] = -1;
        }
        
        for(int i=1;i<=v;i++){
            if(store[start][i]!=-1 && i!=start){
                q.add(i);
                temp.add(i);
                output[i-1] = store[start][i];
            }
        }
        
        while(!q.isEmpty()){
            int t = q.remove();
            for(int i=1;i<=v;i++){
                int qq = store[t][i];
                if(qq!= -1 && i!=t){
                    int shot = output[t-1] + qq;
                    if(!temp.contains(i)){
                        output[i-1]=shot;
                        temp.add(i);
                        q.add(i);
                    }
                    else if(output[i-1] > shot){
                        output[i-1]=shot;
                        q.add(i);
                    }
            }
            }
        }
        return output;
    }
    
    public static int[] inp(int v, int e, Scanner s){
        if(v<2 || e<1){
            return null;
        }
        int[][] store= new int[v+1][v+1];
        for(int i=0;i<=v;i++){
            for(int j=0;j<=v;j++){
                if(i==j){
                    store[i][j]=0;
                }
                else
                    store[i][j]=-1;
            }
        }
        for(int i=0;i<e;i++){
            int m = s.nextInt();
            int n = s.nextInt();
            int l = s.nextInt();
            if(m>v || n>v){
                continue;
            }
            
            
            int ttt = store[m][n];
            if(l<ttt && ttt!=-1){
                store[m][n]=l;
                store[n][m]=l;
            }
            else if(ttt== -1){
                store[m][n]=l;
                store[n][m]=l;
            }

        }
        
        int start = s.nextInt();
        
        int[] sol;
        sol = out(v, store, start);
        int[] solution = new int[sol.length-1];
        int index =0;
        for(int i=0; i<v;i++){
            if(i!=start-1){
                solution[index++]=sol[i];
            }
        }
        return solution;
    }
    
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        for(int i=0;i<size;i++){
            int v = s.nextInt();
            int e = s.nextInt();          
            int[] out;
            out = inp(v,e,s);
            for(int j=0;j<out.length;j++){
                System.out.print(out[j]+" ");
            }
            System.out.println();
        }
        
    }
}