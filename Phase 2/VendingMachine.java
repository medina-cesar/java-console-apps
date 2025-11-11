import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         System.out.println("Welcome to DailyNeedsDirect Vending Machine!");
         System.out.println("|A1: Taki's      | |A2: Hot Cheetos   | |A3: Hot Fries      |");
         System.out.println("|B1: Chex Mix    | |B2: Trail Mix     | |B3: Welch's Gummies|");
         System.out.println("|C1: Voodoo Chips| |C2: Cape Cod Chips| |C3: Lay's Chips    |");

         System.out.println("\nPlease select what you'd like:");
    
        String selection = scanner.next();

        switch (selection) {
            case "A1":
                System.out.println("You selected Taki's! Your total is: $4.50\nThank you for choosing DailyNeedsDirect!");
                break;
            
            case "A2":
                System.out.println("You selected Hot Cheetos! Your total is: $2.50\nThank you for choosing DailyNeedsDirect!");
                break;

            case "A3":
                System.out.println("You selected Andy Capps, Hot Fries! Good Choice - Your total is: $2.00\nThank you for choosing DailyNeedsDirect!");
                break;
            
            case "B1":
                System.out.println("You selected Chex Mix! Your total is: $5.00\nThank you for choosing DailyNeedsDirect!");
                break;

            case "B2":
                System.out.println("You selected Trail Mix! Your total is: $6.50! What a RIP!\nThank you for choosing DailyNeedsDirect!");
                break;

            case "B3":
                System.out.println("You selected Welch's Gummies! Your total is: $7.50..Anything for the gummies, I suppose\nThank you for choosing DailyNeedsDirect!");
                break;
            
            case "C1":
                System.out.println("You selected Voodoo Chips! Your total is: $2.50\nThank you for choosing DailyNeedsDirect!");
                break;

            case "C2":
                System.out.println("You selected Cape Cod Chips! Your total is: $5.00\nThank you for choosing DailyNeedsDirect!");
                break;
            
            case "C3":
                System.out.println("You selected Lay's Chips! (not sure why) Your total is: $3.50\nThank you for choosing DailyNeedsDirect!");
                break;
            
            default:
                System.out.println("Invalid Selection...Please start again.\nThank you for choosing DailyNeedsDirect!");
                break;
        }
    scanner.close();
    }
}
