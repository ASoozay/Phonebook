import java.util.*;

public class PhonebookList {
    PhonebookNode head;

    public PhonebookList(){
        this.head = null;
    }

    
    public void addContact(Contact contact){
        PhonebookNode newContact = new PhonebookNode(contact);
        if(head == null){
            head = newContact;
        } else {
            PhonebookNode current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newContact;
        }
        sortContacts();
    }


    public void findContact(String name) throws IllegalAccessException {
        PhonebookNode current = head;

        while (current != null) {
            Contact currentContact = current.getContact();
            String contactName = currentContact.getFullName();
            if (contactName.equalsIgnoreCase(name)) {
                System.out.println(currentContact.toString());
                return; 
            }
            current = current.next;
        }

        throw new IllegalAccessException("There is no person in the phonebook with that name");
    }


    public void removeContact(String name){
        List<Contact> contactList = new ArrayList<>();
        PhonebookNode current = head;

        while(current != null){
            contactList.add(current.getContact());
            current = current.next;
        }

        int index = 0;
        Contact nextContactList = contactList.get(index);
        String fullName = nextContactList.getFullName();
        while(!fullName.equalsIgnoreCase(name)){
            index++;
            nextContactList = contactList.get(index);
            fullName = nextContactList.getFullName();
        }
        contactList.remove(index);

        head = null;
        PhonebookNode currentContact = null;
        for(Contact contact : contactList){
            PhonebookNode nextContact = new PhonebookNode(contact);
            if(head == null){
                head = nextContact;
            } else {
                currentContact.next = nextContact;
            }
            currentContact = nextContact;

        }
    }


    public void editContact(String name) throws IllegalAccessException{
        findContact(name);

        Scanner console = new Scanner(System.in);
        PhonebookNode current = head;
        Contact currentContact = current.getContact();
        String currentFullName = currentContact.getFullName();

        while(!currentFullName.equalsIgnoreCase(name)){
            current = current.next;
            currentContact = current.getContact();
            currentFullName = currentContact.getFullName();
        }
        System.out.println();
        System.out.print("What would you like to edit? Type the section to change it, or type \"Exit\" to leave (ex. type \"First Name \" to edit first name): ");
        String choice = console.nextLine();
        while(!choice.equalsIgnoreCase("Exit")){
            editAction(choice, currentContact, console);
            System.out.print("What else would you like to edit? Type the section to change it, or type \"Exit\" to leave (ex. type \"First Name \" to edit first name): ");
            choice = console.nextLine();
        }
        sortContacts();

    }


    public void editAction(String choice, Contact currentContact, Scanner console){
        if(choice.equalsIgnoreCase("First Name")){
            System.out.print("Enter new first name: ");
            String newFirstName = console.nextLine();
            currentContact.setFirstName(newFirstName);
            System.out.println("First name updated to " + newFirstName + ".");
        } else if(choice.equalsIgnoreCase("Last Name")){
            System.out.print("Enter new last name: ");
            String newLastName = console.nextLine();
            currentContact.setLastName(newLastName);
            System.out.println("Last name updated to " + newLastName + ".");
        } else if(choice.equalsIgnoreCase("Phone Number")){
            System.out.print("Enter new Phone Number: ");
            String newPhoneNumber = console.nextLine();
            System.out.println("Phone number updated to " + newPhoneNumber + ".");
            currentContact.setPhoneNumber(newPhoneNumber);
        } else if(choice.equalsIgnoreCase("Email")){
            System.out.print("Enter new email: ");
            String newEmail = console.nextLine();
            currentContact.setEmail(newEmail);
            System.out.println("Email updated to " + newEmail + ".");
        } else if(choice.equalsIgnoreCase("Address")){
            System.out.print("Enter new address: ");
            String newAddress = console.nextLine();
            currentContact.setAddress(newAddress);
            System.out.println("Address updated to " + newAddress + ". Don't forget to change your city if needed!");
        } else if(choice.equalsIgnoreCase("City")){
            System.out.print("Enter new city: ");
            String newCity = console.nextLine();
            currentContact.setCity(newCity);
            System.out.println("City updated to " + newCity + ". Don't forget to change your address if needed!");
        }
    }


    public void printAll(){
        PhonebookNode current = head;
        for(int i = 0; i < 80; i++){
            System.out.print("-");
        }
        System.out.println();
        System.out.println("PHONEBOOK");
        System.out.println();
        while(current != null){
            Contact currentContact = current.getContact();
            System.out.println(currentContact.toString());
            System.out.println();
            current = current.next;
        }
        for(int i = 0; i < 80; i++){
            System.out.print("-");
        }
    }


    public void sortContacts(){
        List<Contact> contactList = new ArrayList<>();
        PhonebookNode current = head;

        while(current != null){
            contactList.add(current.getContact());
            current = current.next;
        }

        Collections.sort(contactList, new Comparator<Contact>(){
            public int compare(Contact c1, Contact c2){
                String lastName1 = c1.getLastName();
                String lastName2 = c2.getLastName();

                return lastName1.compareTo(lastName2);
            }
        });

        head = null;
        PhonebookNode currentContact = null;
        for(Contact contact : contactList){
            PhonebookNode nextContact = new PhonebookNode(contact);
            if(head == null){
                head = nextContact;
            } else {
                currentContact.next = nextContact;
            }
            currentContact = nextContact;

        }
    }


    public void switchPhoneBooks(PhonebookList book1, PhonebookList book2){
        Scanner console = new Scanner(System.in);
        System.out.print("Who would you like to move?: ");
        String name = console.nextLine();

        PhonebookNode book1Current = head;
        Contact book1Contact = book1Current.getContact();
        String book1FullName = book1Contact.getFullName();
        while(!book1FullName.equalsIgnoreCase(name)){
            book1Current = book1Current.next;
            book1Contact = book1Current.getContact();
            book1FullName = book1Contact.getFullName();
        }

        book1.removeContact(name);
        book2.addContact(book1Contact);
    }

}