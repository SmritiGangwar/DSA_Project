import java.util.Scanner;

public class CircularQueue {
    int data;
    int arr[];
    int size;
    int F;
    int R;
    CircularQueue(int size){
        this.size=size;
        arr=new int[size];
        F=-1;
        R=-1;
    }
    public void Enqueue(int data){
        if(F==-1 && R==-1)
        {
            F=0;
            R=0;
            arr[R]=data;
        }
        else{
            if(F==(R+1)%size){
                System.out.println("Overflow");
            }
            else{
                R=(R+1)%size;
                arr[R]=data;
            }
        }
    }
    public void Dequeue(){
        if((F==-1 && R==-1))
            System.out.println("UnderFlow");
        else if(F==R)
        {
            System.out.println(arr[F]);
            F=-1;R=-1;
        }
        else
        {
            System.out.println(arr[F]);
            F=(F+1)%size;
        }
    }
    public void Show(){
        int i;
        for( i=F;i!=R;i=(i+1)%size){
            System.out.println(arr[i]);
        }
        System.out.println(arr[i]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size : ");
        CircularQueue obj = new CircularQueue(sc.nextInt());
        obj.Enqueue(1);
        obj.Enqueue(2);
        obj.Enqueue(3);
        obj.Show();
        obj.Dequeue();
        System.out.println("After Dequeue :");
        obj.Show();
    }
}
