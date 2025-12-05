public class LinkedStack {
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node top;

    void push(int data){
        Node n=new Node(data);
        if(top==null){top=n;}
        else{
            n.next=top;
            top=n;
        }
    }

    void pop(){
        if(top==null){System.out.println("LinkedStack is Empty");}
        else{
            Node temp=top;
            top=top.next;
            temp.next=null;
        }
    }

    void peek(){
        if(top==null){System.out.println("LinkedStack is Empty");}
        else{
            System.out.println("Top Element is "+top.data);
        }
    }

    void display(){
        if(top==null){System.out.println("LinkedStack is Empty");}
        else{
            Node temp=top;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }


    public static void main(String[] arg){
        LinkedStack ls=new LinkedStack();
        ls.push(10);
        ls.push(20);
        ls.push(30);
        ls.display();
        ls.peek();

    }
}
