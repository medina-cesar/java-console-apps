import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float total = 0;

         System.out.println("Welcome to DailyNeedsDirect Vending Machine!");
         System.out.println("|A1: Taki's      | |A2: Hot Cheetos   | |A3: Hot Fries      |");
         System.out.println("|B1: Chex Mix    | |B2: Trail Mix     | |B3: Welch's Gummies|");
         System.out.println("|C1: Voodoo Chips| |C2: Cape Cod Chips| |C3: Lay's Chips    |");

         String selection = "";
         while (!selection.equals("q")){
         System.out.println("\nPlease select what you'd like:");
         
        selection = scanner.next();

        switch (selection) {
            case "A1":
                total += 4.50;
                System.out.println("You selected Taki's! This item costs: $4.50");
                System.out.printf("Total: $%.2f", total);
                System.out.println("\nEnter q to stop selecting your items and receive your total");
                break;
            
            case "A2":
                total += 2.50;
                System.out.println("You selected Hot Cheetos! This item costs: $2.50");
                System.out.printf("Total: $%.2f", total);
                System.out.println("\nEnter q to stop selecting your items and receive your total");
                break;

            case "A3":
                total += 2.00;
                System.out.println("You selected Andy Capps, Hot Fries! Good Choice - Your total is: $2.00");
                System.out.printf("Total: $%.2f", total);
                System.out.println("\nEnter q to stop selecting your items and receive your total");
                break;
            
            case "B1":
                total += 5.00;
                System.out.println("You selected Chex Mix! Your total is: $5.00");
                System.out.printf("Total: $%.2f", total);
                System.out.println("\nEnter q to stop selecting your items and receive your total");
                break;

            case "B2":
                total += 6.50;
                System.out.println("You selected Trail Mix! Your total is: $6.50! What a RIP!");
                System.out.printf("Total: $%.2f", total);
                System.out.println("\nEnter q to stop selecting your items and receive your total");
                break;

            case "B3":
                total += 7.50;
                System.out.println("You selected Welch's Gummies! Your total is: $7.50..Anything for the gummies, I suppose");
                System.out.printf("Total: $%.2f", total);
                System.out.println("\nEnter q to stop selecting your items and receive your total");
                break;
            
            case "C1":
                total += 2.50;
                System.out.println("You selected Voodoo Chips! Your total is: $2.50");
                System.out.printf("Total: $%.2f", total);
                System.out.println("\nEnter q to stop selecting your items and receive your total");
                break;

            case "C2":
                total += 5.00;
                System.out.println("You selected Cape Cod Chips! Your total is: $5.00");
                System.out.printf("Total: $%.2f", total);
                System.out.println("\nEnter q to stop selecting your items and receive your total");
                break;
            
            case "C3":
                total += 3.50;
                System.out.println("You selected Lay's Chips! (not sure why) Your total is: $3.50");
                System.out.printf("Total: $%.2f", total);
                System.out.println("\nEnter q to stop selecting your items and receive your total");
                break;

            case "q":
                System.out.println("Thank you for choosing DailyNeedsDirect!");
                System.out.printf("Your final cost is $%.2f.", total);
                break;
            
            default:
                System.out.println("Invalid selection");
                break;
        }
    }
                
    scanner.close();
    }
}
