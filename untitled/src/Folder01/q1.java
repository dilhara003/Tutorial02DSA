package Folder01;

public class q1 {
    public static void main(String[]args){
        Queue queue=new Queue(50);

        String str1 = "Data";
        String str2 = "Structures";

        queue.append(str1);
        queue.append(str2);

        while (!queue.isQueueEmpty()){
            System.out.print(queue.serve());
        }

    }
}
