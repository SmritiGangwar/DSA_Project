import java.util.Scanner;

public class Test {
    static class Node{
        Node next;
        int data;
        int priority;
        Node(int data,int priority){
            this.data=data;
            this.priority= priority;
        }
    }
    int arr[];
    int size;
    int c[];
    int s[];
    int count;
    int sum;
    int x;
    Test(){
        Scanner sc = new Scanner(System.in);
        System.out.println("size : ");
        size = sc.nextInt();
        arr = new int[size];
        s = new int[size];
        c = new int[size];
        x=0;
        System.out.println("elements : ");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        for (int j = 0; j < arr.length; j++)
        {
            if(arr[j]%2!=0)
            {   count++;
                sum = sum + arr[j];
            }
            else
            {
                System.out.println("Can't perform the operation.");
                s[x]=sum;
                c[x]=count;
                x++;
                sum=0;
                count=0;
            }
        }
        s[x]=sum;
        c[x]=count;
    }
    public static class Queue{
        Node front;
        Node rear;
        Queue(){
            front=null;
            rear=null;
        }
        public void Enqueue(Node newnode)
        {
            if(front==null||newnode.priority<front.priority){
                newnode.next=front;
                front=newnode;
            }
            else{ Node temp=front;
                while(temp.next!=null && temp.next.priority<=newnode.priority)
                {
                    temp=temp.next;
                }
                newnode.next=temp.next;
                temp.next=newnode;
            }
        }
        public void Display(){
            Node temp=front;
            while(temp!=null)
            {
                System.out.println(temp.data + " " + temp.priority);
                temp=temp.next;
            }
        }
    }
    public static void main(String[] args) {
        Test obj = new Test();
        Node n1 = new Node(obj.s[0],obj.c[0]);
        Node n2 = new Node(obj.s[1],obj.c[1]);
        Node n3 = new Node(obj.s[2],obj.c[2]);
        Queue obj1 = new Queue();
        obj1.Enqueue(n1);
        obj1.Enqueue(n2);
        obj1.Enqueue(n3);
        obj1.Display();

    }
}
