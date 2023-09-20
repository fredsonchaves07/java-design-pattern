package padroes.criacao.abstractfactory.factories;

import padroes.criacao.abstractfactory.customer.Customer;
import padroes.criacao.abstractfactory.customer.EnterpriseCustomer;
import padroes.criacao.abstractfactory.vehicle.EnterpriseCar;
import padroes.criacao.abstractfactory.vehicle.Vehicle;

public class EnterpriseCustomerVehicleFactory implements CustomerVehicleFactory {

    @Override
    public Customer createCustomer(String customerName) {
        return new EnterpriseCustomer(customerName);
    }

    @Override
    public Vehicle createVehicle(String vehicleName, Customer customer) {
        return new EnterpriseCar(vehicleName, customer);
    }
}
