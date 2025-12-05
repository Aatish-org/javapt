import java.util.Stack;

public class stack {
    int top,size,arr[];
    int Stack(int size){
        this.size=size;
        arr=new int[size];
        top=-1;
    }

    void push(int data){
        if(top==size-1){
            System.out.println("Stack Overflow");
        }
        else{
            top++;
            arr[top]=data;
        }
    }

    void pop(){
        if(top==-1){System.out.println("Stack is Empty");}
        else{
            top--;
        }
    }

    void peek(){
        if(top==-1){System.out.println("Stack is Empty");}
        else{
            System.out.println("Top element is: "+arr[top]);
        }
    }
    void display(){
        if(top==-1){System.out.println("Stack is Empty");}
        else{
            for(int i=top;i>=0;i--){
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(5);
        st.push(10);
        st.push(15);
        st.display();
        st.peek();
        st.pop();
        st.display();

    }
}
