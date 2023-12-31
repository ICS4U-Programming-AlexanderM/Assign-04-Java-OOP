/**
* This file contains the stock class.
*
* @author  Alexander Matheson
* @version 1.0
* @since   2023-06-10
*/
public class Stock {
    /**
    * Javadoc comment to fix stylechecker.
    */
    private int _total_ford;
    /**
    * Javadoc comment to fix stylechecker.
    */
    private int _total_honda;

    /**
    * Constructor to set initial values.
    *
    * @param totalFord from main.
    * @param totalHonda from main.
    */
    public Stock(int totalFord, int totalHonda) {
        this._total_ford = totalFord;
        this._total_honda = totalHonda;
    }

    /**
    * Decrease the Ford stock by one and check availability.
    *
    * @return availability.
    */
    public boolean decreaseFord() {
        boolean isAvailable = true;
        if (this._total_ford - 1 < 0) {
            // Ford is not in stock.
            isAvailable = false;
        } else {
            // Decrease stock by one.
            this._total_ford -= 1;
        }
        return isAvailable;
    }

    /**
    * Decrease the Honda stock by one and check availability.
    *
    * @return availability.
    */
    public boolean decreaseHonda() {
        boolean isAvailable = true;
        if (this._total_honda - 1 < 0) {
            // Honda is not in stock.
            isAvailable = false;
        } else {
            // Decrease stock by one.
            this._total_honda -= 1;
        }
        return isAvailable;
    }
}
