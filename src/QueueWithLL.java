public class QueueWithLL {
    class Node{
        Node next;
        int data;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node F = null;
    Node R = null;
    public void Enque(int data){
        Node newnode = new Node(data);
        if(F==null && R==null )
        {
            F=newnode;
            R=newnode;
        }
        else{
            R.next=newnode;
            R=newnode;
        }
    }
    public void Dequeue(){
        if(F==null && R==null)
            System.out.println("Underflow");
        else{
            F=F.next;
        }
    }
    public void Show(){
        Node temp = F;
        while(temp.next!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
        System.out.println(temp.data);
    }
    public static void main(String[] args) {
        QueueWithLL obj = new QueueWithLL();
        obj.Enque(1);
        obj.Enque(2);
        obj.Enque(3);
        obj.Show();
        System.out.println("Dequeue : ");
        obj.Dequeue();
        System.out.println("After Dequeue : ");
        obj.Show();
    }

}
