/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saurabhschool.recursion;

import java.util.Scanner;

/**
 *
 * @author Shubham
 */
class Node {
    int a;
    Node leftChild;
    Node rightChild;

    Node(int a){
        this.a=a;
        this.leftChild=null;
        this.rightChild=null;
    }
}

public class SearchBST {
    static Node root;
    public static void buildTree(int a){
        Node newNode = new Node(a);
        if(root==null){
            root = newNode;
        }
        else{
            Node current=root;
            Node parent;
            while(true){
                parent=current;
                if(a<=current.a){
                    current=current.leftChild;
                    if(current==null){
                        parent.leftChild=newNode;
                        return;
                    }
                }
                else{
                    current=current.rightChild;
                    if(current==null){
                        parent.rightChild=newNode;
                        return;
                    }
                }
            }  
        }
    }
    static void searchB(Node current, int num){
        if(current.a == num){
            System.out.println("Node present");
        }
        else if(current.a > num && current.leftChild!=null){
            searchB(current.leftChild, num);
        }
        else if(current.a < num && current.rightChild!=null){
            searchB(current.rightChild, num);
        }
        else{
            System.out.println("Node not present");
        }
    }
    
    static void inorder(Node current){
        if(current!=null){
            inorder(current.leftChild);
            System.out.print(current.a);
            inorder(current.rightChild);
        }
    }
    static void postorder(Node current){
        if(current!=null){
            postorder(current.leftChild);
            postorder(current.rightChild);
            System.out.print(current.a);
        }
    }
    static void preorder(Node current){
        if(current!=null){
            System.out.print(current.a);
            preorder(current.leftChild);
            preorder(current.rightChild);
        }
    }
    public static void main(String args[]){
        System.out.println("Enter the number of nodes of the tree");
        Scanner s = new Scanner(System.in);
        int count = s.nextInt();
        while(count!=0){
            System.out.println("Enter the node");
            buildTree(s.nextInt());
            count--;
        }
        System.out.println("Enter the node to search");
        Scanner s1 = new Scanner(System.in);
        searchB(root, s1.nextInt());
        System.out.println("Inorder Traversal");
        inorder(root);
        System.out.println("\nPostorder Traversal");
        postorder(root);
        System.out.println("\nPreorder Traversal");
        preorder(root);
    }
}
