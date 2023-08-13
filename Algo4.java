import java.util.Arrays;

public class Algo4 {
    public static void main(String[] args) {
        
        int[] nums = {10, 20, 30, 40, 50,}; //Given array


        for (int i = nums.length -1; i >= 0; i--) {
            int j = (nums.length -1) - i;

            int n1 = 0;
            if(j < i){
                n1 = nums[j];
                nums[j] = nums[i];
                nums[i] = n1;

            }else if (j==i){
                nums[j] = nums[i];
            }
            else{
                break;
            }
            //System.out.println(Arrays.toString(nums));
            
        }
        System.out.println("New Array : " + Arrays.toString(nums));
    }
}
