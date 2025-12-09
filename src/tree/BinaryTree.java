//class Node{
//    int data;
//    Node right;
//    Node left;
//    Node(int data){
//        this.data=data;
//        left=null;
//        right=null;
//    }
//}
//
//public class BinaryTree {
//
//    void inorder(Node root){
//        if(root!=null){
//            inorder(root.left);
//            System.out.print(root.data+" ");
//            inorder(root.right);
//        }
//    }
//
//    void preorder(Node root){
//        if(root!=null){
//            System.out.print(root.data+" ");
//            preorder(root.left);
//            preorder(root.right);
//        }
//    }
//
//    void postorder(Node root){
//        if(root!=null){
//            postorder(root.left);
//            postorder(root.right);
//            System.out.print(root.data+" ");
//        }
//    }
//
//    void Levelorder(Node root){
//        if(root!=null){
//            java.util.Queue<Node> q=new java.util.LinkedList<>();
//            q.add(root);
//            while(!q.isEmpty()){
//                Node temp=q.poll();
//                System.out.print(temp.data+" ");
//                if(temp.left!=null) q.add(temp.left);
//                if(temp.right!=null) q.add(temp.right);
//            }
//        }
//    }
//
//    public static void main(String[] args){
//        BinaryTree bt=new BinaryTree();
//        Node root=new Node(10);
//        root.left=new Node(20);
//        root.right=new Node(30);
//        root.left.left=new Node(40);
//        root.left.right=new Node(50);
//        root.right.left=new Node(60);
//        root.right.right=new Node(70);
//        bt.inorder(root);
//        System.out.println(" - # - Inorder");
//        bt.preorder(root);
//        System.out.println(" - # - Preorder");
//        bt.postorder(root);
//        System.out.println(" - # - Postorder");
//        //bt.Levelorder(root);
//
//    }
//}
