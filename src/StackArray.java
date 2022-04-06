import java.util.Scanner;

public class StackArray {
    int arr[];
    int top;
    int size;
    StackArray(int size){
        arr=new int[size];
        top=-1;
    }
    public boolean StackisFull(){
        if(top==size-1) {
            System.out.println("Overflow");
            return true;
        }
        else {
            return false;
        }
    }
    public boolean StackisEmpty(){
        if(top==-1) {
            System.out.println("Underflow");
            return true;
        }
        else {
            return false;
        }
    }
    public void Peek(){
        if(!StackisEmpty())
        {
            System.out.println(arr[top]);
        }
        else
            System.out.println("Stack is Empty.");
    }