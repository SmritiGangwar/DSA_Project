import java.util.Scanner;
import java.util.Stack;

public class ArrayProduct {
    int arr[];
    int size;
    int minpro,maxpro;
    int min,max;
    int a,b,c,d;
    ArrayProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.println("size : ");
        size = sc.nextInt();
        arr = new int[size];
        System.out.println("elements : ");
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();

        min = arr[0]*arr[1];
        max = arr[0]*arr[1];
        for(int j=0;j< arr.length;j++)
        {   for(int k=0;k<arr.length;k++)
        {   if(j==k)
            continue;
        else {
            minpro=arr[j]*arr[k];
            maxpro = arr[j]*arr[k];
            if(minpro<=min) {
                min = minpro;
                a = j;
                b = k;
            }
            if(maxpro>=max)
            {   max=maxpro;
                c=j;
                d=k;
            }
        }
        }
        }

    }

    public static void main(String[] args){
        ArrayProduct obj = new ArrayProduct();
        Stack<Integer> Stack= new Stack<Integer>();
        Stack.push(obj.a);
        Stack.push(obj.b);
        Stack.push(obj.c);
        Stack.push(obj.d);
        System.out.println("Stack : "+ Stack);
        System.out.println("min product ;" + obj.min);
        System.out.println("j="+obj.a+" k="+ obj.b);
        System.out.println("max product ;" + obj.max);
        System.out.println("j="+obj.c+" k="+ obj.d);

    }

}

