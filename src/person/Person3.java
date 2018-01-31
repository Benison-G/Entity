package person;

import java.util.Date;

/**
 * @author bg049380
 * Stores information regarding person.
 * Uses inner or nested class to store the address of a person
 */
public class Person3 {
    private String name;
    private String gender;
    private Date dateOfBirth;
    
    /**
     * @author bg049380
     * Nested class to store the address.
     */
    public class Address{
    	/**
    	 * Constructor to initialize class members during instantiation
    	 * @param doorNo
    	 * @param street
    	 * @param town
    	 */
        public Address(int doorNo, String street, String town) {
			super();
			this.doorNo = doorNo;
			this.street = street;
			this.town = town;
		}
        
        int doorNo;
        String street;
        String town;
    }
}
