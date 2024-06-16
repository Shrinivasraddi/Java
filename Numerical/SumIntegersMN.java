package basics.Numerical;

import java.util.Scanner;

//sum of all integers from 1 to m that are multiples of n
public class SumIntegersMN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number n:");
        int n= sc.nextInt();
        System.out.println("enter the number m:");
        int m= sc.nextInt();
        SumIntegersMN r=new SumIntegersMN();
        int result= r.differenceOfSum(n,m);
        System.out.println(result);
    }
    public int differenceOfSum(int n,int m){
        int msum=0,nsum=0;
        for (int i=1;i<=m;i++){
            if (i%n == 0)
                nsum+=i;
            else
                msum+=i;
        }
        return (msum-nsum);
    }
}
