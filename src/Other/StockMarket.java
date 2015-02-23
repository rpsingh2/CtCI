/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Other;

/**
 *
 * 
 * public class Solution {
    public int maxProfit(int k, int[] prices) {
        if(prices.length<=1){
            return 0;
        }
        int[] profit = new int[prices.length-1];
        for(int i=1;i<prices.length;i++){
            profit[i-1] = prices[i]-prices[i-1];
        }
        int local_sum=0;
        int[] global_sum=new int[profit.length];
        int[] temp=new int[global_sum.length];
        int count=0;
        global_sum[0]= Math.max(profit[0],0);
        for(int j=1;j<profit.length;j++){
            local_sum=Math.max((global_sum[j-1] + profit[j]),0);
            global_sum[j]= Math.max(local_sum,global_sum[j-1]);
        }
        temp[0] = global_sum[0];
         for(int i=1;i<global_sum.length;i++){
            temp[i] = global_sum[i]-global_sum[i-1];
        }
        java.util.Arrays.sort(temp);
        if(k>temp.length){
            return global_sum[global_sum.length-1];
        }
        else
        {
        for(int j=temp.length-1;j>=temp.length-k;j--)
            count=temp[j]+count;
        }
        return count;
    }
}
 * @author Shubham
 */
public class StockMarket {
    
    public class Solution {
    public int maxProfit(int k, int[] prices) {
        int[] profit = new int[prices.length];
        for(int i=1;i<prices.length;i++){
            profit[i] = prices[i]-prices[i-1];
        }
        java.util.Arrays.sor
        int local_sum=0;
        int global_sum=0;

        for(int j=0;j<profit.length;j++){
            
            local_sum=Math.max((global_sum + profit[j]),0);
            global_sum= Math.max(local_sum,global_sum);
        }
        return global_sum;
    }
}
}
