package CPE_Java;

import java.util.Scanner;

public class SP6_CashDistributing {
    public static void main(String[] args){
        //cashes are in the amount of 1, 5, 10, 50, 100
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int mount = sc.nextInt();


        if (mount / 100 >= 1){
            arr[4] = mount / 100;
            mount %=  100;
        }

        if (mount / 50 >= 1){
            arr[3] = mount / 50;
            mount %= 50;
        }

        if (mount / 10 >= 1){
            arr[2] = mount / 10;
            mount %= 10;
        }

        if (mount / 5 >= 1){
            arr[1] = mount / 5;
            mount %= 5;
        }

        arr[0] = mount;

        for (int i=0;i<5;i++){
            switch (i){
                case 0:
                    System.out.println("In one dollar: " + arr[i]);
                    break;
                case 1:
                    System.out.println("In five dollar: " + arr[i]);
                    break;
                case 2:
                    System.out.println("In ten dollar: " + arr[i]);
                    break;
                case 3:
                    System.out.println("In fifty dollar: " + arr[i]);
                    break;
                case 4:
                    System.out.println("In hundred dollar: " + arr[i]);
            }
        }


    }
}
