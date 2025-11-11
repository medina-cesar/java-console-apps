import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your arithmetic operation (+, -, *, /):");
        String op = scanner.next();

        // addition section
        if(op.equals("+")){
        System.out.println("Please enter two numbers to add:");
        double firstAdd = scanner.nextDouble();   
        double secondAdd = scanner.nextDouble();  

        double result = firstAdd + secondAdd;

        System.out.printf("Result: %f", result);
        }

        // subtraction section
        else if(op.equals("-")){
        System.out.println("Please enter two numbers to subtract:");   
        double firstSub = scanner.nextDouble();   
        double secondSub = scanner.nextDouble();  

        double result = firstSub - secondSub;
        System.out.printf("Result: %f", result);
        }

        // multiplication section
        else if(op.equals("*")){
        System.out.println("Please enter two numbers to multiply:");   
        double firstMul = scanner.nextDouble();   
        double secondMul = scanner.nextDouble();  

        double result = firstMul * secondMul;
        System.out.printf("Result: %f", result);
        }

        // division section
        else if(op.equals("/")){
        System.out.println("Please enter two numbers to divide:");   
        double firstDiv = scanner.nextDouble();   
        double secondDiv = scanner.nextDouble();  

        double result = firstDiv / secondDiv;
        System.out.printf("Result: %f", result);
        }

        // invalid entry
        System.out.println("Please restart program, and enter a valid character");
        scanner.close();
    }
}