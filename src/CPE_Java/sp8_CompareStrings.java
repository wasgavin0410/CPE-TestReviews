package CPE_Java;

import java.util.Scanner;

public class sp8_CompareStrings {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            String[] arr = new String[3];

            for (int i=0;i<3;i++)   arr[i] = sc.next();

            for (int p = 0;p < arr.length;p++){
                for (int k=0;k < arr.length -p - 1;k++){
                    if (arr[k].compareTo(arr[k+1]) > 0){
                        String temp = arr[k];
                        arr[k] = arr[k+1];
                        arr[k+1] = temp;
                    }
                }
            }

            for (String s : arr)   System.out.println(s);
        }
}
