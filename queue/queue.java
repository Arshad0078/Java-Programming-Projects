package queue;
class queue {
    int q[];
    int front,rear,maxsize;
    int size = 5;
    queue(int size){
        q = new int[size];
        front = -1;
        rear = -1;
        maxsize = size;
    }    
    void enQueue(int item)
    {
        if (rear==maxsize-1)
            System.out.println("Queue is Full");
        else
        {
            if (front==-1)front=0;
            q[++rear]=item;
            System.out.println("Element inserted:"+item);
        }
    }
    void deQueue()
    {
        if (front==-1||front>rear)
            System.out.println("que is empty");
        else
            System.out.println("Element deleted:"+q[front++]);
    }
}
class demo{
    public static void main(String args[]){
        queue myQueue = new queue(5);
        myQueue.enQueue(1);
        myQueue.enQueue(2);
        myQueue.enQueue(3);
        System.out.println();
        myQueue.deQueue();
        myQueue.deQueue();
        myQueue.deQueue();
        myQueue.deQueue();
        myQueue.enQueue(4);
        myQueue.enQueue(5);
        myQueue.deQueue();
    }
}
