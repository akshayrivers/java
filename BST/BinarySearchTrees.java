import java.util.*;
public class BinarySearchTrees {
    /*
     * Binary tree 
     * properties:
     * a.leftsubtree<root
     * b.rightsubtree>root
     * c.left and right subtrees are also BST with no duplicates.
     * Special properties->
     * Inorder Traversal[left,Root,right] of BST gives a sorted sequence 
     * 1.BST Search usually -> O(log n) worst case ->O(n)
     * 2.Build a BST
     * 3.Delete a Node
     * 4.Root of leaf paths
     * 5.Validate BST
     * 6.Mirror a BST
     * 7.Sorted array to Balanced BST
     * 8.Size of largest BST in BT
     */
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            
        }
    }
    public static Node insert(Node root,int val){
        if (root==null) {
            root=new Node(val);
            return root;
        }
        if (root.data>val) {
            root.left=insert(root.left, val);
        }else{
            root.right=insert(root.right, val);
        }
        return root;
    }
    public static void Inorder(Node root){
        if (root==null) {
            return;
        }
        Inorder(root.left);
        System.out.print(root.data+"  ");
        Inorder(root.right);
    }
    public static void main(String[] args) {
        int values[]={5,2,3,4,1,7};
        Node root= null;
        for (int i = 0; i < values.length; i++) {
            root=insert(root,values[i]);
        }
        Inorder(root);
    }
}
