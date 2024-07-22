public class PhonebookNode {
    Contact contact;
    PhonebookNode next;
    
    public PhonebookNode(Contact contact){
        this.contact = contact;
        this.next = null;
    }

    public Contact getContact(){
        return contact;
    }
}
