package basics.Patterns;
import java.util.*;
public class Butterfly {
        public static void main(String[] args) {
            int n;
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the number:");
            n=sc.nextInt();
            int sp= 2*n-1;
            int st=0;
            for (int i = 1;i<=2*n-1;i++){
                if (i<=n){
                    sp=sp-2;
                    st++;
                }
                else {
                    sp = sp+2;
                    st--;
                }
                for (int j=1;j<=st;j++)
                    System.out.print("* ");

                for (int k=1;k<=sp;k++)
                    System.out.print("  ");

                for (int l=1;l<=st;l++){
                    if (l != n)
                        System.out.print("* ");
                }
                System.out.println();
            }

        }
    }
