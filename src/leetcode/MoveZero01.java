package leetcode;

/**
 * Input: nums = [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 *
 * Time Complexity: O(n)
 * Space Complexity:O(1)
 */
public class MoveZero01 {
    public void moveZeroes(int[] nums) {
        int j = 0;
        for (int num: nums) {
            if(nums[num] != 0){
                nums[j] = num;
                j++;
            }
        }
        for (int i = j; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        int nums[] = {0,1,0,3,12};
        MoveZero01 mz = new MoveZero01();

        mz.moveZeroes(nums);
    }
}
