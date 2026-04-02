package CurrentUnderstanding;
import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        //variable dec
        Scanner scnr = new Scanner(System.in);
        String op;
        int numsToUse;
        double result;


        System.out.printf("Please enter your arithmetic operation (+, -, *, /):");
        op = scnr.next();

        switch (op) {
            //addition call
            case "+": 
            System.out.printf("How many numbers would you like to add? ");
            numsToUse = scnr.nextInt();

            result = addCalc(numsToUse, scnr);

            System.out.printf("Result: %.2f\n", result);
            break;
        
            //subtraction call
            case "-": 
            System.out.printf("How many numbers would you like to subtract? ");
            numsToUse = scnr.nextInt();

            result = subCalc(numsToUse, scnr);

            System.out.printf("Result: %.2f\n", result);
            break;

            //multiplication call
            case "*": 
            System.out.printf("How many numbers would you like to multiply? ");
            numsToUse = scnr.nextInt();

            result = multCalc(numsToUse, scnr);

            System.out.printf("Result: %.2f\n", result);
            break;

            case "/": 
            System.out.printf("How many numbers would you like to divide? ");
            numsToUse = scnr.nextInt();

            result = divCalc(numsToUse, scnr);

            System.out.printf("Result: %.2f\n", result);
            break;

        }

        scnr.close();
    }

    public static double addCalc(int numsToUse, Scanner scnr) {
        double num;
        double addResult = 0;
        int i;

        for (i = 1; i <= numsToUse; i++) {
                        System.out.printf("Enter number %d: ", i);
                        num = scnr.nextDouble();
                        addResult += num;
        }
        return addResult;
    }

    public static double subCalc(int numsToUse, Scanner scnr) {
        double num;
        double subResult = 0;
        int i;

        // reading the first number to prevent subtraction from 0
        System.out.printf("Enter number 1: ");
        subResult = scnr.nextDouble();

        // loop starts at 2 to subtract numbers from subResult
        for (i = 2; i <= numsToUse; i++) {
                        System.out.printf("Enter number %d: ", i);
                        num = scnr.nextDouble();
                        subResult -= num;
                    }
        return subResult;
    }

    public static double multCalc(int numsToUse, Scanner scnr) {
        // have to declare multResult with 1 to prevent multiplying by 0
        double num;
        double multResult = 1;
        int i;

        for (i = 1; i <= numsToUse; i++) {
                        System.out.printf("Enter number %d: ", i);
                        num = scnr.nextDouble();
                        multResult *= num;
        }
        return multResult;
    }

    public static double divCalc(int numsToUse, Scanner scnr) {
        double num;
        double divResult = 0;
        int i;

        // tweaked the sub method here to implement for division
        // reading the first number to prevent division from 0
        System.out.printf("Enter number 1: ");
        divResult = scnr.nextDouble();

        // loop starts at 2 to divide numbers from subResult
        for (i = 2; i <= numsToUse; i++) {
                        System.out.printf("Enter number %d: ", i);
                        num = scnr.nextDouble();

                        if (num == 0) {
                            System.out.printf("Cannot divide by 0. Please try again\n");
                            i--;
                            continue;
                        }

                        divResult /= num;
                    }
        return divResult;
    }

}
