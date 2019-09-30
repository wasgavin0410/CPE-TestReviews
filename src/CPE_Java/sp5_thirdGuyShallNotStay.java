package CPE_Java;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class sp5_thirdGuyShallNotStay {

    public static void main(String[] args){

        //now you've got a queue of students, and asking them for counting their own number
        //number starts at 1 and will be ended at 3, the student who count to 3 will be removed
        Scanner sc  = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        int count = 0;
        int num = sc.nextInt();

        for (int i=1;i<=num;i++)    queue.offer(i);
        //be noticed that not started the parameter as 0

        while(queue.size() != 1){
            count++;

            if (count == 3){
                queue.poll();
                count = 0;
            }else{
                //when the student's count is not equals 3
                queue.offer(queue.poll());
                //make the student pulled from the head of line and goes to the tail
            }

        }

        System.out.println(queue.peek());
    }
}
