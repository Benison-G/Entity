package person;
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
    private Name name;
    private Gender gender;
    private Date dateOfBirth;
    private Address address;

    /**
     * @param firstName The first name of the person.
     */
    public void setName(String name) {
    	this.name = name;
    }

    /**
     * @return The first name of the person.
     */
    public void getName(String name) {
        return name;
    }
    
    /**
     * @param gender The gender of the person.
     */
    public void setGender(Gender gender) {
    	this.gender = gender;
    }

    /**
     * @return The gender of the person.
     */
    public Gender getGender() {
    	return gender;
    }
    
    /**
     * @param dateOfBirth The date of birth of the person.
     */
    public void setDateOfBirth(Date dateOfBirth) {
    	this.dateOfBirth = dateOfBirth;
    }

    /**
     * @return The date of birth of the person.
     */
    public Date getDateOfBirth() {
    	return dateOfBirth;
    }
    
    /**
     * @param address The address of the person.
     */
    public void setAddress(Address address) {
    	this.address = address;
    }
    
    /**
     * @return The address of the person.
     */
    public Address getAddress() {
    	return address;
    }
}
