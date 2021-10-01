package algorithm.internalSort;

import java.util.Arrays;

public class SelectionSortFor {
    public int[] sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if(arr[j] < arr[i]){
                    swap(arr, i, j);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    private void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] input = {20, 40, 10, 15, 10, 50, 60, 100, 5, 12};
        SelectionSortFor ss = new SelectionSortFor();
        ss.sort(input);
    }
}
