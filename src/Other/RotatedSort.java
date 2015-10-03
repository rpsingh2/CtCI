/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Other;

/**
 *
 * @author Shubham
 */
public class RotatedSort {
    public static int circularsort(int arr[], int n, int x){
        int low =0;
        int high=n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==x){
                return mid;
            }
            if(arr[mid]<=arr[high]){
                if(x>arr[mid] && x<arr[high])
                    low=mid+1;
                else
                    high = mid-1;
            }
            else{
                if(arr[low]<=x && x<arr[mid])
                    high=mid=1;
                else
                    low= mid+1;
            }
        }
            return -1;
        
        }
    
    public static void main(String args[]){
        int[] arr = {12,14,16,2,5,8,10};
        int ans = circularsort(arr, arr.length, 2);
        System.out.println("Answer:" + ans);
    }
}

