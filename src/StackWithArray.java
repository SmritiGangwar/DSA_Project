import java.util.Scanner;

public class StackWithArray {
    int arr[];
    int size;
    int top;
    StackWithArray(int size)
    {   this.size=size;
        arr=new int[size];
        top=-1;
    }
    public void Push() {
        if (top == (size - 1)) {
            System.out.println("Overflow");
        }
        else {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter Data : ");
            int i = s.nextInt();
            top = top + 1;
            arr[top] = i;
            System.out.println("Data Inserted");
        }
    }
    public void Pop(){
        if(top==-1)
        {
            System.out.println("Underflow");
        }
        else{
            top=top-1;
            System.out.println("Item Deleted");
        }
    }
    public void Display()
    {
        for(int j=top;j>-1;j--)
            System.out.println(arr[j]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array : ");
        StackWithArray obj = new StackWithArray(sc.nextInt());
        //obj.Pop();
        obj.Push();
        obj.Push();
        obj.Display();
        obj.Pop();
        System.out.println("After POP");
        obj.Display();
    }
}
