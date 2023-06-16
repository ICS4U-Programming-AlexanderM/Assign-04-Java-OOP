import java.util.Random;

/**
* This is the vehicle class.
*
* @author  Alexander Matheson
* @version 1.0
* @since   2023-06-10
*/
public class Vehicle {
    /**
    * Javadoc comment to fix stylechecker.
    */
    private final int _baseCost = 100;
    /**
    * Javadoc comment to fix stylechecker.
    */
    private boolean _isAvailable;

    /**
    * Constructor for this class.
    */
    public Vehicle() {
        this._isAvailable = false;
    }

    /**
    * Accessor method to fix compiler error.
    *
    * @return requested variable.
    */
    public int getMultiplier() {
        return 0;
    }

    /**
    * Accessor method.
    *
    * @return requested variable.
    */
    public int getBase() {
        return this._baseCost;
    }

    /**
    * Accessor method.
    *
    * @return requested variable.
    */
    public boolean getAvailability() {
        return this._isAvailable;
    }

    /**
    * Function to randomly determine if the vehicle is damaged.
    * In a real rental system, this would be a variable that is set when the
    * vehicle is returned.
    *
    * @return if the vehicle is damaged or not.
    */
    protected boolean getDamage() {
        boolean isDamaged = false;

        // Chance of vehicle being damaged has been augmented for testing.
        final Random rand = new Random();
        final int chance = rand.nextInt(26);

        // Determine if the vehicle is damaged.
        if (chance == 1) {
            isDamaged = true;
        }
        return isDamaged;
    }
}
