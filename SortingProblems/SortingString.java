package basics.SortingProblems;

public class SortingString {
    public static void main(String[] args) {
        String str="Reva University";
        char arr[]=str.toCharArray();
        int i=0;
        while (i<arr.length)
        {
            int j=i+1;
            while(j<arr.length) {
                if (arr[j] < arr[i]) {
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j = j + 1;
            }
            i=i+1;
        }
        System.out.println(arr);
    }
}

