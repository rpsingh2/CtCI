/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Shubham
 */
public class norm_LinkedList {
    public static Node head;

    // Creation of linked list
    public void create(int a){
        Node newNode=new Node(a);
        if(head==null){
            head=newNode;
            System.out.println("Data added:" + a);
        }
        else{
            Node current;
            current=head;
            while(current.next!=null){
                current=current.next;
            }
            current.next = newNode;
            System.out.println("Data added:" + a);
        }
    }

    public void recursive_reverse(Node head){
        
        Node first;
        Node rest;
        if(head==null){
            return;
        }
        first=head;
        rest=first.next;
        if(rest==null){
            return;
        }
        recursive_reverse(rest);
        first.next.next=first;
        first.next=null;
        head=rest;
    }
    
    public Node iterative_reverse(Node head)
{
    if(head==null)
        return null;
    Node previous = null;
	Node current = head;
	Node next_node = current.next;
	
	while(current.next!=null)
	{
		current.next = previous;
		previous = current;
		current = next_node;
                if(current.next == null){
                    break;
                }
                else
		next_node = current.next;
	}
        current.next = previous;
        previous = current;
	current = next_node;
	head = current;
        return head;
}
 
    // Get the Nth Node from the linked list
    public int getNth(Node head, int n){
    if(head==null){
        return 0;
    }
    else{    
        Node temp=head;
        int i=0;
        for(temp=head;temp!=null;temp=temp.next){
            if(i==n){
                return temp.a;
            }
            else{
                i++;
            }
        }
        return 0;
    }        
    }
    
    public void delDupes(Node head1){
        HashSet<Integer> h= new HashSet<Integer>();
        Node current=null;
        Node head=head1;
        while(head!=null){
            if(h.contains(head.a)){
                current.next=head.next;
                Node prev=head;
                head=head.next;
                prev.next=null;
            //    head=current;
            }else{
                h.add(head.a);
                current=head;
                head=head.next;
            }     
        }
        
        System.out.println(h);
        
        Node current1; 
       current1=head1;
        while(current1!=null){
            System.out.println("Data present: " + current1.a);
            current1=current1.next;
        }
    }
    
   public boolean isPalindrome(Node head){
       Node slow=head;
       Node fast=head;
       Stack<Integer> s=new Stack<Integer>();
       while(fast!=null && fast.next!=null){
           s.push(slow.a);
           slow=slow.next;
           fast=fast.next.next;
       }
       if(fast!=null)
           slow=slow.next;
       while(slow!=null){
           int top=s.pop();
           if(top!=slow.a){
               System.out.println(head.a);
               return false;
           }
           slow=slow.next;
       }
       System.out.println(head.a);
       return true;
   } 
    public static Node rev(Node head){
        if(head==null)
            return null;
        if(head.next==null){
            return head;
        }
        Node parent=head;
        Node child=head.next;
        while(child!=null){
            parent.next=child.next;
            child.next=head;
            head=child;
            child=parent.next;     
        }
        return head;
    }
    
    public static Node insert(Node head,int data) {
// This is a "method-only" submission. 
// You only need to complete this method. 
  Node newNode=new Node();
  newNode.a=data;
  if(head==null){
      head=newNode;
      return head;
  }
  Node current=head;
  while(current.next!=null){
      current=current.next;
  }
  current.next=newNode;
  return head;
}
    
    public static Node delete(Node head, int position) {
  // Complete this method
    if(head==null)
        return null;
    if(position==0)
        return null;
    Node current=head;
    while(position!=1){
        if(current.next==null){
            return head;
        }
        current=current.next;
        position--;
    }
    if(current.next==null){
            return head;
    }
    Node temp=current.next;
    current.next=current.next.next;
    temp=null;
    return head;
}

    public static void main(String args[]){
        
        norm_LinkedList b=new norm_LinkedList();
        System.out.println("Enter Total number of elements in the list:");
        Scanner s= new Scanner(System.in);
        int k=s.nextInt();
        
        for(int i=1; i<=k;i++){
            
            System.out.println("Please Enter the Value for node:" + i);
            Scanner s1= new Scanner(System.in);
            b.create(s1.nextInt());
    }
        
 //       head=rev(head);
//       System.out.println("Please Enter index to find the data:");
//        Scanner s1= new Scanner(System.in);
//        k=s1.nextInt();
//        int i= b.getNth(head,k);
//        System.out.println("Data:" + i);
        
       head=b.iterative_reverse(head);
//       b.delDupes(head);
//       boolean m=b.isPalindrome(head);
//       System.out.println("The Linked list is a Palindrome: " + m);
        
       Node current; 
       current=head;
        while(current!=null){
            System.out.println("Data present: " + current.a);
            current=current.next;
        }
         
        
    }
    
    
}
