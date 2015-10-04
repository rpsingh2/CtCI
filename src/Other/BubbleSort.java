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
public class BubbleSort {
    public static void bubbleSort(int[] arr) {
      boolean swapped = true;
      int j = 0;
      int count=0;
      int tmp;
      while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < arr.length - j; i++) {                                       
                  if (arr[i] > arr[i + 1]) {      
                        count++;
                        tmp = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = tmp;
                        swapped = true;
                  }
            }                
      }
      System.out.println(count);
      for(int i=0;i<arr.length-1;i++)
      System.out.print(arr[i]+ " ");
      System.out.print(arr[arr.length-1]);
}
    
    public static void main(String args[]){
        int[] arr = {874,180,338,767,391,560,769,397,46,147,468,428,46,873,716,491,811,876,279,545,602,961,123,259,250,431,531,637, 114};
        bubbleSort(arr);
    }
}
