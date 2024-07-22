public class PhonebookTest {
    public static void main(String[] args) throws IllegalAccessException{
        Contact me = new Contact("Andrew", "Sousa", "925-394-8406", "asousa2021@gmail.com", "15 Par Lane", "Bellingham");
        Contact jack = new Contact("Jack", "Borovitz", "925-640-8829", "jbor05@gmail.com", "69 skibidi way", "Tuscon");
        Contact ty = new Contact("Tyler", "Lunn", "925-739-0329", "imtyty729@gmail.com", "723 Acrorn Court", "San Ramon");
        Contact dorian = new Contact("Dorian", "Pandza", "925-669-4200", "dpandze@purdue.edu", "15 Ohio Road", "Pleasant Hill");
        Contact hannah = new Contact("Hannah", "Sousa", "925-394-8616", "hannahSousa2014@gmail.com", "3256 Estero Drive", "San Ramon");

        PhonebookList phonebook = new PhonebookList();
        phonebook.addContact(me);
        phonebook.addContact(jack);
        phonebook.addContact(ty);
        phonebook.addContact(dorian);
        phonebook.addContact(hannah);


        //phonebook.findContact("Jack Borovitz");
        //phonebook.printAll();
        //phonebook.removeContact("Hannah Sousa");
        //phonebook.printAll();


    }
}
