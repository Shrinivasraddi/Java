package basics.Numerical;
import java.util.*;
public class prime_num_eroth{
    public static void main(String[] args){
        int []a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range:");
        int n = sc.nextInt();
        a = new int[n];
        for (int i=0;i<n;i++){
            a[i]=i+1;
        }
        for(int i=1;i<n;i++){
            if(a[i]!=0)
                for (int j=i+a[i];j<n;j+=a[i])
                    a[j]=0;
        }
        System.out.println();
        System.out.println("Prime numbers below "+ n + " are:-");
        for (int i=0;i<n;i++){
            if (a[i]!=0)
                if (a[i]>1)
                    System.out.print(a[i]+"\t");
        }
    }
}