import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class Hourglass {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        int [][] arr = new int[6][6];

        for (int i=0; i < 6; i++){
            String[] arrRowItems = input.nextLine().split(" ");
            input.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++){
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        int csum =Integer.MIN_VALUE;
        for(int i=0;i<6;i++)
        {
            for(int j=0;j<6;j++)
            {
                if(i>1 && j>1)
                {
                    int sum=arr[i][j]+arr[i-1][j-1]+arr[i-2][j]+arr[i-2][j-1]
                            +arr[i-2][j-2]+arr[i][j-1]+arr[i][j-2];

                    if(sum>csum)
                    {
                        csum=sum;
                    }
                }
            }
        }
        System.out.print(csum);
        input.close();
    }
}



