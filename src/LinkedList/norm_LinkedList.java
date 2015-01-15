/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

import java.util.HashSet;
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
               
                head.next=null;
                head=current;
            }else{
                h.add(head.a);
                current=head;
            }
            head=head.next;
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
           if(top!=slow.a)
               return false;
           slow=slow.next;
       }
       
       return true;
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
    
        System.out.println("Please Enter index to find the data:");
        Scanner s1= new Scanner(System.in);
        k=s1.nextInt();
        int i= b.getNth(head,k);
        System.out.println("Data:" + i);
        
    //   b.recursive_reverse(head);
    //   b.delDupes(head);
       boolean m=b.isPalindrome(head);
       System.out.println("The Linked list is a Palindrome: " + m);
       Node current; 
       current=head;
        while(current!=null){
            System.out.println("Data present: " + current.a);
            current=current.next;
        }
        
    }
    
    
}
