package study01;

import java.util.Arrays;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        int[] arrRight = new int[nums.length - k]; // 7 - 3 = 4
        int[] arrLeft = new int[k];
//        [5,6,7,   1,2,3,4]
        // 이동한 후의 왼쪽 배열 만들기 3-6
        for (int i = 0; i < arrRight.length; i++) {
            arrRight[i] = nums[i];
        }
        System.out.println("Right" + Arrays.toString(arrRight));

        // 오른쪽 배열 0-2
        for (int i = k; i <= arrLeft.length; i++) {
            int temp = 0;
            arrLeft[temp] = nums[i];
            temp++;
        }
        System.out.println("Left" + Arrays.toString(arrLeft));

        System.out.println(Arrays.toString(nums));

    }

    public static void main(String[] args) {
        RotateArray ra = new RotateArray();
        int[] arr = {1,2,3,4,5,6,7};
        int a = 3;
        ra.rotate(arr, a);
    }
}
