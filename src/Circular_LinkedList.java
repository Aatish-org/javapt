package hello;
class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

public class Circular_LinkedList {
    Node head;
    Circular_LinkedList() {
        head = null;
    }

    void insert(int data){
        Node n=new Node(data);
        if(head==null){
            head=n;
            head.next=n;
    }
        else{

        }
}

