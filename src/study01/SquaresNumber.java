package study01;

import java.util.Arrays;

/**
 * 제곱 정렬
 * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
 */
public class SquaresNumber {
    public int[] sortedSquares(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            nums[i] = (int) Math.pow(nums[i], 2);   // 순환 제곱
        }
        Arrays.sort(nums);  // 정렬

        return nums;
    }

    public static void main(String[] args) {
        SquaresNumber sn = new SquaresNumber();
        int[] nums = {-4, -1, 0, 3, 10};
        System.out.println(Arrays.toString(sn.sortedSquares(nums)));
    }
}
