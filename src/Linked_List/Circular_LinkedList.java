//package Linked_List;
//
//class Node {
//    int data;
//    Node next;
//    Node(int d) {
//        data = d;
//        next = null;
//    }
//}
//
//public class Circular_LinkedList {
//    Node head;
//
//    Circular_LinkedList() {
//        head = null;
//    }
//
//    void insert(int data) {
//        Node n = new Node(data);
//        if (head == null) {
//            head = n;
//            head.next = n;
//        } else {
//            Node temp = head;
//            while (temp.next != head) {
//                temp = temp.next;
//            }
//            temp.next = n;
//            n.next = head;
//        }
//    }
//
//    void delete(int data) {
//        if (head == null) {
//            System.out.println("List is empty");
//            return;
//        }
//
//        Node curr = head, prev = null;
//        do {
//            if (curr.data == data) {
//                break;
//            }
//            prev = curr;
//            curr = curr.next;
//        } while (curr != head);
//
//        // If node was not found
//        if (curr == head && curr.data != data) {
//            System.out.println("Element not found");
//            return;
//        }
//
//        // If only one node
//        if (head.next == head && head.data == data) {
//            head = null;
//            return;
//        }
//
//        // If deleting head
//        if (curr == head) {
//            // find last
//            Node last = head;
//            while (last.next != head) {
//                last = last.next;
//            }
//            head = head.next;
//            last.next = head;
//        } else {
//            // deleting non-head node
//            prev.next = curr.next;
//        }
//    }
//
//    void search(int data) {
//        boolean found = false;
//        if (head == null) {
//            System.out.println("List is empty");
//            return;
//        }else{
//            Node temp = head;
//            while (temp.next!= head) {
//                if (temp.data == data) {
//                    found = true;
//                    break;
//                }
//                temp = temp.next;
//            }
//        }
//
//        if (found) System.out.println("Element found");
//        else System.out.println("Element not found");
//    }
//
//    void traverse() {
//        if (head == null) {
//            System.out.println("List is empty");
//            return;
//        }
//        Node temp = head;
//        do {
//            System.out.print(temp.data + " -> ");
//            temp = temp.next;
//        } while (temp != head);
//        System.out.println("(head)");
//    }
//
//    public static void main(String[] args) {
//        Circular_LinkedList cll = new Circular_LinkedList();
//        cll.insert(10);
//        cll.insert(20);
//        cll.insert(30);
//        System.out.println("Initial list:");
//        cll.traverse();
//        System.out.println("\nSearch 20:");
//        cll.search(20);
//        System.out.println("\nDelete 20:");
//        cll.delete(20);
//        cll.traverse();
//        System.out.println("\nSearch 20 again:");
//        cll.search(20);
//    }
//}
