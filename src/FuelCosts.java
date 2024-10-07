import java.util.Scanner;
public class FuelCosts {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //variables
        double gasInTank = 0; //in gallons
        double fuelEfficiency = 0; //in miles per gallon
        double ; //in gas per gallon
        boolean valid = false;//for gasInTank

        do {
            System.out.println("Enter the number of gallons in your tank.");
            if (scan.hasNextDouble()) {
                gasInTank = scan.nextDouble();
                if (gasInTank >= 0) {
                    valid = true;
                } else {
                    System.out.println("You have entered an invalid value for number of gallons in your tank. please try again. ");
                }
            }
            scan.nextLine();
        } while (!valid);


        do {
            System.out.println("Enter fuel efficiency in how many miles driven with one gallon of fuel.");
            if (scan.hasNextDouble()) {
                fuelEfficiency = scan.nextDouble();
                if (fuelEfficiency <= 0) {
                    valid = true;
                } else {
                    System.out.println("You");
                }
            }
        } while (!valid);


        do {

        } while ();
    }
}