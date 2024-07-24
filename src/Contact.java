// Andrew Soozay
// 7/23/24
// Phonebook
// Contact.java

// Contact.java is a class for a Contact object. Contact contains information for a entry to a phonebook, such as
// first name, last name, full name, phonenumber, email, address, and city.
// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

public class Contact {
    private String firstName;
    private String lastName;
    private String fullName;
    private String phoneNumber;
    private String email;
    private String address;
    private String city;


    // method: Contact (no return type)
    // purpose: constructs the Contact object
    // parameters:  (1) firstName (String): contact's first name
    //              (2) lastName (String): contact's last name
    //              (3) phoneNumber (String): contacts's phone number
    //              (4) email (String): contacts's email
    //              (5) address (String): contact's address
    //              (6) city (String): contact's city
    public Contact(String firstName, String lastName, String phoneNumber, String email, String address, String city){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber= phoneNumber;
        this.email = email;
        this.address = address;
        this.city = city;
        fullName = firstName + " " + lastName;
    }


    // method: setFirstName (void)
    // purpose: sets the contact's first name
    // parameters:  (1) newFirstName (String): new first name for the contact
    public void setFirstName(String newFirstName){
        firstName = newFirstName;
        setFullName();
    }


    // method: getFirstName (String)
    // purpose: returns the contact's first name
    // parameters: none
    public String getFirstName(){
        return firstName;
    }


    // method: setLastName (void)
    // purpose: sets the contact's last name
    // parameters:  (1) newLastName (String): new last name for the contact
    public void setLastName(String newLastName){
        lastName = newLastName;
        setFullName();
    }


    // method: getLastName (String)
    // purpose: returns the contact's last name
    // parameters: none    
    public String getLastName(){
        return lastName;
    }


    // method: setFullName (void)
    // purpose: creates and sets the contact's full name (first + last)
    // parameters: none
    public void setFullName(){
        fullName = firstName + " " + lastName;
    }


    // method: getFullName (String)
    // purpose: returns the contact's full name
    // parameters: none 
    public String getFullName(){
        return fullName;
    }

    // method: setPhoneNumber (void)
    // purpose: sets the contact's phone number
    // parameters:  (1) newPhoneNumber (String): new phone number for the contact
    public void setPhoneNumber(String newPhoneNumber){
        phoneNumber = newPhoneNumber;
    }


    // method: getPhoneNumber (String)
    // purpose: returns the contact's phone number
    // parameters: none     
    public String getPhoneNumber(){
        return phoneNumber;
    }


    // method: setEmail (void)
    // purpose: sets the contact's email
    // parameters:  (1) newEmail (String): new email for the contact
    public void setEmail(String newEmail){
        email = newEmail;
    }


    // method: getEmail (String)
    // purpose: returns the contact's email
    // parameters: none 
    public String getEmail(){
        return email;
    }


    // method: setAddress (void)
    // purpose: sets the contact's address
    // parameters:  (1) newAddress (String): new address for the contact
    public void setAddress(String newAddress){
        address = newAddress;
    }


    // method: getAddress (String)
    // purpose: returns the contact's address
    // parameters: none 
    public String getAddress(){
        return address;
    }


    // method: setCity (void)
    // purpose: sets the contact's city
    // parameters:  (1) newCity (String): new city for the contact
    public void setCity(String newCity){
        city = newCity;
    }


    // method: getCity (String)
    // purpose: returns the contact's city
    // parameters: none 
    public String getCity(){
        return city;
    }


    // method: toString (String)
    // purpose: creates a single string with contact info and returns it
    // parameters: none
    public String toString(){
        return String.format("Name:  %s%nPhone Number: %s%nEmail: %s%nAddress: %s%nCity: %s", fullName, phoneNumber, email, address, city);
    }

}
