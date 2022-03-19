public class DeleteAtPosition {
    class Node {
        Node next;
        int data;
        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    Node head=null;

    public void Deletion(int pos)
    {
        Node temp = head;
        Node ptr =temp.next;
        if (pos == 1) {
            temp = temp.next;
            head=temp;// Change head
            return;
        }
        for(int i=1;i<(pos-1);i++)
        {
            temp = ptr;
            ptr=ptr.next;
        }
        temp.next=ptr.next;

    }
    public void Insert(int data){
        Node newnode = new Node(data);
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
        DeleteAtPosition obj = new DeleteAtPosition();
        obj.Insert(1);
        obj.Insert(2);
        obj.Insert(3);
        obj.Insert(4);
        obj.Insert(5);
        obj.Show();
        System.out.println("After Deletion : ");
        obj.Deletion(1);
        obj.Show();
    }
}

