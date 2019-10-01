package CPE_Java;


import java.util.Arrays;
import java.util.Scanner;


public class sp8_WhosTheSmallestOne {
    public static void main(String[] args){
        //tips : use Math.abs(Int) to get the absolute value of specified integer
        //tips 2nd: scanning them one by one, then make them become absolute before doing compare
        //Users input random five integer, then make any random two of them multiplied, try to figure out which of the multiplied ABSOLUTE value is the smallest one
        Scanner sc = new Scanner (System.in);
        int arr[] = new int[5];

        for (int i=0;i<5;i++)   arr[i] = Math.abs(sc.nextInt());

        Arrays.sort(arr);

        int result = arr[0] * arr[1];

        System.out.println("The smallest of their result is " + result);

    }
}
