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
    //building a BST 
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
    // Inorder traversals which in an ideal case will give us a sorted array 
    public static void Inorder(Node root){
        if (root==null) {
            return;
        }
        Inorder(root.left);
        System.out.print(root.data+"  ");
        Inorder(root.right);
    }
    // search an element in a BST
    public static boolean search(Node root, int key){
        if (root==null) {
            return false;
        }
        if (root.data==key) {
            return true;
        }
        if (root.data < key) {
            return search(root.right, key);
        }else{
            return search(root.left, key);
        }
    }
    /*
     * delete a node from a BST
     * there are three cases we will encounter here 
     * 1. No child 
     * 2.One child 
     * 3. two child
     * now the chid one can be tackled by just the value of null in its place 
     * the one child case can be tackled by using its own child as its substitute in its place 
     * and in the two child one we have to replace it with its inorder succesor 
     * and then delete the node for inorder succesor 
     * 
     * Inorder successor inBST -> Left Most node in the right subtree
     */

    public static Node delNode(Node root, int val){
        if (root.data<val) {
            root.right=delNode(root.right, val);
        }
        else if (root.data>val) {
            root.left=delNode(root.left, val);
        }
        else{// found the node to be deleted 
            //Case 1
            if (root.left==null&&root.right==null) {
                return null;
            }
            //Case 2
            if (root.left==null) {
                return root.right;
            }
            else if (root.right==null) {
                return root.left;
            }
            //Case 3 both children found 
            Node Is=Inordersuccessor(root.right);
            root.data= Is.data;
            root.right=delNode(root.right, Is.data);
        }
        return root;
    }
    public static Node Inordersuccessor(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }
    public static void main(String[] args) {
        int values[]={5,2,3,4,1,7};
        Node root= null;
        for (int i = 0; i < values.length; i++) {
            root=insert(root,values[i]);
        }
        Inorder(root);
        System.out.println();
        System.out.println(search(root, 2));
        delNode(root, 2);
        System.out.println(search(root, 2));
        Inorder(root);
    }
}
