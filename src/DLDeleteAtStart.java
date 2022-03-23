//Delete first node in doubly linked list.
public class DLDeleteAtStart {
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
    {
        head=head.next;
        head.prev=null;
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
        DLDeleteAtStart obj = new DLDeleteAtStart();
        obj.Insertion(1);
        obj.Insertion(2);
        obj.Insertion(3);
        obj.Show();
        System.out.println("After deletion");
        obj.Delete();
        obj.Show();
    }
}
