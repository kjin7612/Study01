package leetcode;

import java.util.Arrays;

/**
 * Input: nums = [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 */
public class MoveZero {
    public void moveZeroes(int[] nums) {
        int cntZero = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0){
                cntZero++;
            }
        }
        int arrNoneZero[] = new int[nums.length - cntZero];

        int temp = 0;
        int tempNum = 0;
        int end = nums.length;
        for (int i = 0; i <= nums.length -1; i++) {
            if(nums[i] != 0){
                arrNoneZero[temp] = nums[i];
                temp++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if(i < arrNoneZero.length){
                nums[i] = arrNoneZero[i];
            }else{
                nums[i] = 0;
            }
        }

        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int nums[] = {0,1,0,3,12};
        MoveZero mz = new MoveZero();

        mz.moveZeroes(nums);
    }
}
