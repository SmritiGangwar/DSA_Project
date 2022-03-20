//Insert a node at start in doubly linked list
public class DLInsertAtStart {
    class Node{
        Node next;
        Node prev;
        int data;
        Node(int data)
        {
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }

    Node head=null;
    Node tail=null;
    public void Insert(int data)
    {
        Node newnode=new Node(data);
        if(head==null)
        {
            head=newnode;
            tail=newnode;
        }
        else{
            newnode.next=head;
            head.prev=newnode;
            head=newnode;
            newnode.prev=null;
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
        DLInsertAtStart obj = new DLInsertAtStart();
        obj.Insert(1);
        obj.Insert(2);
        obj.Insert(3);
        obj.Show();

    }
}