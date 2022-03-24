//Delete last node of a doublt Linked List

public class DLDeleteAtEnd {
    class Node{
        Node next;
        Node prev;
        int data;
        Node(int data) {
            this.data = data;
            this.next=null;
            this.prev=null;
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
        }
    }
    public void Delete()
    {   Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp=temp.prev;
        temp.next=null;
    }
    public void Show(){
        Node temp=head;
        while(temp.next!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
        System.out.println(temp.data);
    }

    public static void main(String[] args) {
        DLDeleteAtEnd obj = new DLDeleteAtEnd();
        obj.Insertion(1);
        obj.Insertion(2);
        obj.Insertion(3);
        obj.Show();
        System.out.println("After deletion");
        obj.Delete();
        obj.Show();
    }
}

