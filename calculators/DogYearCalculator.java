import java.util.Scanner; //import scanner class

public class DogYearCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //create scanner object

        System.out.println("Please enter your age: "); //prompt user
        double age = scanner.nextDouble(); //read an integer

        double result = 16 * Math.log(age) + 31;

        System.out.printf("If you were a dog, you'd feel approximately %f years old ", result);

        scanner.close();
    }
}