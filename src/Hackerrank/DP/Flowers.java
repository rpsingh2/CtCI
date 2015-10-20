/*
Problem Statement

You and your K-1 friends want to buy N flowers. Flower number i has cost ci. Unfortunately the seller does not want just one customer to buy a lot of flowers, 
so he tries to change the price of flowers for customers who have already bought some flowers. More precisely, if a customer has already bought x flowers, 
he should pay (x+1)*ci dollars to buy flower number i. 
You and your K-1 friends want to buy all N flowers in such a way that you spend the least amount of money. You can buy the flowers in any order.

Input:

The first line of input contains two integers N and K (K <= N). The next line contains N space separated positive integers c1,c2,...,cN.

Output:

Print the minimum amount of money you (and your friends) have to pay in order to buy all N flowers.

Constraints

1≤N,K≤100 
Any ci is not more than 106 
Result is guaranteed to be less than 231

Sample input #00

3 3
2 5 6
Sample output #00

13
Sample input #01

3 2
2 5 6
Sample output #01

15
Explanation : 
Sample Case #00: In this example, all of you should buy one flower each. Hence, you'll have to pay 13 dollars. 
Sample Case #01: Here one of the friend buys first two flowers in decreasing order of their price. 
So he will pay (0+1)*5 + (1+1)*2 = 9. And other friend will buy the costliest flower of cost 6. So total money need is 9+6=15.
 */
package Hackerrank.DP;

import java.util.Scanner;

/**
 *
 * @author sbhawsin
 */
public class Flowers {
    
   public static int flowers(int[] C, int N, int K){
       if(K<=0 || N<=0)
           return 0;
       int count=0;
       int fl=N;
       if(K>=N){
           for(int i=0;i<N;i++){
               count+=C[i];
           }
           return count;
       }
       else{
           int temp=0;
           while(fl-K>=0){
            for(int i=fl-K;i<fl;i++){
               count+= (temp+1)*C[i];
           }
               fl=fl-K-1;
               temp++;
           }
           for(int i=0;i<=fl;i++){
               count+=(temp+1)*C[i];
           }
           
       }
       return count;     
   }
   public static void main( String args[] ){
      
// helpers for input/output      

      Scanner in = new Scanner(System.in);
      
      int N, K;
      N = in.nextInt();
      K = in.nextInt();
      
      int C[] = new int[N];
      for(int i=0; i<N; i++){
         C[i] = in.nextInt();
      }
      
      int result = 0;
      result = flowers(C, N, K);
      System.out.println( result );
      
   }
}