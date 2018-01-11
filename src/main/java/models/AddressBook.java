package models;

import java.util.ArrayList;

public class AddressBook {
    private String first;
    private String last;
    private Address address;
    private String number;
    private boolean published = false;
    private static ArrayList<AddressBook> instances = new ArrayList<>();
    private int addressId;
    public AddressBook(String first, String last, Address address, String number) {
        this.first = first;
        this.last = last;
        this.address = address;
        this.number = number;
        this.published = published;
        instances.add(this);
        this.addressId = instances.size();
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

    public boolean getPublished() {
        return this.published;
    }

    public int getAddressId() {
        return this.addressId;
    }

    public static ArrayList<AddressBook> getAll() {
        return instances;
    }

    public void deleteEntry() {
        instances.remove(addressId-1);
    }

    public static void clearAll() {instances.clear();}

    public static AddressBook findById(int addressBookId){
        return instances.get(addressBookId-1); //why minus 1? See if you can figure it out.
    }

    public void edit(String first, String last, Address address, String number) {
        this.first = first;
        this.last = last;
        this.address = address;
        this.number = number;
    }

    public void setPublished() {
        this.published = true;
    }
}
