package temp;

public class Temp01 {
//    public static void main(String[] args) {
//        int[] nums = {-1,0,3,5,9,12};
//        int target = 9;
//
//        for (int i = 0; i < nums.length; i++) {
//
//        }
//    }
    public static void main(String[] args) {
//        int[] nums = {-1,0,3,5,9,12};
//        int target = 9;
        int[] nums = {1,3,5,6};
//        int target = 2;
        int target = 7;

        for (int i = 0; i < nums.length; i++) {
            if(target <= nums[i]){
                System.out.println(i);
                return;
            }else if(target > nums[i]){
                System.out.println(i + 1);
                return;
            }
        }

    }
}
