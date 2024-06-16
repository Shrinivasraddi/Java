package basics.Numerical;

import java.util.Scanner;

public class percentage
{
        public static void main (String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the number of subjects:");// input of number of subjects
            int n = sc.nextInt();
            int[] a = new int[n];//creation of array
            double sum=0;
            for(int i=0;i<n;i++)//for loop to intake and store the value
            {
                System.out.println("enter marks of subject "+(i+1));
                a[i]=sc.nextInt();
                sum+=a[i];
            }
            double p=(sum/(n*100))*100;//calculating the sum of all subjects
            System.out.println("The basics.Numerical.percentage is "+p+"%");
        }
    }
