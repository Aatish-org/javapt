//import java.util.Scanner;
//
//class Linked_List.Node{
//    int data;
//    Linked_List.Node left;
//    Linked_List.Node right;
//    Linked_List.Node(int data){
//        this.data=data;
//        this.left =null;
//        this.right=null;
//    }}
//
//public class Doubly_LinkedList {
//    Linked_List.Node head,Tail;
//    Doubly_LinkedList(){
//        head=null;
//        Tail=null;
//    }
//
//    void insertAtFirst(int data){
//        Linked_List.Node n=new Linked_List.Node(data);
//        if(head==null){
//            head=n;
//            Tail=n;
//        }
//        else{
//            n.right =head;
//            head.left =n;
//            head=n;
//        }
//    }
//
//    void insertAtLast(int data){
//        Linked_List.Node n=new Linked_List.Node(data);
//        if(head==null){
//            head=n;
//            Tail=n;
//        }
//        else{
//            Tail.right =n;
//            n.left =Tail;
//            Tail=n;
//        }
//    }
//
//    void insertAtPos(int data,int Pos){
//        Linked_List.Node n=new Linked_List.Node(data);
//        if(head==null){
//            head=n;
//            Tail=n;
//        }
//        else{
//            Linked_List.Node prev=head,curr=head;
//            for(int i=1;i<Pos;i++){
//                prev=curr;
//                curr=curr.right;
//            }
//            prev.right=n;
//            n.left=prev;
//            n.right=curr;
//            curr.left=n;
//        }
//    }
//
//    void deleteAtFirst(){
//        if(head==null){System.out.println("List is empty");}
//        else{
//            Linked_List.Node temp=head;
//            head=temp.right;
//            head.left =null;
//        }
//    }
//
//    void deleteAtLast(){
//        if(head==null){System.out.println("List is empty");}
//        else{
//            Linked_List.Node temp=Tail;
//            Tail=temp.left;
//            Tail.right=null;
//        }
//    }
//
//    void deleteAtPos(int data,int Pos){
//        Linked_List.Node n=new Linked_List.Node(data);
//        if(head==null){System.out.println("List is empty");}
//        else{
//            Linked_List.Node prev=head,curr=head,temp=head;
//            for(int i=1;i<Pos;i++){
//                prev=curr;
//                curr=curr.right;
//            }
//            temp=curr.right;
//            prev.right=temp;
//            temp.left=prev;
//            curr.left=null;
//            curr.right=null;
//        }
//    }
//
//    void traversefwd(){
//        Linked_List.Node temp=head;
//        while(temp!=null){
//            System.out.print(temp.data+" <=> ");
//            temp=temp.right;
//        }
//        System.out.println("null");
//    }
//
//    void traversebwd(){
//        Linked_List.Node temp=Tail;
//        while(temp!=null){
//            System.out.print(temp.data+" <=> ");
//            temp=temp.left;
//        }
//        System.out.println("null");
//    }
//
//    void search(int data){
//        Linked_List.Node temp=head;
//        int pos=0;
//        boolean found=false;
//        while(temp!=null){
//            pos++;
//            if(temp.data==data){
//                found=true;
//                break;
//            }
//            temp=temp.right;
//        }
//        if(found){System.out.println("Element "+data+" found at position "+pos);}
//        else{System.out.println("Element not found");}
//    }
//
//    public static void main(String[] args) {
//        Scanner obj=new Scanner(System.in);
//        Doubly_LinkedList dll=new Doubly_LinkedList();
//        dll.insertAtFirst(10);
//        dll.insertAtLast(20);
//        dll.insertAtLast(30);
//        dll.insertAtLast(40);
//        dll.insertAtLast(50);
//        dll.traversefwd();
//        dll.insertAtPos(15,2);
//        dll.traversefwd();
//        dll.deleteAtFirst();
//        dll.traversefwd();
//        dll.deleteAtLast();
//        dll.traversefwd();
//        dll.deleteAtPos(30,3);
//        dll.traversefwd();
//        dll.traversebwd();
//        dll.search(40);
//
//
//    }
//}
