package models;

/**
 * Created by Guest on 1/11/18.
 */
public class AddressBook {
    private String first;
    private String last;
    private Address address;
    private String number;
    public AddressBook(String first, String last, Address address, String number) {
        this.first = first;
        this.last = last;
        this.address = address;
        this.number = number;
    }

    public String getFirst() {
        return this.first;
    }

    public String getLast() {
        return this.last;
    }

    public Address getAddress() {
        return this.address;
    }

    public String getNumber() {
        return this.number;
    }
}
