package study01;

/**
 * Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= first < second <= numbers.length.
 *
 * Return the indices of the two numbers, index1 and index2, as an integer array [index1, index2] of length 2.
 *
 * The tests are generated such that there is exactly one solution. You may not use the same element twice.
 *
 * Input: numbers = [2,7,11,15], target = 9
 * Output: [1,2]
 * Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
 */

public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        int[] rtnArr = new int[2];
        for (int i = 0; i < numbers.length; i++) {
        }
        return rtnArr;
    }

    public static void main(String[] args) {
        TwoSumII ts = new TwoSumII();
        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        ts.twoSum(numbers, target);


    }
}
