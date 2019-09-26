package com.codecool.SimpleRESTAPI.CustomerREST.model;

import java.util.Objects;

public class Customer {
    private final int id;
    private final String name;
    private final Adress customerAdress;

    public Customer(int id, String name, Adress adress){
        this.id = id;
        this.name = name;
        customerAdress = adress;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Adress getCustomerAdress() {
        return customerAdress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id &&
                Objects.equals(name, customer.name) &&
                Objects.equals(customerAdress, customer.customerAdress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, customerAdress);
    }
}
