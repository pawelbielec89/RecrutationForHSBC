package com.codecool.SimpleRESTAPI.CustomerREST.model;

import java.util.Objects;

public class Customer {
    private final int id;
    private final String name;
    private final Address customerAddress;

    public Customer(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        customerAddress = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Address getCustomerAddress() {
        return customerAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id &&
                Objects.equals(name, customer.name) &&
                Objects.equals(customerAddress, customer.customerAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, customerAddress);
    }
}
