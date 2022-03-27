//Insert new node at the beginning of Circular linked list.
public class CLInsertAtStart {
    class Node{
        Node next;
        int data;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head = null;
    public void Insertion(int data)
    {
        Node newnode = new Node(data);
        newnode.data=data;
        newnode.next=null;

        if(head==null)
        {
            head=newnode;
            newnode.next=head;    //new line
        }
        else
        {   Node temp=head;
            while(temp.next!=head)
                temp=temp.next;
            newnode.next=head;
            head=newnode;
            //temp=head;

            // head=newnode;
        }
    }
    public void Show()
    {
        if(head==null)
        {
            System.out.println("List is Empty");
        }
        else {
            Node temp=head;
            int c =1;
            while (temp.next!= head) {
                System.out.println("Position "+c+" data : "+temp.data);
                temp = temp.next;
                c++;
            }
            System.out.println(temp.data);          //to print the last data
        }
    }

    public static void main(String[] args) {
        CLInsertAtStart obj = new CLInsertAtStart();
        obj.Insertion(1);
        obj.Insertion(2);
        obj.Insertion(3);
        obj.Insertion(4);
        obj.Show();
    }
}
