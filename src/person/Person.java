package person;

import java.util.Date;

enum Gender {
    MALE,
    FEMALE
}

/**
 * @author Benison
 * Contains information regarding person.
 */
public class Person {
    private String firstName;
    private String lastName;
    private String fullName;

    private Gender gender;
    
    private Date dateOfBirth;
    
    private Address address;

    Person (){}
    Person (String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        fullName = firstName + " " + lastName;
    }
}
