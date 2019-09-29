package CPE_Java;

import java.util.Scanner;

public class sp4_determineWhoComesFirst {
    public static void main(String[] args){
        //example input 10/04/1998  01/07/1998 (day/month/year)
        //example output BEFORE (compare A with B)

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        String result;

        String[] arr1 = A.split("/");
        String[] arr2 = B.split("/");

        int yearA = Integer.parseInt(arr1[2]);
        int yearB = Integer.parseInt(arr2[2]);

        if (yearA > yearB){
            outtaHere("AFTER");
        }else if (yearA < yearB){
            outtaHere("BEFORE");
        }else{
            int monthA = Integer.parseInt(arr1[1]);
            int monthB = Integer.parseInt(arr2[1]);

            if (monthA > monthB){
                outtaHere("AFTER");
            }else if (monthA < monthB){
                outtaHere("BEFORE");
            }else{

                int dayA = Integer.parseInt(arr1[0]);
                int dayB = Integer.parseInt(arr2[0]);

                if (dayA > dayB){
                    outtaHere("AFTER");
                }else if (dayA < dayB){
                    outtaHere("BEFORE");
                }else{
                    outtaHere("SAME");
                }
            }
        }

    }

    private static void outtaHere(String str){
        System.out.println(str);
        System.exit(0);
    }

}
