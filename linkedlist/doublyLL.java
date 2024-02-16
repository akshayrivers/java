public class doublyLL {
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public doublyLL() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    public  void Addfirst(int data){
        Node newNode= new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    public  void Addlast(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }
    public void Print(){
        if( head!=null&&tail!=null){
            System.out.println("ll is empty");
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            if(temp.next==null){
                System.out.print("null");
            }
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        doublyLL dll=new doublyLL();
        dll.Addfirst(2);
        dll.Addlast(8);
        dll.Addfirst(9);
        dll.Addlast(5);
        dll.Print();

    }
}
