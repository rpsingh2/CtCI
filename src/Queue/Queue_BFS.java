/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

import java.util.ArrayList;

/**
 *
 * @author Shubham
 */
public class Queue_BFS {
    static ArrayList<Integer> a= new ArrayList<>();
     
   public void enqueue(ArrayList a, int n){
       
       a.add(n);
       
   }
   public void dequeue(ArrayList a){
       
       System.out.println("ArrayList is Dequeueing: " + a.get(0));
       a.remove(0);
   }
   
   public static void main(String args[]){
       Queue_BFS q= new Queue_BFS();
       q.enqueue(a, 10);
       q.enqueue(a, 20);
       
       int i=0;
       int j= a.size();
       while(i!=j){
       System.out.println("ArrayList is Enqueueing: " + a.get(i));
       i++;
       }
       
       
   }
}
