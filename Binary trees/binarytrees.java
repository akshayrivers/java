import java.util.LinkedList;
import java.util.Queue;

public class binarytrees {

    /*creating a binary tree form scratch
     * 
    */
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left= null;
            this.right=null;
        }
    }
    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);

            return newNode;
        }
    }/* Tree Traversals 
        A. Preorder
            1)root
            2)Left subtree
            3)Right subtree

        B. Inorder 
            1)Left subtree
            2)Root
            3)Right subtree

        C.Postorder 
            1)Left subtree
            2)Right subtree
            3)Root

        D.Level Order Traversals
            1)DFS
            2)BFS
    */

    //A.Preorder TC-> O(n)
    public static void Preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+"  ");
        Preorder(root.left);
        Preorder(root.right);
    }

    //Inorder TC-> O(n)
    public static void Inorder(Node root){
        if(root==null){
            return;
        }
        Inorder(root.left);
        System.out.print(root.data+" ");
        Inorder(root.right);
    }

    //Postorder TC-> O(n)
    public static void Postorder(Node root){
        if(root==null){
            return;
        }
        Postorder(root.left);
        Postorder(root.right);
        System.out.print(root.data+" ");
    }

    // Level Order Traversals(we use BFS Breadth first search here and queue)
    public static void LevelOrder(Node root){
        if(root==null){
            return;
        }
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node currNode=q.remove();
            if (currNode==null) {
                System.out.println();
            
                if (q.isEmpty()) {
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(currNode.data+" ");
                if (currNode.left!=null) {
                    q.add(currNode.left);
                }
                if (currNode.right!=null) {
                    q.add(currNode.right);
                }
            }
        }    
    }
    /**
     * 
     * @param args
     * height of a tree  
     * it is the maximum distance between root and a leaf 
     * eg:
     *     1       <-1
     *   2   3     <-2
     * 4   5   6   <-3
     * 
     *  height of this given tree is 3
    */ 
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh, rh)+1;
    }
    /*
     * count of nodes => no.of nodes
     */
    public static int Count(Node root ){
        if(root==null){
            return 0;
        }
        int lcount =Count(root.left);
        int rcount =Count(root.right);
        int treecount= lcount+rcount+1 ;
        return treecount;
    }
    // Sum of nodes 
    public static int Sum(Node root){
        if(root==null){
            return 0;
        }
        int leftSum = Sum(root.left);
        int rightSum= Sum(root.right);
        int treesum = leftSum+rightSum+root.data;
        return treesum;
    }

    /*
    
     Diameter of a binary tree
     No.of nodes in the longest path between 2 leaves
     Approach 1 TC->O(n2)
     if diameter passes through root 
     root diam = lh+rh+1;
     if diameter doesn't pass through root
     l diam, r diam 
    
    */
    public static  int diameter(Node root){
        if(root==null){
            return 0;
        }
        int leftDiam = diameter(root.left);
        int leftHt=height(root.left);
        int rightDiam= diameter(root.right);
        int rightHt= height(root.right);
        int self=leftHt+rightHt+1;
        return Math.max(Math.max(rightDiam, rightHt),self);
    }
    /*
     * Approach 2 TC-> O(n)
     * 
     */
    static class Info{
        int diam;
        int ht;
        public  Info(int diam,int ht ){
            this.diam=diam;
            this.ht=ht;
        }
    }
    public static Info Diameter(Node root){
        if(root==null){
            return new Info(0, 0);
        }
        Info leftInfo=Diameter(root.left);
        Info rightInfo=Diameter(root.right);
        int diam = Math.max(Math.max(leftInfo.diam,rightInfo.diam),leftInfo.ht+rightInfo.ht+1);
        int ht= Math.max(leftInfo.ht,rightInfo.ht)+1;
        return new Info(diam ,ht);
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree= new BinaryTree();
        Node root= tree.buildTree(nodes);
        System.out.println(root.data);
        LevelOrder(root);
        System.out.println(height(root));
        System.out.println("Count of Nodes = "+ Count(root));
        System.out.println("sum of all nodes = "+ Sum(root));
        System.out.println("height of tree = "+ height(root));
        System.out.println("diameter of tree = "+ Diameter(root).diam );
    }
}
