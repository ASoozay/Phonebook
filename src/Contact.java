public class Contact {
    private String name;
    private String phoneNumber;
    private String email;
    private String address;
    private String city;

    public Contact(String name, String phoneNumber, String email, String address, String city){
        this.name = name;
        this.phoneNumber= phoneNumber;
        this.email = email;
        this.address = address;
        this.city = city;
    }

    public String getName(){
        return name;
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
        return String.format("Name:  %s%nPhone Number: %s%nEmail: %s%nAddress: %s%nCity: %s", name, phoneNumber, email, address, city);
    }

}
