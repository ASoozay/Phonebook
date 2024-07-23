public class Contact {
    private String firstName;
    private String lastName;
    private String fullName;
    private String phoneNumber;
    private String email;
    private String address;
    private String city;

    public Contact(String firstName, String lastName, String phoneNumber, String email, String address, String city){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber= phoneNumber;
        this.email = email;
        this.address = address;
        this.city = city;
        fullName = firstName + " " + lastName;
    }

    public void setFirstName(String newFirstName){
        firstName = newFirstName;
        setFullName();
    }


    public String getFirstName(){
        return firstName;
    }



    public void setLastName(String newLastName){
        lastName = newLastName;
        setFullName();
    }

    
    public String getLastName(){
        return lastName;
    }


    public void setFullName(){
        fullName = firstName + " " + lastName;
    }


    public String getFullName(){
        return fullName;
    }


    public void setPhoneNumber(String newPhoneNumber){
        phoneNumber = newPhoneNumber;
    }


    public String getPhoneNumber(){
        return phoneNumber;
    }


    public void setEmail(String newEmail){
        email = newEmail;
    }


    public String getEmail(){
        return email;
    }


    public void setAddress(String newAddress){
        address = newAddress;
    }


    public String getAddress(){
        return address;
    }


    public void setCity(String newCity){
        city = newCity;
    }


    public String getCity(){
        return city;
    }


    public String toString(){
        return String.format("Name:  %s%nPhone Number: %s%nEmail: %s%nAddress: %s%nCity: %s", fullName, phoneNumber, email, address, city);
    }

}
