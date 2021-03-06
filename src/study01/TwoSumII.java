package study01;

import java.util.Arrays;

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
            for (int j = 0; j < numbers.length; j++) {
                if(i != j && numbers[i] + numbers[j] == target){
                    System.out.println("i: " + Arrays.asList(numbers[i]) + ", j: " + Arrays.asList(numbers[j]));
                    rtnArr[0] = i + 1;
                    rtnArr[1] = j + 1;
                    System.out.println(Arrays.toString(rtnArr));
                    return rtnArr;
                }
//                if(numbers[j] == 2){
//                    System.out.println(Arrays.asList(numbers[i]));
//                    System.out.println(i);
//                }
            }
        }

        return rtnArr;
    }

    public static void main(String[] args) {
        TwoSumII ts = new TwoSumII();
//        int[] numbers = {2, 7, 11, 15};
        int[] numbers = {0, 0, 3, 4};
        int target = 0;

        ts.twoSum(numbers, target);

    }
}
