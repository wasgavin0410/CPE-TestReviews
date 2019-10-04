package CPE_Java;

import java.util.Scanner;

public class sp26_getTheShortestRange_OnTwoDemension {
    public static void main(String[] args){
        //The first int of input is about how many group of coordinate will be insert
        //To get the shortest range between point-to-point on 2d, you will need this function to make everything short:
        //Math.sqrt(Math.pow( (x1 - x2) , 2) + Math.pow( (y1 - y2) , 2))

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        double[] x = new double[num];
        double[] y = new double[num];

        for (int i=0;i<num;i++){
            x[i] = sc.nextDouble();
            y[i] = sc.nextDouble();
        }

        double shortest = Double.MAX_VALUE;
        //seems weird but yes initialize the "Shortest" as the "Maximum" of the Double should be have...

        for (int p = 0;p < num;p++){
            for (int k = p+1; k< num; k++){
                double got = Math.sqrt(Math.pow( x[p]-x[k] , 2) + Math.pow( y[p]-y[k] , 2));
                if (shortest > got)     shortest = got;
            }
        }

        System.out.print("The shortest path is in the range of ");
        System.out.printf("%.1f", shortest);
    }
}
