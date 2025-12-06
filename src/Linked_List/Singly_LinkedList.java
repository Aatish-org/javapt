
package Linked_List;

public class Singly_LinkedList {

    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    private Node head;
    public Singly_LinkedList() {
        head = null;
    }

    void insertAtFirst(int data) {
        Node n = new Node(data);
        n.next = head;
        head = n;
    }

    void insertAtLast(int data) {
        Node n = new Node(data);
        if (head == null) {
            head = n;
            return;
        }
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = n;
    }

    void insertAtPos(int data, int pos) {
        if (pos <= 1 || head == null) {
            insertAtFirst(data);
            return;
        }
        Node n = new Node(data);
        Node prev = head;
        for (int i = 1; i < pos - 1 && prev.next != null; i++) prev = prev.next;
        n.next = prev.next;
        prev.next = n;
    }

    void deleteAtFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }

    void deleteAtLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) temp = temp.next;
        temp.next = null;
    }

    void deleteAtPos(int pos) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (pos <= 1) {
            deleteAtFirst();
            return;
        }
        Node prev = head;
        for (int i = 1; i < pos - 1 && prev.next != null; i++) prev = prev.next;
        if (prev.next == null) {
            System.out.println("Position out of bounds");
            return;
        }
        prev.next = prev.next.next;
    }

    void search(int data) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        int pos = 1;
        while (temp != null) {
            if (temp.data == data) {
                System.out.println("Element found at position: " + pos);
                return;
            }
            temp = temp.next;
            pos++;
        }
        System.out.println("Element not found");
    }

    void traverse() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

//    void reverse() {
//        Node prev = null;
//        Node curr = head;
//        while (curr != null) {
//            Node next = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = next;
//        }
//        head = prev;
//    }

    void reverse(){
        head=recurreverse(head,null);
    }

    Node recurreverse(Node curr, Node prev){
        if(curr==null) return prev;
        Node next=curr.next;
        curr.next=prev;
        return recurreverse(next,curr);
    }

    public static void main(String[] args) {
        Singly_LinkedList l1 = new Singly_LinkedList();
        l1.insertAtFirst(20);

        l1.insertAtLast(30);

        l1.insertAtLast(25);
        l1.insertAtPos(40, 2);
        System.out.println("Before reverse:");
        l1.traverse();

        l1.reverse();

        System.out.println("After reverse:");
        l1.traverse();
    }
}