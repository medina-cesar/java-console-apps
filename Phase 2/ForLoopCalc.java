import java.util.Scanner;

public class ForLoopCalc {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String op = "";
        while (!op.equals("q")){
        System.out.println("Please enter your arithmetic operation (+, -, *, /):");
        System.out.println("Or, enter q to quit");
        op = scanner.next();
        
        switch (op) {
            case "+":
                
                System.out.println("How many numbers would you like to add? ");
                int addCount = scanner.nextInt();

                double addResult = 0;
                    for (int i = 1; i <= addCount; i++) {
                        System.out.println("Enter number " + i + ":");
                        double num = scanner.nextDouble();
                        addResult += num;
                    }

                System.out.printf("Result: %f\n", addResult);
                break;

            case "-":
                System.out.println("How many numbers would you like to subtract? ");   
                int subCount = scanner.nextInt();

                System.out.println("Enter number 1: ");   
                double subResult = scanner.nextDouble();

                    for (int i = 2; i <= subCount; i++) {
                        System.out.println("Enter number " + i + ":");
                        double num = scanner.nextDouble();
                        subResult -= num;
                    }
                
                System.out.printf("Result: %f\n", subResult);    
                break;

            case "*":
                 System.out.println("How many numbers would you like to multiply:");   
                 int mulCount = scanner.nextInt();
                 double mulResult = 1;

                 for (int i = 1; i <= mulCount; i++) {
                        System.out.println("Enter number " + i + ":");
                        double num = scanner.nextDouble();
                        mulResult *= num;
                    }

                System.out.printf("Result: %f\n", mulResult);
                
                 break;

            case "/":
                System.out.println("Please enter two numbers to divide:");   
                 double firstDiv = scanner.nextDouble();   
                 double secondDiv = scanner.nextDouble();  

                 double divResult = firstDiv / secondDiv;
                System.out.printf("Result: %f\n", divResult);
                break;

            default:
            System.out.println("Thank you for using my calculator!");
                }
            }
        scanner.close();
            }
        }
    
