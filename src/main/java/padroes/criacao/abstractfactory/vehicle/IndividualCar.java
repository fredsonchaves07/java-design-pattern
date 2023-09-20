package padroes.criacao.abstractfactory.vehicle;

import padroes.criacao.abstractfactory.customer.Customer;

public class IndividualCar extends Vehicle {

    public IndividualCar(String name, Customer customer) {
        super(name, customer);
    }

    @Override
    public void pickUp() {
        System.out.println(this.name + " está buscando " + this.customer);
    }
}
