/**
* This file contains the rental class.
*
* @author  Alexander Matheson
* @version 1.0
* @since   2023-06-10
*/
public class Rental {
    /**
    * Javadoc comment to fix stylechecker.
    * Constant to fix "multiple string literal" style error.
    */
    private final String otherwise = ", or: ";
    /**
    * Javadoc comment to fix stylechecker.
    */
    private final int damageCharge = 2000;
    /**
    * Javadoc comment to fix stylechecker.
    */
    private Vehicle _vehicle;
    /**
    * Javadoc comment to fix stylechecker.
    */
    private Customer _customer;

    /**
    * Constructor to set initial values.
    *
    * @param vehicle from main.
    * @param customer from main.
    */
    public Rental(Vehicle vehicle, Customer customer) {
        this._vehicle = vehicle;
        this._customer = customer;
    }

    /**
    * Calculate the cost of the rental.
    *
    * @return cost, along with additional info.
    */
    public String calculateCost() {
        final String costString;
        final int cost;

        // Check if the vehicle was damaged.
        if (this._vehicle.drive()) {
            // Add $2000 for repair fees.
            cost = this._vehicle.getBase() + (this._customer.getLength()
                * this._vehicle.getMultiplier()) + damageCharge;
            costString = "Due to repair fees, $" + cost;
        } else {
            cost = this._vehicle.getBase() + (this._customer.getLength()
                * this._vehicle.getMultiplier());
            costString = "$" + cost;
        }
        return costString;
    }

    /**
    * Print cost information.
    *
    * @return information.
    */
    public String print() {
        final String info;
        if (!this._vehicle.getAvailability()) {
            // The requested vehicle is not available.
            info = "Unfortunately, the requested vehicle is not available,"
                + " please contact " + this._customer.getName()
                + " once it becomes available. You can contact them at: "
                + this._customer.getEmail() + otherwise
                + this._customer.getPhone();
        } else {
            info = this.calculateCost() + " will be charged to "
                + this._customer.getName() + ". You can contact them at: "
                + this._customer.getEmail() + otherwise
                + this._customer.getPhone();
        }
        return info;
    }
}
