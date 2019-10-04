package CPE_Java;

import java.util.Scanner;
import java.util.regex.Pattern;

public class sp28_sumAllTheNumberInString {
    public static void main(String[] args){
        //Input is a complete string with few numbers included
        //Add them into a sum, then print it
        Scanner sc = new Scanner(System.in);
        Pattern regular = Pattern.compile("[0-9]+$");
        //Search "Regular Expression" to learn how to use it

        int result = 0;
        String str = sc.nextLine();
        String[] arr = str.split(" ");

        for (String s : arr){
            if (regular.matcher(s).matches())   result += Integer.parseInt(s);
        }

        System.out.println(result);
    }
}
