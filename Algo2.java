public class Algo2 {
    public static void main(String[] args) {
        
        int[] nums = {-5, 2, 7, 10, 58, -7, 8, 23};

        /*
         * Find smallest and largest in given array
         */

        int largest = 0;
        int smallest = nums[0];

        for (int i = 0; i < nums.length; i++) {
            
            if(nums[i] >= largest){
                largest = nums[i];
            }
            if(nums[i] <= smallest){
                smallest = nums[i];
            }
        }
        System.out.println("Largest number is: " +largest);
        System.out.println("Smallest number is:" +smallest );
    }
}
