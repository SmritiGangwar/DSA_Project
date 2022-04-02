import java.util.Scanner;

public class QueueWithArray {
    int arr[];
    int data;
    int size;
    int F;
    int R;
    QueueWithArray(int size){
        this.size=size;
        arr=new int[size];
        F=-1;
        R=-1;
    }
    public void Enque(int data){
        if(R==(size-1))
        {
            System.out.println("Overflow.");
        }
        else{
            if(F==-1&&R==-1)
            {   F=0;
                R=R+1;
                arr[R]=data;
                System.out.println("Data Inserted");
            }
            else{
                R=R+1;
                arr[R]=data;
            }
        }
    }
    public void Dequeue(){
        if(F==-1 && R==-1)
            System.out.println("Underflow");
        else{
            System.out.println(arr[F]);
            F=F+1;
        }
    }
    public void Show(){
        for(int i=F;i<=R;i++)
            System.out.println(arr[i]);
    }

    public static void main(String[] args) {
        System.out.println("Enter Size of Queue : ");
        Scanner sc = new Scanner(System.in);
        QueueWithArray obj = new QueueWithArray(sc.nextInt());
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
