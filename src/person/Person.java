import java.util.Date;

/**
 * Enumeration of gender.
 */
enum Gender {
    MALE,
    FEMALE
}

/**
 * @author Benison
 * Contains information regarding person.
 */
public class Person {
    /**
     * Constructor of Person object.
     * @param firstName
     * @param lastName
     */
    public Person(String firstName, String lastName) {
    	super();
    	this.firstName = firstName;
    	this.lastName = lastName;
    	fullName = firstName +  " " + lastName;
    }

    private String firstName;
    private String lastName;
    private String fullName;

    private Gender gender;
    
    private Date dateOfBirth;
    
    private Address address;

    /**
     * @return The first name of the person.
     */
    public String getFirstName() {
    	return firstName;
	}
    
    /**
     * @param firstName The first name of the person.
     */
    public void setFirstName(String firstName) {
    	this.firstName = firstName;
    }
	
    /**
     * @return The last name of the person.
     */
    public String getLastName() {
    	return lastName;
    }
	
    /**
     * @param lastName The last name of the person.
     */
    public void setLastName(String lastName) {
    	this.lastName = lastName;
    }
	
    /**
     * @return The full name of the person.
     */
    public String getFullName() {
    	return fullName;
    }
	
    /**
     * Sets the full name of the person.
     * @param firstName The first name of the person.
     * @param lastName The last name of the person.
     */
    public void setFullName(String firstName, String lastName) {
    	this.fullName = firstName + " " + lastName;
    }
	
    /**
     * @return The gender of the person.
     */
    public Gender getGender() {
    	return gender;
    }
	
    /**
     * @param gender The gender of the person.
     */
    public void setGender(Gender gender) {
    	this.gender = gender;
    }
	
    /**
     * @return The date of birth of the person.
     */
    public Date getDateOfBirth() {
    	return dateOfBirth;
    }
	
    /**
     * @param dateOfBirth The date of birth of the person.
     */
    public void setDateOfBirth(Date dateOfBirth) {
    	this.dateOfBirth = dateOfBirth;
    }
	
    /**
     * @return The address of the person.
     */
    public Address getAddress() {
    	return address;
    }
	
    /**
     * @param address The address of the person.
     */
    public void setAddress(Address address) {
    	this.address = address;
    }
}
