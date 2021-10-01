package algorithm.internalSort;

import java.util.Arrays;

public class SelectionSortWhile {
    public int[] sort(int[] arr){
        int i = 0;

        while (i < arr.length){
            int j = 0;
            while (j < arr.length){
                if(arr[i] < arr[j]){
                    swap(arr, i, j);
                }
                j++;
            }
            i++;
        }
        return arr;
    }

    private void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] input = {20, 40, 10, 15, 10, 50, 60, 100, 5, 12};
        SelectionSortWhile ss = new SelectionSortWhile();
//        ss.sort(input);
        System.out.println(Arrays.toString(ss.sort(input)));
    }
}
