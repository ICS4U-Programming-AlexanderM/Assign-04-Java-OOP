/**
* This file contains the customer class.
*
* @author  Alexander Matheson
* @version 1.0
* @since   2023-06-10
*/
public class Customer {
    /**
    * Javadoc comment to fix stylechecker.
    */
    private String _firstName;
    /**
    * Javadoc comment to fix stylechecker.
    */
    private String _lastName;
    /**
    * Javadoc comment to fix stylechecker.
    */
    private long _license;
    /**
    * Javadoc comment to fix stylechecker.
    */
    private long _phone;
    /**
    * Javadoc comment to fix stylechecker.
    */
    private String _email;
    /**
    * Javadoc comment to fix stylechecker.
    */
    private String _vehicle;
    /**
    * Javadoc comment to fix stylechecker.
    */
    private int _length;
    /**
    * Javadoc comment to fix stylechecker.
    */
    private Vehicle _userVehicle;

    /**
    * Constructor to set initial values.
    *
    * @param firstName from file.
    * @param lastName from file.
    * @param license from file.
    * @param phone from file.
    * @param email from file.
    * @param vehicle from file.
    * @param length from file.
    */
    public Customer(String firstName, String lastName, long license,
        long phone, String email, String vehicle, int length) {
        this._firstName = firstName;
        this._lastName = lastName;
        this._license = license;
        this._phone = phone;
        this._email = email;
        this._vehicle = vehicle;
        this._length = length;
    }

    /**
    * Accessor method.
    *
    * @return requested variable.
    */
    public String getName() {
        return this._firstName + " " + this._lastName;
    }

    /**
    * Accessor method.
    *
    * @return requested variable.
    */
    public long getLicense() {
        return this._license;
    }

    /**
    * Accessor method.
    *
    * @return requested variable.
    */
    public long getPhone() {
        return this._phone;
    }

    /**
    * Accessor method.
    *
    * @return requested variable.
    */
    public String getEmail() {
        return this._email;
    }

    /**
    * Accessor method.
    *
    * @return requested variable.
    */
    public int getLength() {
        return this._length;
    }

    /**
    * Accessor method.
    *
    * @return requested variable.
    */
    public String getVehicle() {
        return this._vehicle;
    }
}
