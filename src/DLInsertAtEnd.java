//Insert a node at start in doubly linked list
public class DLInsertAtEnd {
    class Node{
        Node next;
        Node prev;
        int data;
        Node(int data)
        {
            this.next=null;
            this.prev=null;
            this.data=data;
        }
    }

    Node head=null;
    Node tail=null;
    public void Insertion(int data)
    {   Node newnode = new Node(data);
        if(head==null)
        {
            head=newnode;
            tail=newnode;
        }
        else{
            tail.next=newnode;
            newnode.prev=tail;
            tail=newnode;
            newnode.next=null;
//            Node temp=head;                     SIR
//            while(temp.next!=null)
//                temp=temp.next;
//            temp.next=newnode;
//            newnode.prev=temp;
        }
    }
    public void Show()
    {
        Node temp=head;
        while(temp.next!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
        System.out.println(temp.data);
    }

    public static void main(String[] args) {
        DLInsertAtEnd obj = new DLInsertAtEnd();
        obj.Insertion(1);
        obj.Insertion(2);
        obj.Insertion(3);
        obj.Show();

    }
}


