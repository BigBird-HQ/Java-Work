package phonebookApp;

import java.util.ArrayList;
import java.util.List;

public class Phonebook {
    private List<Contact> contacts = new ArrayList<>();
    private String fullName;

    public int getTotalNumberOfContacts() {
        return contacts.size();
    }

    public Contact createContact(String firstName, String lastName, String phoneNumber, String email) {
        String fullName = firstName +" "+ lastName;
        Contact contact = new Contact(fullName, phoneNumber, email);
        contacts.add(contact);
        contacts.size();
        return contact;
    }

    public Contact findContactByName(String fullName) {
        for (Contact contact : contacts) {
            if (contact.getFullName().equals(fullName)) {
                return contact;
            }
        }

                throw new IllegalArgumentException("Contact Not Found");
    }

    public void deleteContact(String fullName) {
        contacts.remove(findContactByName(fullName));
    }

    public void updateContact(String firstNameLastName, String myFirstNameMyLastName, String myPhoneNumber, String myEmail) {
        Contact updatedContact = findContactByName(firstNameLastName);
        updatedContact.setFullName(myFirstNameMyLastName);
        updatedContact.setPhoneNumber(myPhoneNumber);
        updatedContact.setEmail(myEmail);
    }

//    public void updateContact(String fullName, String phoneNumber, String email) {
//        Contact updatedContact = findContactByName(fullName);
//        updatedContact.setFullName("fullName1");
//        updatedContact.setPhoneNumber("updatedPhoneNumber");
//        updatedContact.setEmail("updatedEmail");
//    }

//    public Contact displayContact(String fullName, String phoneNumber, String email) {
//
//    }
}
