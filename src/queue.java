public class queue {
    int Front, Rear, size,Que[];

    // default constructor
    public queue(){
        this(10);
    }

    // proper constructor
    public queue(int size){
        this.size=size;
        Que= new int[size];
        Front=Rear=-1;
    }

    void enqueue(int data){
        if(Rear==size-1){
            System.out.println("Queue is Full");
        }
        else{
            if(Front == -1) Front = 0; // set front only for the first element
            Rear++;
            Que[Rear]=data;
        }
    }

    void dequeue() {
        if (Front == -1 || Front > Rear) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println("Dequeued element is " + Que[Front]);
        Front++;
        // reset when queue becomes empty
        if (Front > Rear) {
            Front = Rear = -1;
        }
    }

    void display() {
        if (Front == -1 || Front > Rear) {
            System.out.println("Queue is Empty");
            return;
        }
        for (int i = Front; i <= Rear; i++) {
            System.out.print(Que[i] + " -- ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        queue q = new queue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        System.out.println("Current Queue is:");
        q.display();
        q.dequeue();
        System.out.println("Current Queue after Dequeue is:");
        q.display();

    }
}
