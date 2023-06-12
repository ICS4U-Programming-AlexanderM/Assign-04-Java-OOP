/**
* This is the Ford subclass.
* Inheritance info provided by:
* https://www.w3schools.com/java/java_inheritance.asp.
*
* @author  Alexander Matheson
* @version 1.0
* @since   2023-06-10
*/
class Ford extends Vehicle {
    /**
    * Javadoc comment to fix stylechecker.
    */
    private final int _multiplier = 25;
    /**
    * Javadoc comment to fix stylechecker.
    */
    private boolean _isAvailable;

    /**
    * Constructor for this subclass.
    *
    * @param stock of vehicles available.
    */
    Ford(Stock stock) {
        this._isAvailable = stock.decreaseFord();
    }

    /**
    * Accessor method.
    *
    * @return requested variable.
    */
    public int getMultiplier() {
        return this._multiplier;
    }

    /**
    * Accessor method.
    *
    * @return requested variable.
    */
    public boolean getAvailability() {
        return this._isAvailable;
    }
}
