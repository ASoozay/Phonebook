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

    public String getFirstName(){
        return firstName;
    }


    public String getLastName(){
        return lastName;
    }


    public String getFullName(){
        return fullName;
    }


    public String getPhoneNumber(){
        return phoneNumber;
    }


    public String getEmail(){
        return email;
    }


    public String getAddress(){
        return address;
    }


    public String getCity(){
        return city;
    }

    public String toString(){
        return String.format("Name:  %s%nPhone Number: %s%nEmail: %s%nAddress: %s%nCity: %s", fullName, phoneNumber, email, address, city);
    }

}
