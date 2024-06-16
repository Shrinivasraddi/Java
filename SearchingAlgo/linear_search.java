package basics.SearchingAlgo;

import java.util.Scanner;

public class linear_search {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total numbers of elements:");
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to check:");
        int key = sc.nextInt();
        int j;
        for (j = 0; j < n; j++) {
            if (key == arr[j]) {
                break;
            }
        }
        if (j == n) {
            System.out.println("Element is not found");
        }
        else {
            System.out.println("The element " + arr[j] + " is found at the index " + (j + 1));
        }
    }
}
