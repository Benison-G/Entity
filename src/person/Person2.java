package person;

import java.util.Date;

import person_utility.Address;

/**
 * @author bg049380
 * Stores information regarding a person.
 * Uses parameterized constructor (Initializes the class members during instantiation)
 */
public class Person2 {
    /**
    * @param name The text representing name of the person.
    * @param gender The text representing gender of the person.
    * @param dateOfBirth The date of birth of the person.
    * @param address The text representing the address of the person.
    */
    public Person2(String name, String gender, Date dateOfBirth, Address address) {
    	super();
    	this.name = name;
        this.gender = gender;
    	this.dateOfBirth = dateOfBirth;
    	this.address = address;
    }

    private String name;
    private String gender;
    private Date dateOfBirth;
    private Address address;
}
