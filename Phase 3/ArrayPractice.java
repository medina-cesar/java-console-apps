public class ArrayPractice {
    public static void main(String[] args) {

    /** Exercise 1 - store 5 integers and print them
    int[] nums = {3, 7, 11, 2, 9};
    System.out.println(nums[0]);
    System.out.println(nums[1]);
    System.out.println(nums[2]);
    System.out.println(nums[3]);
    System.out.println(nums[4]); 
    **/

    /** Exercise 2 - sum all numbers in an array
     int sum = 0;
    int i = 0;
    int[] nums = {4, 5, 6, 3, 8};

    for (i = 0; i < nums.length; i++) {
        sum += nums[i];
    }
    System.out.println("Sum: "+ sum); 
    **/

    /** Exercise 3 - finding the largest number
    int i = 0;
    int currentNum = 0;

    int[] nums = {10, 2, 25, 3, 18};
    for (i = 0; i < nums.length; i++) {
        if (nums[i] > currentNum){
            currentNum = nums[i];
        }
    }
    System.out.printf("Largest number is: %d", currentNum);
    **/

    /** Exercise 4 - Count positives, negatives, zeros
    int i = 0;
    int posCount = 0;
    int negCount = 0;
    int zerCount = 0;
    int[] nums = {2, -5, 0, 7, -3, 0, 10};

    for (i = 0; i < nums.length; i++) {
        if (nums[i] > 0) {
            posCount ++;
        }
        else if (nums[i] == 0) {
            zerCount ++;
        }
        else {
            negCount ++;
        }
    }
    System.out.printf("\nPositives: %d", posCount);
    System.out.printf("\nNegatives: %d", negCount);
    System.out.printf("\nZeros: %d", zerCount);
    **/

    /** Exercise 5 - Reverse Print
    int i = 0;
    String[] names = {"Pat", "Silly", "Doe"};

    for (i = names.length - 1; i >= 0; i --) {
        System.out.printf("%s ", names[i]);
    }
    **/

    int i = 0;
    int count = 0;
    double total = 0;

    double[] grades = {85.5, 92.0, 78.0, 88.5, 90.0};

    for (i = 0; i < grades.length; i++){
        total += grades[i];
        count ++;
    }
    System.out.printf("Average: %.2f", total/count);
    }
}
