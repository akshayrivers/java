
import java.util.*;
class stack {
    /**
     * Operations:
     * 1. push O(1)
     * 2. pop O(1)
     * 3. peek O(1)
     * 
     * Implementaion:
     * 1.Arrays-> fixed length
     * 2.ArrayList-> variable length
     * 3.Linked List-> variable length
     * @param args
     */
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
        static class stack0{
            //Stack using ArrayList
            // static ArrayList<Integer> list=new ArrayList<>();
            // public static boolean isEmpty(){
            //     return list.size()==0;
            // }
            // //push
            // public static void push(int data){
            //     list.add(data);
            // 
            // //pop
            // public static int pop(){
            //     int top=list.get(list.size()-1);
            //     list.remove(list.size()-1);
            //     return top;
            // }
            // //peek
            // public static int peek(){
            //     return list.get(list.size()-1);
            // }
                static ArrayList<Integer> list=new ArrayList<>();
                public static boolean isEmpty(){
                    return list.size()==0;
                }
                //push
                public static void push(int data){
                    list.add(data);
                }
                //pop
                public static int pop(){
                    int top=list.get(list.size()-1);
                    list.remove(list.size()-1);
                    return top;
                }
                //peek
                public static int peek(){
                    return list.get(list.size()-1);
                }
            // //Stack using linkedlist
            //     static Node head = null;
            //     public static boolean isEmpty(){
            //         return head==null;
            //     }
            //     //push
            //     public static void push(int data){
            //         Node newNode=new Node(data);
            //         if(isEmpty()){
            //             head=newNode;
            //             return;
            //         }
            //         newNode.next = head;
            //         head=newNode;
            //     }
            //     //pop
            //     public static int pop(){
            //         if(isEmpty()){
            //             return-1;
            //         }
            //         int top=head.data;
            //         head=head.next;
            //         return top;
            //     }
            //     //peek
            //     public static int peek(){
            //         if(isEmpty()){
            //             return -1;
            //         }
            //         return head.data;
            //     }
         
        }
    
     
    public static void main(String[] args) {
        stack0 s = new stack0();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(6);

        while(!s.isEmpty()){
            System.out.print(s.peek()+"  ");
            s.pop();
        }
    
    }
}
