package Folder01;

public class Queue {
    private String[] queue;
    private int front;
    private int rear;
    private int maxSize;
    private int count;

    public Queue(int size){
        queue = new String[size];
        maxSize = size;
        front = 0;
        rear = -1;
        count = 0;
    }

    public boolean isQueueEmpty(){
        return (count == 0);
    }

    public boolean isQueueFull(){
        return (count == maxSize);
    }

    public void append(String item){
        if(isQueueFull()){
            System.out.println("\nQueue is Full\n");
        } else {
            queue[++rear] = item;
            count++;
        }
    }

    public String serve(){
        if(isQueueEmpty()){
            System.out.println("Queue is Empty");
            return null;
        } else {
            String x = queue[front++];
            count--;
            return x;
        }
    }

    public int queueSize(){
        return count;
    }
}
