package com.codecool.SimpleRESTAPI.CustomerREST.model;

import java.util.Objects;

public class Adress {
    private final String city;
    private final String street;
    private final String zipCode;

    public Adress(String city, String street, String zipCode) {
        this.city = city;
        this.street = street;
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getZipCode() {
        return zipCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Adress adress = (Adress) o;
        return Objects.equals(city, adress.city) &&
                Objects.equals(street, adress.street) &&
                Objects.equals(zipCode, adress.zipCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, street, zipCode);
    }
}
