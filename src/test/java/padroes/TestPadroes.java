package padroes;

import org.junit.jupiter.api.Test;
import padroes.criacao.abstractfactory.customer.Customer;
import padroes.criacao.abstractfactory.factories.CustomerVehicleFactory;
import padroes.criacao.abstractfactory.factories.EnterpriseCustomerVehicleFactory;
import padroes.criacao.abstractfactory.factories.IndividualCustomerVehicleFactory;
import padroes.criacao.abstractfactory.vehicle.Vehicle;
import padroes.criacao.builder.*;

public class TestPadroes {

    @Test
    public void testAbstractFactory() {
        CustomerVehicleFactory enterpriseCustomerVehicleFactory = new EnterpriseCustomerVehicleFactory();
        CustomerVehicleFactory individualCustomerVehicleFactory = new IndividualCustomerVehicleFactory();
        Customer joao = individualCustomerVehicleFactory.createCustomer("Jo�o");
        Vehicle fusca = individualCustomerVehicleFactory.createVehicle("Fusca", joao);
        Customer empresaA = enterpriseCustomerVehicleFactory.createCustomer("Empresa A");
        Vehicle hb20 = enterpriseCustomerVehicleFactory.createVehicle("HB20", empresaA);
        fusca.pickUp();
        hb20.pickUp();
    }

    @Test
    public void testBuilder() {
        AbstractMeal rice = new Rice("Arroz", 5);
        AbstractMeal beans = new Beans("Feijão", 10);
        MealBox mealBox = new MealBox();
        mealBox.add(rice);
        mealBox.add(beans);

    }
}
