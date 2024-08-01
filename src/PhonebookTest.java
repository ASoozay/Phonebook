// Andrew Soozay
// 7/23/24
// Phonebook
// PhonebookTest.java

// PhonebookTest.java provides a space for a user to test the abilities of Phonebook. Contacts and phonebooks are already provided, and some methods to test aspects are also provided
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
import javax.swing.*;
import java.awt.*;
import java.util.*;

public class PhonebookTest {
    public static void main(String[] args) throws IllegalAccessException{
        Contact e1 = new Contact("Entry", "One", "111-111-1111", "entry1@gmail.com", "01 Citizen Way", "City One");
        Contact e2 = new Contact ("Entry", "Two", "222-222-2222", "entry2@gmail.com", "02 Citizen Way", "City One");
        Contact e3 = new Contact ("Entry", "Three", "333-333-3333", "entry3@gmail.com", "03 Citizen Way", "City One");
        Contact e4 = new Contact("Entry", "Four", "444-444-4444", "entry4@gmail.com", "04 Citizen Way", "City Two");
        Contact e5 = new Contact ("Entry", "Five", "555-555-5555", "entry5@gmail.com", "05 Citizen Way", "City Two");
        Contact e6 = new Contact ("Entry", "Six", "666-666-6666", "entry6@gmail.com", "06 Citizen Way", "City Two");

        PhonebookList cityOne = new PhonebookList("CITY ONE PHONEBOOK");
        cityOne.addContact(e1);
        cityOne.addContact(e2);
        cityOne.addContact(e3);
        cityOne.addContact(e4);
        cityOne.addContact(e5);
        cityOne.addContact(e6);
        PhonebookWindow window = new PhonebookWindow(cityOne);
  

        PhonebookList cityTwo = new PhonebookList("CITY TWO PHONEBOOK");
        cityTwo.addContact(e4);
        cityTwo.addContact(e5);
        cityTwo.addContact(e6);


        // prints out two phonebooks to compare
        comparePhonebooks(cityOne, cityTwo); 

        // test for editing a contact's information
        editedContactCheck(cityOne, "Entry One");

        // test for switiching a contact among two phonebooks
        switchPhonebookCheck(cityOne, cityTwo);
 
    }

    public static void comparePhonebooks(PhonebookList pb1, PhonebookList pb2){
        pb1.printAll();
        System.out.println();
        pb2.printAll();
    }

    public static void editedContactCheck(PhonebookList phonebook, String name) throws IllegalAccessException{
        phonebook.printAll();
        System.out.println();
        phonebook.editContact(name);
        System.out.println();
        phonebook.printAll();
    }

    public static void switchPhonebookCheck(PhonebookList pb1, PhonebookList pb2){
        comparePhonebooks(pb1, pb2);
        System.out.println();
        pb1.switchPhoneBooks(pb1, pb2);
        System.out.println();
        comparePhonebooks(pb1, pb2);
    }
}
