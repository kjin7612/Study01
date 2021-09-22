package study01;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RotateArrayT03 {
    public void rotate(int[] nums, int k){
        k = k % nums.length;
        reverse(nums, 0, 1);
//        reverse(nums, 1, 2);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
        System.out.println("첫번째" + Arrays.toString(nums));
    }

    public void reverse(int[] nums, int start, int change){
        while (start < change){
            int temp = nums[start];
            nums[start] = nums[change];
            nums[change] = temp;
            start++;
            change--;
        }
    }

//    public void reverse(int[] nums, int s, int e){
//        while (s < e){
//            int temp = nums[s];
//            nums[s] = nums[e];
//            nums[e] = temp;
//            s++;
//            e--;
//        }
//    }
    public static void main(String[] args) {
        RotateArrayT03 ra = new RotateArrayT03();
        int[] arr = {1,2,3,4,5,6,7};
        int a = 3;
        ra.rotate(arr, a);
    }
}
