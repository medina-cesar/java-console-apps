import java.util.Scanner; //import scanner class

public class DogYearCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //create scanner object

        System.out.println("Please enter your age: "); //prompt user
        int age = scanner.nextInt(); //read an integer

        System.out.printf("You are roughly %d in dog years", age*7);

        scanner.close();
    }
}