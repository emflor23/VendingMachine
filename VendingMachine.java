import java.util.Scanner;

public class VendingMachine {
    public static void main(String... args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter price of item \n" +
                "(from 25 cents to a dollar, in 5-cent increments): ");
        int price = scanner.nextInt();

        System.out.println("You bought an item for 45 cents and gave me a dollar,  \n" +
                "So your change is \n");
        int quarters = (100 - price) / 25;
        int dimes = (100 - price - 25 * quarters) / 10;
        int nickles = (100 - price - 25 * quarters - 10 * dimes) / 5;
        System.out.println(quarters + "\tquarters \n" +
                dimes + "\tdimes, and \n" +
                nickles + "\tnickels. \n");

    }
}
