package models;
import org.junit.Test;

import static org.junit.Assert.*;


public class AddressTest {

    @Test
    public void  address_AddressInstantiatesCorrectly_true() throws Exception {
        Address address = new Address("123 Sesame St", "New York", "New York", "USA", "10101");
        assertEquals(true, address instanceof Address);
    }

}