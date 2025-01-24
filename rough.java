
package basics;
public class rough {
    public static void main(String[] args) {
        String s= "refer";
        rough r = new rough();
        System.out.println(r.checkPallindrome(s));


    }
    public Boolean checkPallindrome(String s){
        int n= s.length();
        int temp=n-1;
        for( int i=0;i<n/2;i++){
            if(s.charAt(i)==s.charAt(temp)){
                temp--;
                continue;
            }
        else
            return false;
        }
        return true;
    }
}









































//package basics;
//import java.util.*;
//
//public class rough {
//    public static void main(String[] args) {
//        char[][] table = [['a','b','c'],
//        ['d','e','f'],
//        ['g','h','i'],
//        ['m','n','o'],
//        ['p','q','r']];
//        rough r= new rough();
//        r.solutions(char[][]);
//    }
//    char [][] solutions(char [][] table) {
//        int j=0;
//       int [][] arr = new int [5][3];
//        for(int i=0;i<3;i++){
//            for (int j=0;j<3;j++){
//                arr[i][j]=odd(char[][],j)
//            }
//        }
//        public int odd(char [][],int j){
//            for (int i=1;i<6;i+=2){
//                 return char[i][j];
//            }
//        }
//        public int even(char [][],int j){
//            for (int i=0;i<6;i+=2){
//                return char[i][j];
//            }
//        }
//    }
//    }
//