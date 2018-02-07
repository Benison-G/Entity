package person;

/**
 * @author Benison
 * Contains the address information.
 */
public class Address {
    /** Default constructor */
    Address() {
        super();
    }
    
    /**
     * Constructor of Address object.
     * @param doorNo The unique identifier for a door.
     * @param street The string representing street.
     * @param town The string representing the town.
     */
    public Address(int doorNo, String street, String town) {
    	super();
    	this.doorNo = doorNo;
    	this.street = street;
    	this.town = town;
    }

    private int doorNo;
    private String street;
    private String town;
    
    /**
     * @return The unique identifier for a door.
     */
    public int getDoorNo() {
    	return doorNo;
    }
	
    /**
     * @param doorNo The unique identifier for a door.
     */
    public void setDoorNo(int doorNo) {
    	this.doorNo = doorNo;
    }
	
    /**
     * @return The string representing street.
     */
    public String getStreet() {
    	return street;
    }
	
    /**
     * @param street The string representing street.
     */
    public void setStreet(String street) {
    	this.street = street;
    }
	
    /**
     * @return The string representing town.
     */
    public String getTown() {
    	return town;
    }
	
    /**
     * @param town The string representing town.
     */
    public void setTown(String town) {
    	this.town = town;
    }
}
