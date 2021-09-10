package study01;

import java.util.Scanner;

public class Study10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();
        int arr[] = new int[n];
//        int n = 10;
//        int x = 5;
//        int arr[] = {1, 10, 4, 9, 2, 3, 8, 5, 7, 6};

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        for (int i = 0; i < n; i++) {
           if(arr[i] < x) {
               System.out.print(arr[i] + " ");
           }
        }


    }
}
