package basics.Numerical;

import java.util.ArrayList;
import java.util.Scanner;
public class BinarySubP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Binary String:");
        String s = sc.nextLine();
        int n= s.length();
        ArrayList<Integer> l=new ArrayList<>();
        for (int i=0;i<n;i++)
            if (s.charAt(i)=='1')
                l.add(i);
        for (int i=0;i<l.size();i++)
            for (int j=i+1;j<l.size();j++){
                int start= l.get(i);
                int end = l.get(j);
                System.out.println(s.substring(start,end+1));
            }
    }
}


//    Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the Binary String:");
//                String s = sc.nextLine();
//                int n= s.length();
//                for (int i=0;i<n;i++)
//        if (s.charAt(i) == '1' && i < n - 1)
//        for (int j = i + 1; j < n; j++) {
//        boolean flag=false;
//        if (s.charAt(j) == '1')
//        for (int k = i; k <= j; k++) {
//        System.out.print(s.charAt(k));
//        flag=true;
//        }
//        if (flag) System.out.println();
//        }