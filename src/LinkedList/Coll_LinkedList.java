
package LinkedList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;


/**
 *
 * @author Shubham
 */
public class Coll_LinkedList {
  
    public LinkedList<Integer> a = new LinkedList<>();
    

    
    public static void main(String[] args) {
        // TODO code application logic here
       Coll_LinkedList ex=new Coll_LinkedList();
       System.out.println("Enter Size of Linked list");
       Scanner i=new Scanner(System.in);
       int n= i.nextInt();
       System.out.println("Enter the values to list");
       for(int j=0; j<n;j++){
           Scanner k=new Scanner(System.in);
           int o=k.nextInt();
           ex.a.add(o);
      
       }
    }
    
}
