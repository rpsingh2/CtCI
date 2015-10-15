package Other;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
public static int ans(int[] S) {
	if (S == null)
		return 0;
 
	ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
 
	for (int i = 2; i < S.length; i++) {
       
		ArrayList<ArrayList<Integer>> temp = new ArrayList<ArrayList<Integer>>();
 
		//get sets that are already in result
		for (ArrayList<Integer> a : result) {
			temp.add(new ArrayList<Integer>(a));
		}

		for (ArrayList<Integer> a : temp) {
			a.add(S[i]);
		}
		ArrayList<Integer> single = new ArrayList<Integer>();
       
		single.add(S[i]);
		temp.add(single);
       
        for(ArrayList<Integer> m : temp){
            int sum =0;
            ArrayList<Integer> ll = m;
            for(int l = 0; l < m.size(); l++){
                System.out.println(m.get(l));
                sum += m.get(l);
            }
            if(sum != S[S.length-1])
                temp.remove(ll);
        }
		result.addAll(temp);
        }
        
	return result.size();
}
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int[] inp = new int[n];
        for(int i=0;i<n;i++){
            inp[i]=i+1;
        }
        System.out.print(ans(inp));
    }
}