import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
* This file contains the main class.
*
* @author  Alexander Matheson
* @version 1.0
* @since   2023-06-10
*/

public final class Main {
    /**
    * For style checker.
    *
    *
    * @exception IllegalStateException Utility class.
    * @see IllegalStateException
    */
    private Main() {
        throw new IllegalStateException("Utility class");
    }

    /**
    * Print messages.
    *
    * @param args Unused
    */
    public static void main(String[] args) {
        // Declare variables and constants, and create stock class.
        final int hondas = 3;
        final int fords = 2;
        final Stock totalStock = new Stock(fords, hondas);
        String customerInfo = "";

        try {
            // User chooses a file to get input from.
            System.out.println("Enter the name of the (csv) file to use: ");
            final Scanner line = new Scanner(System.in);
            final String inputFile = line.nextLine();
            final File input = new File(inputFile);
            final Scanner scanInput = new Scanner(input);

            // Choose (or create) a file to print output to.
            final FileWriter output = new FileWriter("output.txt");

            // Skip header line of input file.
            scanInput.nextLine();

            // Loop to read each line of input file.
            while (scanInput.hasNextLine()) {
                try {
                    // Create customer class.
                    final String[] customerArray =
                        scanInput.nextLine().split(",");
                    final Customer currentCustomer = new Customer(
                        customerArray[0], customerArray[1],
                        Long.parseLong(customerArray[2]),
                        Long.parseLong(customerArray[3]), customerArray[4],
                        customerArray[5], Integer.parseInt(customerArray[6]));

                    // Create vehicle class.
                    final Vehicle currentVehicle;
                    if (currentCustomer.getVehicle().toLowerCase()
                        .equals("ford")) {
                        currentVehicle = new Ford(totalStock);
                    } else if (currentCustomer.getVehicle()
                        .toLowerCase().equals("honda")) {
                        currentVehicle = new Honda(totalStock);
                    } else {
                        currentVehicle = new Vehicle();
                    }

                    // Create rental class.
                    final Rental currentRental = new Rental(currentVehicle,
                        currentCustomer);

                    // Print the cost of the rental.
                    customerInfo += currentRental.print() + "\n";

                    // Error checker to ensure program stability.
                } catch (NumberFormatException err) {
                    customerInfo += "Please ensure all information";
                    customerInfo += " has been entered correctly.\n";
                } catch (ArrayIndexOutOfBoundsException err) {
                    customerInfo += "Please ensure all information ";
                    customerInfo += "has been entered correctly.\n";
                }
            }

            // Print to output file.
            output.write("Greetings system admin, " + fords
                + " Ford vehicles and " + hondas
                + " Honda vehicles were available this session."
                + " Here are our charges for this session:\n" + customerInfo);

            // Close writer.
            output.close();

        } catch (IOException err) {
            // For when no input file is found.
            System.out.print("Error, the requested file was not found.");
            System.out.print(" Please ensure the file name was spelled ");
            System.out.print("correctly, and that the file has been");
            System.out.println(" placed in the correct folder.");
        }
    }
}
