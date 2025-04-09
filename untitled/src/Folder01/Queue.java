package Folder01;

public class Queue {
    private String[] queue;
    private int front;
    private int rear;
    private int maxSize;
    private int count;

    Queue(int size){
        queue = new String[size];
        maxSize=size;
        front=0;
        rear=-1;
        count=0;
    }

    public boolean isQueueEmpty(){
        return (count==0);
    }

    public boolean isQueueFull(){
        return (count==maxSize);
    }

    public void append(String item){
        if(isQueueFull()){
            System.out.println("\nQueue is Full\n");
        }
        else{
            System.out.println("Inserting "+ item);
            queue[++rear]= item;
            count++;
        }
    }

    public int serve(){
        if(isQueueEmpty()){
            System.out.println("Queue is Empty ");
            return 0;
        }else{
            int x = Integer.parseInt(queue[front++]);
            count--;
            return x;
        }
    }

    public int QueueSize(){
        return count;
    }
}
