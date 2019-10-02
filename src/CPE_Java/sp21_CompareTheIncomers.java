package CPE_Java;

import java.util.ArrayList;
import java.util.Scanner;

public class sp21_CompareTheIncomers {
    public static void main(String[] args){
        //tips : the first int is used to make confirm about how many of integers would input, amount should be less than 10000
        //using two of ArrayList<Integer> to record the income integer's number, and its amount

        Scanner sc = new Scanner(System.in);
        int howMany = sc.nextInt();

        //Using ArrayList<> instead of Array because the former's length is floatable,
        //that mean you dont need to define its length at start
        ArrayList<Integer> number = new ArrayList<>();
        ArrayList<Integer> amount = new ArrayList<>();

        for (int i=0;i<howMany;i++){
            int got = sc.nextInt();

            if (number.contains(got)){

                int index = number.indexOf(got);
                amount.add(index, amount.get(index)+1);
                //second line check the number's index that got from  first line, then adds one count at the place of index in amount<>

            }else{

                number.add(got);
                amount.add(1);
                //make a room for new index in amount<>

            }

        }

        for (int k=0;k < number.size();k++){
            for (int p=0;p < number.size()-k-1;p++){
                //do bubble sort
                if (number.get(p) > number.get(p+1)){

                    int temp = number.get(p);
                    number.set(p, number.get(p+1));
                    number.set(p+1, temp);
                    //change the position inside both number<> and amount<>

                    temp = amount.get(p);
                    amount.set(p, amount.get(p+1));
                    amount.set(p+1, temp);

                }

                else{
                    //do nothing, just ignore it
                }

            }
        }

        for (int c=0;c < number.size();c++){
            System.out.println("Number " +  number.get(c) + " shows up " + amount.get(c) + " times!");
        }

        //Be notified to prevent for using for-each loop at here unless you really know how to use that, or you might encounter IndexOutOfBounds Exception...

    }
}
