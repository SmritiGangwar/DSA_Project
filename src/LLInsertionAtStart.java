import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        next=null;
    }
}
public class LLInsertionAtStart {
    Node head=null;
    int n;
    public void Creation() {
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter element ; ");
            int data = sc.nextInt();
            Node newnode = new Node(data);
            if (head == null) {
                head = newnode;
            } else {
                newnode.next = head;
                head = newnode;
            }
            System.out.println("Do you want to add more elements? Press 1 : ");
            n = sc.nextInt();
        } while (n == 1);
    }
    public void Traversing(){
        Node temp=head;
        if(head==null)
            System.out.println("Empty");
        else
        {   while(temp.next!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
        }
    }
    public static void main(String[] args) {
        LLInsertionAtStart obj = new LLInsertionAtStart();
        obj.Creation();
        obj.Traversing();


    }

}
