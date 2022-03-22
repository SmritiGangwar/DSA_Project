//Insert node at the position
public class InsertAtPositionDL {
    class Node{
        Node next;
        Node prev;
        int  data;
        Node(int data) {
            this.data = data;
            this.next=null;
            this.prev=null;
        }
    }
    Node head=null;
    Node tail=null;
    public void Insert(int data)
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
    public void InsertAt(int data,int pos)
    {
        Node newnode = new Node(data);
        Node temp=head;
        if(pos==1)
        {
            newnode.next=head;
            head.prev=newnode;
            head=newnode;
            newnode.prev=null;
            return;
        }
        for(int i=1;i<(pos-1);i++)
        {
            temp=temp.next;
        }
        newnode.next=temp.next;
        temp.next=newnode;

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
        InsertAtPositionDL obj = new InsertAtPositionDL();
        obj.Insert(1);
        obj.Insert(2);
        obj.Insert(3);
        obj.Show();
        System.out.println("After : ");
        obj.InsertAt(4,1);
        obj.Show();
    }
}


