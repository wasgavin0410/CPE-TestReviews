package CPE_Java;

import java.util.Scanner;

public class sp25_changeTheFirstCharIntoUpperCase {
    public static void main(String[] args){
        //Supposed you're doing a work for changing all of the LOWERCASE at the begin of line into UPPERCASE
        //tips: using String[] with split to make the line DIVIDED, then change each of their first alphabet into Uppercase

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine().replace("\"", "");
        String[] arr = line.split("\\.");
        //IMPORTANT!! you cant just use "." as a regex, but add double "\" before "."
        //java.lang.String.split splits on regular expressions, and . in a regular expression means "any character".

        StringBuffer str = new StringBuffer();

        for (String s : arr){
            if (!s.substring(0, 1).equals(" ")) {
                str.append(s.substring(0, 1).toUpperCase());
                str.append(s.substring(1, s.length()) + ". ");
            }
            else if (s.substring(0, 1).equals(" ")){
                str.append(s.substring(1,2).toUpperCase());
                str.append(s.substring(2, s.length()) + ". ");
            }

        }

        System.out.println("\"" + str + "\"");


    }
}
