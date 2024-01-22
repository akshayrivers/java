class linkedlist0{
    static class Node{
        public int data;
        public Node next;

        Node(){
            this.data=0;
            this.next=null;
        }
        Node(int data){
            this.data=data;
            this.next=null;
        }
        Node(int data,Node next){
            this.data=data;
            this.next=next;
        }
    }
    public static Node head;
    public static Node tail;
    
    //method to add first element into the linked list
    public static void addfirst(int data){
        //step 1: create new node
        Node newNode= new Node(data);
        if(head==null){
            head = newNode;
            tail= head;//set tail to new since its the first element
        }
        //step 2: newnode next = head
        newNode.next=head;//link
        //step 3: head = newnode
        head=newNode;
    }
    
    //method to add last element into the linked list
    public static void addlast(int data){
        Node newNode=new Node(data);//step 1 create a new node 
        tail.next =newNode;
        if(head==null){
            head=tail=newNode;
            return; 
        }
        tail=newNode;
    }

    //method to print the linked list
    public static void print(){
        if(head==null){
            System.out.println("linked list is empty");
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data);
            if (temp.next != null) {
                System.out.print("->");
            } else {
                System.out.print("->null");
            }
            temp = temp.next;
        }
        System.out.println();
    }
    
    //add the element at a given index 
    public static void add_Nth(int index,int data ){
        Node temp = head;
        Node newNode=new Node(data);
        int i=0;
        while (i<index-1) {
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    } 
    //method to remove the first element
    public static void removeFirst(){

    }

    //method to remove the last element
    public static void removeLast(){

    }

    //method to reverse the linked list 
    public static void reverse(){

    }

    //searching for an element with iterative approach
    public static boolean iter_search(){
return true;
    }

    //searching an element with recursive approach
    public static boolean rec_search(){
return true;
    }

    //checking if ll is palindrome
    public static boolean isPalindrome(){
return true;
    } 

    //removing nth node from ll
    public static void removeNth_node(){

    }

    //checking if the ll contains a cycle
    public static boolean isCycle(){
return true;
    }

    //method to remove the cycle 
    public static void removeCycle(){

    }
    public static void main(String args[]){
        linkedlist0 ll=new linkedlist0();
        addfirst(1);
        addfirst(0);
        addlast(9);
        addlast(10);
        add_Nth(2, 8);
        print();
    }

}