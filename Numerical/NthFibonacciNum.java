package basics.Numerical;

import java.util.*;

public class NthFibonacciNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index of Fibonacci series:");
        int n=sc.nextInt();
        NthFibonacciNum r= new NthFibonacciNum();
        System.out.println(r.findNthNum(n));
    }
    public int findNthNum(int n){
        if (n==0)
            return 0;
        else if (n == 1 || n == 2)
            return 1;
        else
            return findNthNum(n-1)+findNthNum(n-2);
    }
}
