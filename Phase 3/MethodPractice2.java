import java.util.Scanner;

public class MethodPractice2 {
    public static void main (String[] args){
        int user_total;
        int i;
        double[] user_num;
        Scanner scnr = new Scanner(System.in);

        System.out.println("How many numbers do you want to enter? ");
        user_total = scnr.nextInt();

        user_num = new double[user_total];

        for (i = 0; i < user_total; i++){
        System.out.println("Please enter your number: ");
        user_num[i] = scnr.nextDouble();
    }

        double avg = average(user_num);
        System.out.println("Average: " + avg);
    
        scnr.close();
        }

    public static double average(double[] arr){
        double average = 0;
        double sum = 0;
        int i;
        
        for(i = 0; i < arr.length; i++){
            sum+= arr[i];
        }

        average = sum/arr.length;

        return average;
    }

}
