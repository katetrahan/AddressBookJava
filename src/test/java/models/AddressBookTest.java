package models;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by Guest on 1/11/18.
 */
public class AddressBookTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
        AddressBook.clearAll(); //I clear out allll the posts before each test.
    }


    @Test
    public void address_addressBookInstantiatesCorrectly_String() throws Exception {
        Address newAddress = new Address("123 Sesame St", "New York", "New York", "USA", "10101");
        AddressBook addressBook = new AddressBook("Harold", "Bernstein", newAddress, "555-555-5555");
        assertEquals(true, addressBook instanceof AddressBook);
    }

    @Test
    public void addressBookInstantiatesWithContent_String() throws Exception {
        Address newAddress = new Address("123 Sesame St", "New York", "New York", "USA", "10101");
        AddressBook addressBook = new AddressBook("Harold", "Bernstein", newAddress, "555-555-5555");
        assertEquals("Harold", addressBook.getFirst());

    }

    @Test
    public void addressBookGetsLastName_String() throws Exception {
        Address newAddress = new Address("123 Sesame St", "New York", "New York", "USA", "10101");
        AddressBook addressBook = new AddressBook("Harold", "Bernstein", newAddress, "555-555-5555");
        assertEquals("Bernstein", addressBook.getLast());
    }

    @Test
    public void AllEntriesAreCorrectlyReturned_true() throws Exception {
        AddressBook post = setupNewAddressBook();
        Address newAddress = new Address("123 Sesame St", "New York", "New York", "USA", "10101");
        AddressBook addressBook = new AddressBook("Harold", "Bernstein", newAddress, "555-555-5555");
        assertEquals(2, AddressBook.getAll().size());
    }

    @Test
    public void AllEntriesContainsAllEntries_true() throws Exception {
        AddressBook post = setupNewAddressBook();
        Address newAddress = new Address("123 Sesame St", "New York", "New York", "USA", "10101");
        AddressBook addressBook = new AddressBook("Harold", "Bernstein", newAddress, "555-555-5555");
        assertTrue(AddressBook.getAll().contains(post));
        assertTrue(AddressBook.getAll().contains(addressBook));
    }


    @Test
    public void entriesInstantiateWithId() throws Exception {
        AddressBook post = setupNewAddressBook();
        assertEquals(1, post.getAddressId());
    }

    @Test
    public void findReturnsCorrectEntry() throws Exception {
        AddressBook post = setupNewAddressBook();
        assertEquals(1, AddressBook.findById(post.getAddressId()).getAddressId());
    }

    @Test
    public void findReturnsCorrectEntryWhenMoreThanOnePostExists() throws Exception {
        AddressBook post = setupNewAddressBook();
        Address newAddress = new Address("123 Sesame St", "New York", "New York", "USA", "10101");
        AddressBook addressBook = new AddressBook("Harold", "Bernstein", newAddress, "555-555-5555");
        assertEquals(2, AddressBook.findById(addressBook.getAddressId()).getAddressId());
    }

    @Test
    public void updateChangesEntryContent() throws Exception {
        AddressBook post = setupNewAddressBook();
        String formerFirst = post.getFirst();
        int formerId = post.getAddressId();

        Address newAddress = new Address("123 Sesame St", "New York", "New York", "USA", "10101");
        post.edit("Poop", "Pee", newAddress, "420-555-1969");

        assertEquals(formerId, post.getAddressId());
        assertNotEquals(formerFirst, post.getFirst());
    }

    @Test
    public void deleteDeletesASpecificPost() throws Exception {
        AddressBook post = setupNewAddressBook();
        Address newAddress = new Address("123 Sesame St", "New York", "New York", "USA", "10101");
        AddressBook addressBook = new AddressBook("Harold", "Bernstein", newAddress, "555-555-5555");
        post.deleteEntry();
        assertEquals(1, AddressBook.getAll().size()); //one is left
        assertEquals(AddressBook.getAll().get(0).getAddressId(), 2); //the one that was deleted has the id of 2
    }

    public Address setupNewAddress(){
        return new Address ("123 Sesame St", "New York", "New York", "USA", "0155");
    }

    public AddressBook setupNewAddressBook(){
        return new AddressBook ("Mr.", "T", setupNewAddress(), "555-555-5555");
    }



}