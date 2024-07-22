public class PhonebookTest {
    public static void main(String[] args) throws IllegalAccessException{
        Contact me = new Contact("Andrew Sousa", "925-394-8406", "asousa2021@gmail.com", "15 Par Lane", "Bellingham");
        PhonebookNode meNode = new PhonebookNode(me);
        PhonebookList phonebook = new PhonebookList();
        phonebook.addContact(me);
        phonebook.findContact("Andrew Sousa");
    }
}
