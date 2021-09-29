package algorithm.internalSort;

public class SelectionSort {

    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public int[] sort(int[] input){
        int[] rtnArray = new int[input.length];
        int minIndex = 0;

        // 순서대로 탐색
        for (int i = 0; i < input.length - 1; i++) {
            // 최소값 탐색
            for (int j = i = 1; j < input.length; j++) {
//                if (input[j] ) {
//
//                }
            }
        }


        return rtnArray;
    }

    public static void main(String[] args) {
        int[] input = {20, 40, 10, 15, 10, 50, 60, 100, 5, 12};
        SelectionSort ss = new SelectionSort();
        ss.sort(input);
    }
}
