package tree;

class Node{
    int data;
    Node right;
    Node left;
    Node(int data){
        this.data=data;
        left=null;
        right=null;
    }
}

public class BinarySearchTree {
    Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }
        return root;
    }

    void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }

    void preorder(Node root){
        if(root!=null){
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    void postorder(Node root){
        if(root!=null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
    }

    boolean search(Node root, int data){
        Node temp = root;
        if(root==null){
            System.out.println("Tree is empty");
            return false;
        }
        while (temp != null) {
            if (temp.data == data) {
                return true;
            }
            if (data < temp.data) { // go left if target \< current
                temp = temp.left;
            } else { // go right if target \> current
                temp = temp.right;
            }
        }
        return false;
    }
    Node root;
//    tree.Node delete(int data){
//        if (root == null) {
//            return null;
//        }
//        if (data < root.data) {
//            root.left = delete(root.left, data);
//        } else if (data > root.data) {
//            root.right = delete(root.right, data);
//        } else {
//            // node found
//            if (root.left == null) {
//                return root.right; // includes case both null
//            } else if (root.right == null) {
//                return root.left;
//            } else {
//                // two children: replace with inorder successor
//                tree.Node succ = minValue(root.right);
//                root.data = succ.data;
//                root.right = delete(root.right, succ.data);
//            }
//        }
//        return root;
//    }

    int heightUtil(Node root){
        if (root == null) {
            return 0;
        }
        int leftHeight = heightUtil(root.left);
        int rightHeight = heightUtil(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        Node root = null;
        root = bst.insert(root, 50);
        bst.insert(root, 30);
        bst.insert(root, 20);
        bst.insert(root, 40);
        bst.insert(root, 70);
        bst.insert(root, 60);
        bst.insert(root, 80);
        System.out.println("Inorder traversal of the BST:");
        bst.inorder(root);
        System.out.println("\nPreorder traversal of the BST:");
        bst.preorder(root);
        System.out.println("\nPostorder traversal of the BST:");
        bst.postorder(root);
        System.out.println("\n\nSearch 60: " + bst.search(root, 60));
        System.out.println("Search 25: " + bst.search(root, 25));
        int height = bst.heightUtil(root);
        System.out.println("Height of the BST: " + height);

    }
}
