package phonebookAppTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import phonebookApp.Contact;
import phonebookApp.Phonebook;

import static org.junit.jupiter.api.Assertions.*;

public class PhonebookTest {
    private Phonebook phonebook;
    @BeforeEach
    public void setUp() {
        phonebook = new Phonebook();
    }
    @Test
    public void phonebookIsEmptyAtCreation_isEmptyTest() {
        assertEquals(0, phonebook.getTotalNumberOfContacts());
    }
    @Test
    public void contactCanBeCreatedInPhone_createContactTest() {
        assertEquals(0, phonebook.getTotalNumberOfContacts());
        phonebook.createContact("name", "lastName", "phoneNumber", "email");
        assertEquals(1, phonebook.getTotalNumberOfContacts());
    }
    @Test
    public void moreThanOneContactCanBeCreatedInPhonebook_createContactTest() {
        assertEquals(0, phonebook.getTotalNumberOfContacts());
        phonebook.createContact("name", "lastName", "phoneNumber", "email");
        phonebook.createContact("name", "lastName", "phoneNumber", "email");
        assertEquals(2, phonebook.getTotalNumberOfContacts());
    }
    @Test
    public void contactCanBeFoundInPhonebook_FindContactByFirstNameTest() {
        assertEquals(0, phonebook.getTotalNumberOfContacts());
        phonebook.createContact("firstName", "lastName", "phoneNumber", "email");
        phonebook.createContact("firstName1", "lastName1", "phoneNumber1", "email1");
        assertEquals(2, phonebook.getTotalNumberOfContacts());
        Contact found = phonebook.findContactByName("firstName lastName");
        assertEquals(phonebook.findContactByName("firstName lastName"), found);
    }
    @Test
    public void unregisteredContactCannotBeFoundInPhonebook_ThrowExceptionTest() {
        assertEquals(0, phonebook.getTotalNumberOfContacts());
        phonebook.createContact("firstName", "lastName", "phoneNumber", "email");
        assertEquals(1, phonebook.getTotalNumberOfContacts());
        assertThrows(IllegalArgumentException.class, ()->phonebook.findContactByName("fullName1"));

    }
    @Test
    public void contactCanBeDeletedInPhonebook_deleteContactTest() {
        assertEquals(0, phonebook.getTotalNumberOfContacts());
        phonebook.createContact("firstName", "lastName", "phoneNumber", "email");
        phonebook.createContact("firstName1", "lastName1", "phoneNumber1", "email1");
        assertEquals(2, phonebook.getTotalNumberOfContacts());
        phonebook.deleteContact("firstName lastName");
        assertEquals(1, phonebook.getTotalNumberOfContacts());
    }
    @Test
    public void contactInPhonebookCanBeUpdated_updateContactTest() {
        assertEquals(0, phonebook.getTotalNumberOfContacts());
        phonebook.createContact("firstName", "lastName", "phoneNumber", "email");
        //phonebook.createContact("firstName1", "lastName1", "phoneNumber1", "email1");
        assertEquals(1, phonebook.getTotalNumberOfContacts());
        phonebook.updateContact("firstName lastName", "myFirstName myLastName", "myPhoneNumber", "myEmail");
        assertEquals(phonebook.findContactByName("myFirstName myLastName").getPhoneNumber(),"myPhoneNumber");
        //assertEquals(phonebook.findContactByName("firstName1 lastName1").getEmail(), "updatedEmail");
    }
    @Test
    public void PhonebookCannotUpdateUnregisteredContact_throwExceptionTest() {
        assertEquals(0, phonebook.getTotalNumberOfContacts());
        phonebook.createContact("firstName", "lastName", "phoneNumber", "email");
        phonebook.createContact("firstName1", "lastName1", "phoneNumber1", "email1");
        assertEquals(2, phonebook.getTotalNumberOfContacts());
        phonebook.updateContact("firstName lastName", "myFirstName myLastName", "myPhoneNumber", "myEmail");
        assertEquals(phonebook.findContactByName("myFirstName myLastName").getPhoneNumber(),"myPhoneNumber");
        assertEquals(phonebook.findContactByName("firstName1 lastName1").getEmail(), "email1");
        assertEquals(phonebook.findContactByName("myFirstName myLastName").getPhoneNumber(),"myPhoneNumber");
        assertThrows(IllegalArgumentException.class, ()->phonebook.findContactByName("firstName lastName2"));
    }
    @Test
    public void phonebookCanDisplayContactDetails_displayContactDetailsTest() {
        assertEquals(0, phonebook.getTotalNumberOfContacts());
        Contact display = phonebook.createContact("firstName", "lastName", "phoneNumber", "email");
        assertEquals( "firstName lastName phoneNumber email", display.toString());
    }



}
