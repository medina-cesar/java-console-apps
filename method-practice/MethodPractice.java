public class MethodPractice {
    public static void main (String[] args) {
        
        int[] nums = {4, 6, 1, 9, 10};

        int result = sumArray(nums);

        System.out.println("Sum is: " + result);
    }


    // method: returns the sum of all elements in an array
    public static int sumArray(int[] nums) {
        int sum = 0;
        int i = 0;

        for (i = 0; i < nums.length; i++){
            sum+= nums[i];
        }
        return sum;
    }
}