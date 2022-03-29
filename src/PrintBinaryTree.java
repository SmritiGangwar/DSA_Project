//Print an Ordinary Binary Tree in correct form

class PBinaryNode<T>{
    T data;
    PBinaryNode<T> left;
    PBinaryNode<T> right;

    public PBinaryNode(T data){
        this.data=data;
    }
}

public class PrintBinaryTree{
    public static void main(String[] args) {
        PBinaryNode<Integer> root = new PBinaryNode<>(15);
        PBinaryNode<Integer> Rleft = new PBinaryNode<>(16);    //R-> for root node
        PBinaryNode<Integer> Rright = new PBinaryNode<>(20);
        PBinaryNode<Integer> Rleftright = new PBinaryNode<>(18);
        PBinaryNode<Integer> Rrightleft = new PBinaryNode<>(60);

        //Attachment
        root.left = Rleft;
        root.right = Rright;
        root.left.right = Rleftright;
        root.right.left = Rrightleft;

        Print(root);
    }
    public static void Print(PBinaryNode root)
    {
        if(root == null)
            return;
        System.out.print(" " +root.data + "->" + " " );     //NODE
        if(root.left!=null)
        {
            System.out.print(" "+"L"+root.left.data + " ");
        }
        if(root.right!=null)
        {
            System.out.print(" " +"R"+root.right.data+ " ");
        }
        System.out.println();
        Print(root.left);
        Print(root.right);
    }
}
