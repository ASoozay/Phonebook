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


    public void editContact(String name){
        
    }

    public void printAll(){
        PhonebookNode current = head;
        while(current != null){
            Contact currentContact = current.getContact();
            System.out.println(currentContact.toString());
            System.out.println();
            current = current.next;
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

}