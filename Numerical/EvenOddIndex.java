package basics.Numerical;

import java.util.Scanner;

public class EvenOddIndex {
    public static void main(String[] args) {
        int[] a = {10, 12, 14, 7, 8,5,12};
        int count = 1;
        int n=a.length-1;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0 && a[i+1] % 2 == 0 && i==n-1) {
                System.out.println(count);
                break;
            }
            else {
                if (a[i] % 2 == 0 && a[i + 1] % 2 == 1)
                    count++;

                if (a[i] % 2 == 1 && a[i + 1] % 2 == 0)
                    count++;
            }
        }
        System.out.println(count);
    }
}
