package CPE_Java;

import java.util.Scanner;

public class sp4_determineWhoComesFirst {
    public static void main(String[] args) {
        //example input 10/04/1998  01/07/1998 (day/month/year)
        //example output BEFORE (compare A with B)
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] arr = str.split("/");
        str = sc.next();
        String[] another = str.split("/");


        if (!compare(arr[2],another[2])){
            if (!compare(arr[1],another[1])){
                if (!compare(arr[0],another[0])){
                    System.out.println("Same");
                    System.exit(0);
                }
            }
        }
    }

    private static void jump(String s){
        System.out.println(s);
        System.exit(0);
    }

    private static Boolean compare(String s, String s2){
        if (Integer.parseInt(s) > Integer.parseInt(s2))	{
            jump("After");
            return true;
        }
        else if (Integer.parseInt(s) < Integer.parseInt(s2)){
            jump("Before");
            return true;
        }
        else	return false;
    }

}
