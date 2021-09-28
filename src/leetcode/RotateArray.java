package leetcode;

import java.util.Arrays;

public class RotateArray {
    public void rotate(int[] nums, int k){
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length - 1);

        System.out.println(Arrays.toString(nums));
    }

    public void reverse(int nums[], int i, int j){
        while (i < j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
//    public void rotate(int[] nums, int k) {
//        int[] arrRight = new int[nums.length - k]; // 7 - 3 = 4
//        int[] arrLeft = new int[k];
////        [5,6,7,   1,2,3,4]
//        // 이동한 후의 왼쪽 배열 만들기 3-6
//        for (int i = 0; i < arrRight.length; i++) {
//            arrRight[i] = nums[i];
//        }
//        System.out.println("Right: " + Arrays.toString(arrRight));
//
//        // 오른쪽 배열 0-2
//        int temp = 0;
//        for (int i = arrRight.length; i < nums.length; i++) {
//            arrLeft[temp] = nums[i];
//            temp++;
//        }
//        System.out.println("Left: " + Arrays.toString(arrLeft));
//
//        System.arraycopy(arrLeft, 0, nums, 0, arrLeft.length);
//        System.arraycopy(arrRight, 0, nums, arrLeft.length, arrRight.length);
//
//        System.out.println(Arrays.toString(nums));
//
//    }

    public static void main(String[] args) {
        RotateArray ra = new RotateArray();
        int[] arr = {1,2,3,4,5,6,7};
        int a = 3;
        ra.rotate(arr, a);
    }
}
