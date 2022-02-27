//Delete first node of Linked List.
public class LLDeleteAtStart {
    static class Node {
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
        temp = temp.next;
        head = temp;
    }
    public void Insert(int data){
        Node newnode = new Node( data);
        newnode.data=data;
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
        LLDeleteAtStart obj = new LLDeleteAtStart();
        obj.Insert(1);
        obj.Insert(2);
        obj.Insert(3);
        obj.Show();
        System.out.println("After Deletion : ");
        obj.Deletion();
        obj.Show();
    }
}

