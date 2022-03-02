//Delete last node Linked List.

public class LLDeleteAtEnd {
    class Node {
        Node next;
        int data;
        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    Node head=null;

    public void Deletion()
    {
        Node temp = head;
        Node ptr =temp.next;
        while(ptr.next!=null)
        {
            temp = ptr;
            ptr=ptr.next;
        }
        temp.next=null;

    }
    public void Insert(int data){
        Node  newnode = new Node(data);
        newnode.data = data;
        newnode.next=null;
        if(head==null)
        {
            head=newnode;
        }
        else{
            Node temp =head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newnode;
        }
    }
    public void Show(){
        int c=1;
        Node temp=head;
        while(temp.next!=null)
        {    System.out.println("Position " + c + " element : " +temp.data);
            temp=temp.next;
            c++;
        }
        System.out.println("Position " + c + " element : " +temp.data);
    }
    public static void main(String[] args) {
        LLDeleteAtEnd obj = new LLDeleteAtEnd();
        obj.Insert(1);
        obj.Insert(2);
        obj.Insert(3);
        obj.Show();
        System.out.println("After Deletion : ");
        obj.Deletion();
        obj.Show();
    }
}