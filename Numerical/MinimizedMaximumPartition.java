package basics.Numerical;
import java.util.*;
public class MinimizedMaximumPartition {
//  6.StephanDemonPower
    public static void main(String[] args){
    int[] ar = {0,9,3,5,1,2};
    int s=0,d=0;
    Arrays.sort(ar);
    int n= ar.length-1;
    for (int i : ar) d = d + i;
    while(s<d){
        d=d-ar[n];
        s=s+ar[n];
        n--;
    }
    System.out.println("Stephan Power= " +s);
    System.out.println("Demon Power= " +d);
}
}
