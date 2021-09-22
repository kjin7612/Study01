package study01;

import java.util.Arrays;

public class RotateArrayT02 {
    public void rotate(int[] nums, int k){
        k = k % nums.length;
//        k = k % nums.length;
//        reverse(nums, 0, nums.length - 1);
//        reverse(nums, 0,  k - 1);
//        reverse(nums, k, nums.length - 1);
    }

    public void reverseLogic(int[] nums, int i, int j){
        while (i < j){
            int temp = nums[i];
            nums[j] = nums[i];
            nums[i] = temp;
            i++;
            j--;
        }
    }


//    public void reverse(int[] nums, int i, int j){
//        while (i < j){
//            int temp = nums[i];
//            nums[i] = nums[j];
//            nums[j] = temp;
//            i++;
//            j--;
//        }
//    }

    public static void main(String[] args) {
        RotateArrayT02 ra = new RotateArrayT02();
        int[] arr = {1,2,3,4,5,6,7};
        int a = 3;
        ra.rotate(arr, a);
    }
}
