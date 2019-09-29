package CPE_Java;

import java.util.Scanner;

public class sp3_decode {
    public static void main(String[] args){
        //example input DSSOH
        //example input APPLE
        //Hint : make any char that got from input string backspace for 3, if it will encounter lower than 0,
        //make them add 23 (ASCII works well in this topic...) into char value what they supposed to be
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        str = str.toUpperCase();
        //make sure input is always in uppercase
        //Of course, you could use "Character.isUpperCase(char)" with for statement to make sure if string contain any lowercase

        for (int i=0;i<str.length();i++){
            if (str.charAt(i) >= 'D' && str.charAt(i) <= 'Z')   System.out.print((char)(str.charAt(i) - 3));
            else    System.out.print((char) (str.charAt(i) + 23));
        }
        System.out.println();


    }

}
