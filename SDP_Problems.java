package basics;

import java.util.*;
public class SDP_Problems {
    public static final int NUM_TRAINEES = 3;
    public static final int NUM_ROUNDS = 3;

    public static boolean isValidOxygenValue(int oxygen) {
        return (oxygen >= 1 && oxygen <= 100);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] oxygenLevels = new int[NUM_TRAINEES][NUM_ROUNDS];
        int[] averageOxygen = new int[NUM_TRAINEES];
        int maxAverage = 0;
        boolean unfit = true;

        System.out.println("Enter oxygen levels for each trainee for each round:");
        for (int round = 0; round < NUM_ROUNDS; round++) {
            System.out.println("Round " + (round + 1) + ":");
            for (int trainee = 0; trainee < NUM_TRAINEES; trainee++) {
                int oxygen;
                do {
                    System.out.print("Oxygen value of trainee " + (trainee + 1) + ": ");
                    oxygen = scanner.nextInt();
                    if (!isValidOxygenValue(oxygen)) {
                        System.out.println("Invalid input! Oxygen value should be between 1 and 100.");
                    }
                } while (!isValidOxygenValue(oxygen));
                oxygenLevels[trainee][round] = oxygen;
            }
        }

        for (int trainee = 0; trainee < NUM_TRAINEES; trainee++) {
            for (int round = 0; round < NUM_ROUNDS; round++) {
                averageOxygen[trainee] += oxygenLevels[trainee][round];
            }
            averageOxygen[trainee] /= NUM_ROUNDS;
            if (averageOxygen[trainee] >= 70) {
                unfit = false;
                if (averageOxygen[trainee] > maxAverage) {
                    maxAverage = averageOxygen[trainee];
                }
            }
        }

        System.out.println("OUTPUT VALUES");
        if (unfit) {
            System.out.println("All trainees are unfit.");
        } else {
            System.out.print("Trainee Number(s): ");
            for (int trainee = 0; trainee < NUM_TRAINEES; trainee++) {
                if (averageOxygen[trainee] == maxAverage) {
                    System.out.print((trainee + 1) + " ");
                }
            }
            System.out.println();
        }
    }
}

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the value of m:");
//        int m = sc.nextInt();
//        System.out.println("Enter the value of n:");
//        int n = sc.nextInt();
//        int[][] mat=new int[m][n];
//        List<Integer> even=new ArrayList<Integer>();
//        List<Integer> odd=new ArrayList<Integer>();
//        for (int i=0;i<m;i++)
//            for (int j=0;j<n;j++) {
//                mat[i][j] = sc.nextInt();
//                if(mat[i][j]%2==0)
//                    even.add(mat[i][j]);
//                else
//                    odd.add(mat[i][j]);
//            }
//        Collections.sort(even);
//        Collections.sort(odd);
//        int oddl=odd.get(odd.size()-1);
//        int evenl=even.get(even.size()-1);
//        System.out.print("Output:");
//        System.out.println(oddl+evenl);
//    }


//  1.Rat_Food_Problem
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the value of r:");
//        int r = sc.nextInt();
//        System.out.println("Enter the value of unit:");
//        int unit = sc.nextInt();
//        System.out.println("Enter the value of n");
//        int n= sc.nextInt();
//        int[] arr = new int[n];
//        for(int i=0;i<n;i++)
//            arr[i] = sc.nextInt();
//        int fa=0;
//        int fr=r*unit;
//        int j=0;
//        while(j<=n){
//            fa=fa+arr[j];
//            if(fr<=fa){
//                System.out.println("House no:"+ (j+1));
//                break;
//            }
//            j++;
//        }
//        if(j==10)
//            System.out.println("shortage");
//    }








//3.N-base notation
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter n Value...");
//        int n = sc.nextInt();
//        System.out.println("Enter num value:");
//        int num = sc.nextInt();
//        rough1 m = new rough1();
//        String res = m.dectoNBase(n,num);
//        System.out.println(res);
//    }
//    private String dectoNBase(int n,int num){
//        if (n <= 1 || n>36) {
//            return "Invalid";
//
//        }
//        StringBuilder result = new StringBuilder();
//        while (num > 0) {
//            int rem = num % n;
//            result.insert(0,getChar(rem));
//            num/=n;
//        }
//        return result.toString();
//    }
//    private char getChar(int rem){
//        if(rem>9)
//            return(char)(rem-9+64);
//        else
//            return (char) (rem+'0');
//    }



// 4.Replace char
//  public static void main(String[] args) {
//      Scanner sc = new Scanner(System.in);
//      System.out.println("Enter the String:");
//      String str= sc.nextLine();
//      str = str.toLowerCase();
//      char[] ch=str.toCharArray();
//      int length = ch.length;
//      System.out.println("Enter ch1 char");
//      char ch1 = sc.next().charAt(0);
//      System.out.println("Enter ch2 char");
//      char ch2 = sc.next().charAt(0);
//      rough1 r = new rough1();
//      String result = r.replaceChar(ch,length,ch1,ch2);
//      System.out.println(result);
//  }
//    private String replaceChar(char[] ch,int length,char ch1,char ch2){
//        for (int i=0;i<length;i++){
//            if(ch[i]==ch1)
//                ch[i]=ch2;
//            else if (ch[i]==ch2) {
//                ch[i]=ch1;
//            }
//        }
//        return new String(ch);
//    }





// 5.Vehicles
//  public static void main(String[] args){
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter vehicles:");
//    int v = sc.nextInt();
//    System.out.println("Enter Wheels:");
//    int w=sc.nextInt();
//
//    if(2>w || w%2!=0 || v>w){
//        System.out.println("INVALID INPUT...");
//    }
//    else{
//        int tw=(v*4-w)/2;
//        int fw= v-tw;
//        System.out.println("TW = "+tw+"FW = "+fw);
//    }
//}





// 9.
//public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    System.out.println("enter the numbers:");
//    int a=sc.nextInt();
//    int b=sc.nextInt();
//    int result = maxExponents(a, b);
//    System.out.println("Number with maximum exponent of 2 between " + a + " and " + b + ": " + result);
//}
//    public static int maxExponents(int a, int b) {
//        int max = a;
//        int maxe = 0;
//        for (int i = a; i <= b; i++) {
//            int exponent = 0;
//            int num = i;
//            while (num % 2 == 0) {
//                exponent++;
//                num /= 2;
//            }
//            if (exponent > maxe || (exponent == maxe && i < max)) {
//                max = i;
//                maxe = exponent;
//            }
//        }
//        return max;
//    }