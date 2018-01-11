package models;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Guest on 1/11/18.
 */
public class AddressBookTest {
    @Test
    public void address_addressBookInstantiatesCorrectly_String() throws Exception {
        Address newAddress = new Address();
        AddressBook addressBook = new AddressBook("Harold", "Bernstein", newAddress, "555-555-5555");
        assertEquals(true, addressBook instanceof AddressBook);
    }

}