// Andrew Soozay
// 7/23/24
// Phonebook
// PhonebookNode.java

// PhonebookNode.java creates a node of a contact that can be added to a phonebook
// ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
public class PhonebookNode {
    Contact contact;
    PhonebookNode next;

    // method: PhonebookNode (no return type)
    // purpose: creates the PhonebookNode object
    // parameters:  (1) contact (Contact): contact tied to the node
    public PhonebookNode(Contact contact){
        this.contact = contact;
        this.next = null;
    }


    // method: getContact (Contact)
    // purpose: returns the contact for the node
    // parameters: none
    public Contact getContact(){
        return contact;
    }
}
