import java.util.Scanner;
public class FuelCosts {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //variables
        double gasInTank = 0; //in gallons
        double fuelEfficiency = 0; //in miles per gallon
        double gallonCost = 0; //in price per gallon
        double pricePer100Mi = 0;
        double distanceLeft = 0;
        boolean valid = false;//for gasInTank

        do {
            System.out.println("Enter the number of gallons in your tank.");
            if (scan.hasNextDouble()) {
                gasInTank = scan.nextDouble();
                if (gasInTank >= 0) {
                    valid = true;
                } else {
                    System.out.println("You have entered an invalid value for the cost per gallon. please try again.");
                }
            } else {
                System.out.println("You have entered an invalid value for number of gallons in your tank. please try again.");
            }
            scan.nextLine();
        } while (!valid);

        valid = false; //reset
        do {
            System.out.println("Enter fuel efficiency in miles per gallons of fuel.");
            if (scan.hasNextDouble()) {
                fuelEfficiency = scan.nextDouble();
                if (fuelEfficiency > 0) {
                    valid = true;
                } else {
                    System.out.println("You entered an invalid value for the cost per gallon. please try again.");
                }
            } else {
                System.out.println("You have entered an invalid value for the miles per gallon. please try again.");
            }
            scan.nextLine();
        } while (!valid);

        valid = false; //reset
        do {
            System.out.println("Enter the price for a gallon of gas.");
            if (scan.hasNextDouble()) {
                gallonCost = scan.nextDouble();
                if (gallonCost > 0) {
                    valid = true;
                } else {
                    System.out.println("You entered an invalid value for the cost per gallon. please try again.");
                }
            } else {
                System.out.println("You entered an invalid value for the cost per gallon. please try again.");
            }
            scan.nextLine();
        } while (!valid);

        pricePer100Mi = 100 / fuelEfficiency + gallonCost;
        distanceLeft = gasInTank * fuelEfficiency;

        System.out.printf("%-15s %10.2f\", \"Cost per 100 miles in $: \", pricePer100Mi");
        System.out.printf("\\n%-15s %10.2f\", \"Distance Left in Miles: \", distanceLeft");
    }
}