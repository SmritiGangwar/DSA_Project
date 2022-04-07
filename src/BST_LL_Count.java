//COunt number nodes present in BST
import java.util.Scanner;

public class BST_LL_Count {       //NODE CLASS
    int data;
    BST_LL_Count left;
    BST_LL_Count right;

    BST_LL_Count(int data){
        this.data=data;
    }

    public static BST_LL_Count Insert(BST_LL_Count root, BST_LL_Count newnode)
    {
        if(root==null){
            root=newnode;
            return root;
        }

        if(root.data>=newnode.data){
            if (root.left==null){
                root.left=newnode;
            }
            else{
                Insert(root.left, newnode);
            }
        }
        else{
            if(root.right==null)
                root.right=newnode;
            else{
                Insert(root.right ,newnode);
            }
        }
        return root;
    }


    public static void PreOderTraversal(BST_LL_Count root){
        if(root == null)
            return;
        System.out.println(root.data);
        PreOderTraversal(root.left);
        PreOderTraversal(root.right);
    }

    public static int Size(BST_LL_Count root){
        if (null == root ) return 0;
        return 1 + Size( root.left ) + Size( root.right );
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter root node :");
        BST_LL_Count root = new BST_LL_Count(sc.nextInt());
        Insert(null, root);
        while (true) {
            System.out.println("More Nodes? If yes then press 1 :");
            int c = sc.nextInt();
            {
                if (c == 1) {
                    System.out.println("Enter new node :");
                    BST_LL_Count newnode = new BST_LL_Count(sc.nextInt());
                    Insert(root, newnode);
                } else {
                    break;
                }
            }
        }
    }
}