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
            while(head != null){
                current = current.next;
            }
            current.next = newContact;
        }
    }


    public void findContact(String name)throws IllegalAccessException {
        PhonebookNode current = head;
        Contact currentContact = head.getContact();
        String contactName = currentContact.getName();
        while(!contactName.equalsIgnoreCase(name)){
            if(current == null){
                throw new IllegalAccessException("There is no person in the phonebook with that name");
            }
            current = current.next;
        }

        System.out.println(currentContact.toString());
    }


    

}
