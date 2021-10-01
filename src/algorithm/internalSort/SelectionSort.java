package algorithm.internalSort;

import java.util.Arrays;

public class SelectionSort {

    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public int[] sort(int[] input){
        // 순차 탐색
        for (int i = 0; i < input.length + 1; i++) {

            // 최소 값 탐색
            for (int j = i; j < input.length; j++) {
                int minIdx = j;
//                System.out.println("검색 비교값: " + input[i] + ", 현재 최소값: " + input[minIdx] + ", 현재 비교값(j): " + input[j]);
                if(input[minIdx] < input[i]){
                    minIdx = j;
//                    System.out.println("변경 minIndex: " + input[j]);
                    swap(input, i, j);
                    System.out.println("i번째 검색: " + i + ", 배열: " + Arrays.toString(input));
                }
            }
                System.out.println("======================================= End");
        }

        System.out.println(Arrays.toString(input));

        return input;
    }

    public static void main(String[] args) {
        int[] input = {20, 40, 10, 15, 10, 50, 60, 100, 5, 12};
        SelectionSort ss = new SelectionSort();
        ss.sort(input);
    }
}
