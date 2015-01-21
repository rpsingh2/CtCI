/*

 */
package Other;

import java.util.Scanner;

/**
 *
 * @author Shubham
 */
public class BookPage {
    
    
    public void bookP(int k, int n){
        StringBuilder sb= new StringBuilder();
        
        int counter=0;
       
        while(n!=0 ){
            counter++;  
            int i = counter;
            sb.append(counter);
            while(i!=0){
                if(i%10 == k){
                    n--;             
                }
                 i=i/10;  
            }
        }
        System.out.println(sb);
    }
    
    public static void main(String args[]){
        System.out.println("Enter the number from 1 to 9: ");
        Scanner s= new Scanner(System.in);
        int k= s.nextInt();
        if(k>9 || k<0){
            System.out.println("Enter values from 0-9");
        }else{
        System.out.println("Enter the number of times: ");
        Scanner s1= new Scanner(System.in);
        int n= s1.nextInt();
        
        BookPage bp= new BookPage();
        bp.bookP(k, n);
        }
    }
}
