import java.util.Scanner;

public class SwitchCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your arithmetic operation (+, -, *, /):");
        String op = scanner.next();

        switch (op) {
            case "+":
                System.out.println("Please enter two numbers to add:");
                double firstAdd = scanner.nextDouble();   
                double secondAdd = scanner.nextDouble();  

                double addResult = firstAdd + secondAdd;

                System.out.printf("Result: %f", addResult);
                break;

            case "-":
                System.out.println("Please enter two numbers to subtract:");   
                double firstSub = scanner.nextDouble();   
                double secondSub = scanner.nextDouble();  

                double subResult = firstSub - secondSub;
                System.out.printf("Result: %f", subResult);
                break;

            case "*":
                 System.out.println("Please enter two numbers to multiply:");   
                 double firstMul = scanner.nextDouble();   
                 double secondMul = scanner.nextDouble();  

                 double mulResult = firstMul * secondMul;
                 System.out.printf("Result: %f", mulResult);
                 break;

            case "/":
                System.out.println("Please enter two numbers to divide:");   
                 double firstDiv = scanner.nextDouble();   
                 double secondDiv = scanner.nextDouble();  

                 double divResult = firstDiv / secondDiv;
                System.out.printf("Result: %f", divResult);
                break;

            default:
            System.out.println("Please restart program, and enter a valid character");
        }
        scanner.close();
    }
}