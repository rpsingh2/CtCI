/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryTree;

import java.util.Scanner;


/**
 *
 * @author Shubham
 */
public class BST {
    
    public static Node root;
    
//Inserts the node in BST with value 'a'
    
    public void addNode(int a){
        Node newNode=new Node(a);
        if(root==null){
            root=newNode;
            System.out.println("Added the Node with Data: " + root.a);
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
    
// Return Minimum value of the tree. 0 otherwise 
    
    public int minValue(Node root){
     
        Node current=root;
        if(root!=null){
            while(current.leftChild !=null){
                current=current.leftChild;
            }
            return current.a;
        }
        else
            return 0;
    }
 
// Return Maximum value of the tree. 0 otherwise 
    
    public int maxValue(Node root){
     
        Node current=root;
        if(root!=null){
            while(current.rightChild !=null){
                current=current.rightChild;
            }
            return current.a;
        }
        else
            return 0;
    }
   

// Function to Search the given Integer 'a' in the Tree. Returns True or False    
    
    public boolean search(Node root, int a){
        if(root!=null){
            Node current=root;
            if(current.a==a){
                return true;
            }
            else if(current.a > a){
                current=current.leftChild;
               return search(current,a);
            }
            else{
               current=current.rightChild;
               return search(current,a);
            }
   
    } 
    return false;
    }
    
// Inorder Traversal of tree with node root    
    
    public void inOrder(Node n){
        if(n!=null){
          inOrder(n.leftChild);
          System.out.println("InOrder: Data now is:" + n.a);
          inOrder(n.rightChild);
        }
    }
     public void preOrder(Node n){
        if(n!=null){
          System.out.println("Preorder: Data now is:" + n.a);
          preOrder(n.leftChild);
          preOrder(n.rightChild);
        }
    }
      public void postOrder(Node n){
        if(n!=null){
          postOrder(n.leftChild);
          
          postOrder(n.rightChild);
          System.out.println("PostOrder: Data now is:" + n.a);
          
        }
    }
    
 /*   public void BFS(Node n){
        if(n!=null){
          System.out.println("Data now is:" + n.a);
          BFS(n.leftChild);
          BFS(n.rightChild);
        }
    }*/
    
// Maximum depth of the BST
    
    public static int maxDepth(Node root){
        if(root==null){
            return 0;
        }
        else{
            
            int lDepth= maxDepth(root.leftChild);
            int rDepth= maxDepth(root.rightChild);
            if(lDepth>rDepth)
                return (lDepth + 1);
            else
                return (rDepth + 1);
        }
    }
    
    // Calculating the diameter of the tree.
    public static int diam(Node root){
        if (root==null){
            return 0;
        }
        int lDepth= maxDepth(root.leftChild);
        int rDepth= maxDepth(root.rightChild);
        int lDiam= diam(root.leftChild);
        int rDiam= diam(root.rightChild);
        
        return(Math.max((lDepth+rDepth+1) , Math.max(lDiam,rDiam)));
    }
    
    public void printPath(Node root, int path[], int pathLength){
        if(root==null){
            return;
        }
        path[pathLength++]=root.a;
        if(root.leftChild==null && root.rightChild==null){
            for(int i=0; i<pathLength;i++)
                System.out.print(path[i] + "--");
            System.out.println();
        }
        
        else{
            printPath(root.leftChild, path , pathLength);
            printPath(root.rightChild, path , pathLength);
        }
    }
    
// Main Method
    public static void main(String args[]){
        BST b=new BST();
        
        System.out.println("Enter Total number of elements in the tree:");
        Scanner s= new Scanner(System.in);
        int k=s.nextInt();
        
        for(int i=1; i<=k;i++){
            
            System.out.println("Please Enter the Value for node:" + i);
            Scanner s1= new Scanner(System.in);
            b.addNode(s1.nextInt());

    }
        
        b.inOrder(root);
        b.preOrder(root);
        b.postOrder(root);
        
        int min= b.minValue(root);
        System.out.println("Minimum value of the tree:" + min);
        
        int max= b.maxValue(root);
        System.out.println("Maximum value of the tree:" + max);
        
        System.out.println("Enter a node to search:");
        Scanner a= new Scanner(System.in);
        boolean search= b.search(root, a.nextInt());
        System.out.println(search);
        
        int depth= maxDepth(root);
        System.out.println("Maximum depth of the tree= " + depth);
        
        int path[]=new int[depth];
        int pathlength=0;
        b.printPath(root, path, pathlength);
        
        int d= diam(root);
        System.out.println("Maximum Diameter of the tree= " + d);

    }
}
