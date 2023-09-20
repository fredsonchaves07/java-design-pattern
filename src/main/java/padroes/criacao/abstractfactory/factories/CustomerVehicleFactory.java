package padroes.criacao.abstractfactory.factories;

import padroes.criacao.abstractfactory.customer.Customer;
import padroes.criacao.abstractfactory.vehicle.Vehicle;

public interface CustomerVehicleFactory {

    Customer createCustomer(String customerName);

    Vehicle createVehicle(String vehicleName, Customer customer);
}
