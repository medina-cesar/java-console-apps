public class MethodPractice3 {   
    public static void main (String[] args){
    int[] nums = {432, 2000, 543, 2};

    int max = max_finder(nums);

    System.out.println("Max number " +max);
    
}

public static int max_finder(int[] nums) {
    int i;
    //int max = 0;
    int current_num = 0;

    for(i = 0; i < nums[i]; i++){
        if(current_num < nums[i]){
            current_num = nums[i];
        }

    }

    return current_num;
}

}