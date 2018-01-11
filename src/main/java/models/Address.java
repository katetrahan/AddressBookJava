package models;


import java.util.ArrayList;

public class Address {
    private String street;
    private String city;
    private String state;
    private String country;
    private String zip;
    private int addressId;
//    private static ArrayList<Address> instances;

    public Address(String street, String city, String state, String country, String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.country = country;
        this.zip = zip;
//        instances.add(this);
//        this.addressId = instances.size();
    }


    public String getStreet() {
        return this.street;
    }

    public String getCity() {
        return this.city;
    }

    public String getState() {
        return this.state;
    }

    public String getCountry() {
        return this.country;
    }

    public String getZip() {
        return this.zip;
    }

}
