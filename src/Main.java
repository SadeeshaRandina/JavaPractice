import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        int sum = 0;
        int c=0;
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int [] a = new int[n];

        for (int i=0; i < n; i++){
            a[i]=input.nextInt();

        }
        for(int i = 0; i < n; i++){

            for (int j=i; j < n; j++){

                sum = 0;
                for (int k=i; k<=j; k++){
                    sum = sum + a[k];
                }
                if (sum < 0)c++;
            }
        }
        System.out.println(c);
    }
}
