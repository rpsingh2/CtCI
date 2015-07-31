package Queue;


import java.util.PriorityQueue;

public class QueueRemove {
   public static void main(String args[]) {
   // create priority queue
   PriorityQueue < Integer >  prq = new PriorityQueue <  > (); 
       
   // insert values in the queue
   for ( int i = 3; i  <  10; i++ ){  
   prq.add (new Integer (i)) ; 
   }
      
   System.out.println ( "Initial priority queue values are: "+ prq);
      
   // remove 7 from the queue
   prq.remove();
      
   System.out.println ( "Return value after remove: ");
     System.out.println ( "Priority queue values after remove: "+ prq + "fff" + prq.size());
       prq.remove();
     
          System.out.println ( "Priority queue values after remove: "+ prq + "fff" + prq.size());
        prq.remove();
     System.out.println ( "Priority queue values after remove: "+ prq + "fff" + prq.size());
         prq.remove();
      System.out.println ( "Priority queue values after remove: "+ prq + "fff" + prq.size());
          prq.remove();
  System.out.println ( "Priority queue values after remove: "+ prq + "fff" + prq.size());
   }
}