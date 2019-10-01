package CPE_Java;

import java.util.Scanner;

public class sp20_GCDandLCM {
    public static void main(String[] args){
        //Greatest Common Divisor, aka GCD. Least Common Multiple, aka LCM.
        //tips : building function gcd(int a, int b) to make your first answer
        // then be informed that you could get the answer of LCM by using following function: a*b / gcd(a,b)

        Scanner sc = new Scanner(System.in);
        int numA = sc.nextInt();
        int numB = sc.nextInt();

        do{
            //change their positions when the latter one is bigger than the former
            int temp = numA;
            numA = numB;
            numB=  temp;
        }while(numB > numA);

        System.out.println("The greatest common divisor is : " + GCD(numA,numB));
        System.out.println("Then the least common multiple is : " + ((numA * numB)/GCD(numA,numB)));

    }

    private static int GCD(int a, int b){
        if (b == 0){
            return a;
        }else{
            return GCD(b, a % b);
            //calling the same method inside itself, doing recursive
        }
    }
}
