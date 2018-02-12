/**
 * Name
 */
public class Name {
    private String firstName;
    private String middleName;
    private String lastName;

    public Name(firstName, middleName, lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }
    
    public void setFirstname(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstname() {
        return firstName;
    }

    public void setMiddlename(String middleName) {
        this.middleName = middleName;
    }

    public String getMiddlename() {
        return middleName;
    }

    public void setLastname(String lastName) {
        this.lastName = lastName;
    }

    public String getLastname() {
        return lastName;
    }
}