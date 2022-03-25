//Delete a node at specific Position
public class DLDeleteAtPosition {
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
    public void Delete(int pos)
    {   Node temp=head;
        Node ptr=temp.next;
        if(pos==1)
        {
            head=head.next;     //does not work for temp
            head.prev=null;
            return;
        }

        for(int i=1;i<(pos-1);i++)
        {
            temp=temp.next;
            ptr=ptr.next;
        }
        temp.next=ptr.next;
        ptr.next.prev=temp;

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
        DLDeleteAtPosition obj = new DLDeleteAtPosition();
        obj.Insert(1);
        obj.Insert(2);
        obj.Insert(3);
        obj.Show();
        System.out.println("After deletion");
        obj.Delete(1);
        obj.Show();
    }
}

