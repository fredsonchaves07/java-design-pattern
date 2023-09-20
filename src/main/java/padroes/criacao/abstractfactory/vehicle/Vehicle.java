package padroes.criacao.abstractfactory.vehicle;

import padroes.criacao.abstractfactory.customer.Customer;

public abstract class Vehicle {

    protected String name;

    protected Customer customer;

    public Vehicle(String name, Customer customer) {
        this.name = name;
        this.customer = customer;
    }

    public abstract void pickUp();
}
