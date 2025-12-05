class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next =null;
    }
}

public class Singly_LinkedList {
    Node head;
    Singly_LinkedList(){
        head=null;
    }

    void insertAtFirst(int data){
        Node n=new Node(data);
        if(head==null){head=n;}
        else{n.next =head;head=n;}
    }

    void insertAtLast(int data){
        Node n=new Node(data);
        if(head==null){head=n;}
        else{
            Node temp=head;
            while(temp.next !=null){temp=temp.next;}
            temp.next =n;
        }
    }

    void insertAtPos(int data, int Pos){
        Node n=new Node(data);
        if(head==null){head=n;}
        else{
            Node prev=head,curr=head;
            for(int i=1;i<Pos;i++){
                prev=curr;
                curr=curr.next;
            }
            prev.next =n;
            n.next =curr;
        }
    }

    void deleteAtFirst(){
        if(head==null){System.out.println("List is empty");}
        else{
            Node temp=head;
            head=head.next;
            temp.next =null;
        }
    }

    void deleteAtLast(){
        if(head==null){System.out.println("List is empty");}
        else{
            Node temp=head;
            while(temp.next !=null){temp=temp.next;}
            temp=null;
        }
    }

    void deleteAtPos(int Pos){
        if(head==null){System.out.println("List is empty");}
        else{
            Node prev=head,curr=head;
            for(int i=1;i<Pos;i++){
                prev=curr;
                curr=curr.next;
            }
            prev.next =curr.next;
            curr.next =null;
        }
    }

    void search(int data){
        if(head==null){System.out.println("List is empty");}
        else{
            Node temp=head;
            int flag=0,pos=0;
            while(temp!=null){
                if(temp.data==data){
                    flag=1;
                    break;
                }
                temp=temp.next;
                pos++;
            }
            if(flag==1){System.out.println("Element found at position: "+pos);}
            else{System.out.println("Element not found");}
        }

    }

    void traverse(){
        if(head==null){System.out.println("List is empty");}
        else{
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" -> ");
                temp=temp.next;
            }
            System.out.println("null");
        }
    }

    void reverse(){
        Node prev=head;
        Node curr=prev.next;
        Node next=curr.next;
        while(curr.next!=null){
            curr.next =prev;
            prev=curr;
            curr=next;
            next=next.next;
        }
        curr.next =prev;
        head.next =null;
        head=curr;
    }
    public static void main(String[] args) {
        Singly_LinkedList l1=new Singly_LinkedList();
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
