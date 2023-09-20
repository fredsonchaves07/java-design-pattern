package padroes.criacao.abstractfactory.factories;

import padroes.criacao.abstractfactory.customer.Customer;
import padroes.criacao.abstractfactory.customer.IndividualCustomer;
import padroes.criacao.abstractfactory.vehicle.IndividualCar;
import padroes.criacao.abstractfactory.vehicle.Vehicle;

public class IndividualCustomerVehicleFactory implements CustomerVehicleFactory {

    @Override
    public Customer createCustomer(String customerName) {
        return new IndividualCustomer(customerName);
    }

    @Override
    public Vehicle createVehicle(String vehicleName, Customer customer) {
        return new IndividualCar(vehicleName, customer);
    }
}
