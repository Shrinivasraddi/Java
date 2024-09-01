package basics.Numerical;

import java.util.Scanner;

public class GreaterthanPreviousElements {
    // 8.Find the count of elements whose value is greater than all of its prior elements
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n= sc.nextInt();
        int[] a= new int[n];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int sum=0;
        for (int i=n-1;i>-1;i--) {
            int count = 0;
            for (int j = n - 2; j > -1; j--) {

                if (a[i] > a[j])
                    count++;
            }
            if (count==i)
                sum+=1;
        }
        System.out.println(sum+1);
    }

}
