package CPE_Java;

import java.util.Scanner;

public class sp19_decimalConvertedIntoBinary {
    public static void main(String[] args){
        //tips : you could use function Integer.parseInt( Input Binary String , 2) to make a quick resolve
        //however, you might need this code once your homework / examination denies for using following function....
        Scanner sc = new Scanner(System.in);
        int bin = sc.nextInt();
        int result = 0, loopTime = 1;

        while(bin > 0){
            int got;

            if (bin % 10 == 1 || bin % 10 == 0){
                got = bin % 10;
                bin /= 10;
                result += got * loopTime;
                loopTime *= 2;
            }else{
                System.out.println("Input contains illegal number which was not in BINARY!");
                return;
            }

        }

        System.out.println("Final answer is : " + result);
    }
}
