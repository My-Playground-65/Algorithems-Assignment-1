import java.util.Arrays;

public class Algo3 {
    public static void main(String[] args) {
        
        int[] nums = {10, 20, 30, 40, 50}; //Given array

        //Declare a new array
        int[] nums1 = new int[nums.length];

        for (int i = nums.length -1; i >= 0; i--) {
            nums1[(nums.length -1) - i] = nums[i];
        }
        System.out.println("New Array : " + Arrays.toString(nums1));

        //Assign nums memeory lacation to new array nums1
        nums = nums1;
        System.out.println("New nums Array : "+ Arrays.toString(nums));

        //Check both arrays memeory locations
        System.out.println(nums);
        System.out.println(nums1);

    }
}
