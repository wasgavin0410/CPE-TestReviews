package CPE_Java;

import java.util.Scanner;

public class sp8_CompareStrings {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            String[] arr = new String[3];

            for (int i=0;i<3;i++)   arr[i] = sc.next();

            while(arr[0].compareTo(arr[1]) < 0){

                String temp = arr[0];
                arr[0] = arr[1];
                arr[1] = temp;

                while(arr[1].compareTo(arr[2]) < 0){
                    temp = arr[1];
                    arr[1] = arr[2];
                    arr[2] = temp;
                }
            }

            for (int k=2;k>=0;k--)   System.out.println(arr[k]);
        }
}
