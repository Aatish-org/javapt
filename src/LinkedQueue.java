public class LinkedQueue {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    Node Front,Rear;
    public LinkedQueue(){
        Front=Rear=null;
    }


    void enqueue(int data){
        Node n=new Node(data);
        if(Rear==null){
            Front=Rear=n;
        }
        else{
            Rear.next=n;
            Rear=n;
        }
    }

    void dequeue(){
        if(Front==null){
            System.out.println("Queue is Empty");
        }else{
            Node temp=Front;
            Front=Front.next;
            temp.next=null;
        }
    }

    void display(){
        if(Front==null){
            System.out.println("Queue is Empty");
        }
        else{
            Node temp=Front;
            while(temp!=null){
                System.out.println(temp.data+" ");
                temp=temp.next;
            }
        }
    }
    public static void main(String[] args) {
        LinkedQueue q=new LinkedQueue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        System.out.println("Queue elements:");
        q.display();
        q.dequeue();
        System.out.println("Queue elements after dequeue:");
        q.display();
    }
}
