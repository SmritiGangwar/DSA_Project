public class StackWithLL {
    class Node{
        Node next;
        int data;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node top=null;
    public void Push(int data){
        Node newnode = new Node(data);
        if(top==null){
            top=newnode;
            top.next=null;
        }
        else{
            newnode.next=top;
            top=newnode;
        }
    }
    public void Pop(){
        if(top==null)
            System.out.println("Stack is Empty");
    }
    public void Show(){
        Node temp=top;
        while(top.next!=null) {
            System.out.println(top.data);
            top = top.next;
        }
        System.out.println(top.data);
    }

    public static void main(String[] args) {
        StackWithLL obj = new StackWithLL();
        obj.Push(1);
        obj.Push(2);
        obj.Show();
    }
}

