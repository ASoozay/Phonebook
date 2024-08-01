import javax.swing.*;
import java.awt.*;

public class PhonebookWindow {
    private JFrame frame;
    private PhonebookList phonebook;
    private Color backgroundYellow;
    private PhonebookNode head;

    public PhonebookWindow(PhonebookList phonebook) {
        this.phonebook = phonebook;
        String phonebookName = phonebook.getPhonebookName();
        backgroundYellow = new Color(255, 255, 200);

        // Set up frame
        frame = new JFrame(phonebookName);
        frame.setTitle(phonebookName);
        frame.setBounds(0, 0, 800, 600); // Set a reasonable default size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Set title panel
        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.setBackground(backgroundYellow);

        JLabel windowTitle = new JLabel(phonebookName, JLabel.CENTER);
        windowTitle.setFont(new Font("Bell Centennial", Font.BOLD, 36));
        topPanel.add(windowTitle, BorderLayout.NORTH);

        // Create panel for phonebook options
        JPanel optionPanel = new JPanel();
        optionPanel.setPreferredSize(new Dimension(600, 55)); // Set a specific preferred size
        optionPanel.setBackground(Color.GRAY);

        // create option buttons
        JButton searchContactButton = new JButton("Search Contact");
        searchContactButton.setBackground(Color.WHITE);
        searchContactButton.setFont(new Font("Bell Centennial", Font.BOLD, 24));
        searchContactButton.setFocusPainted(false);
        optionPanel.add(searchContactButton);

        JButton addContactButton = new JButton("Add Contact");
        addContactButton.setBackground(Color.WHITE);
        addContactButton.setFont(new Font("Bell Centennial", Font.BOLD, 24));
        addContactButton.setFocusPainted(false);
        optionPanel.add(addContactButton);

        JButton removeContactButton = new JButton("Remove Contact");
        removeContactButton.setBackground(Color.WHITE);
        removeContactButton.setFont(new Font("Bell Centennial", Font.BOLD, 24));
        removeContactButton.setFocusPainted(false);
        optionPanel.add(removeContactButton);

        JButton editContactButton = new JButton("Edit Contact");
        editContactButton.setBackground(Color.WHITE);
        editContactButton.setFont(new Font("Bell Centennial", Font.BOLD, 24));
        editContactButton.setFocusPainted(false);
        optionPanel.add(editContactButton);

        JButton switchBooksButton = new JButton("Transfer Contact");
        switchBooksButton.setBackground(Color.WHITE);
        switchBooksButton.setFont(new Font("Bell Centennial", Font.BOLD, 24));
        switchBooksButton.setFocusPainted(false);
        optionPanel.add(switchBooksButton);

        topPanel.add(optionPanel);

        frame.add(topPanel, BorderLayout.NORTH);

        
        // create main panel for contacts
        JPanel contactMainPanel = new JPanel();
        contactMainPanel.setBackground(backgroundYellow);
        contactMainPanel.setLayout(new BoxLayout(contactMainPanel, BoxLayout.Y_AXIS));
        printAllContacts(contactMainPanel);
        frame.add(contactMainPanel, BorderLayout.CENTER);
        

        // Set frame visibility
        frame.setVisible(true);
    }

    public void printAllContacts(JComponent contactMainPanel){
        PhonebookNode current = phonebook.getHead();
        while(current != null){
            Contact contact = current.getContact();
            String info = String.format("<html>Name: %s<br>Phone Number: %s<br>Email: %s<br>Address: %s<br>City: %s</html>", contact.getFullName(), contact.getPhoneNumber(), contact.getEmail(), contact.getAddress(), contact.getCity());
            JPanel contactPanel = new JPanel();
            contactPanel.setBackground(Color.LIGHT_GRAY);
            contactPanel.setBounds(10, 100, 800, 60);
            JLabel contactInfo = new JLabel(info);
            contactInfo.setFont(new Font("Bell Centennial", Font.BOLD, 18));
            contactPanel.add(contactInfo, BorderLayout.EAST);
            contactMainPanel.add(contactPanel, BorderLayout.AFTER_LAST_LINE);
            
            JPanel blankPanel = new JPanel();
            blankPanel.setBounds(5,5,800, 1);
            blankPanel.setBackground(backgroundYellow);
            contactMainPanel.add(blankPanel);

            current = current.next;
        }
    }
}