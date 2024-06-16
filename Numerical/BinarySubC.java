package basics.Numerical;

import java.util.Scanner;

public class BinarySubC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Binary String:");
        String s = sc.nextLine();
        int n= s.length();
        int count=0;
        for (int i=0;i<n;i++)
            if (s.charAt(i)=='1')
                for (int j=i+1;j<n;j++)
                    if (s.charAt(j)=='1')
                        count++;
        System.out.print("Total number of substrings are: ");
        System.out.print(count);
        }
}
