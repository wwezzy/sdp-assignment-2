package kz.aitu.sdp.factorymethod;

public class FactoryMethodDemo {

    public static void main(String[] args) {

        VehicleFactory twoWheelerFactory =
                new TwoWheelerFactory();

        Vehicle twoWheeler =
                twoWheelerFactory.createVehicle();

        twoWheeler.printVehicle();


        VehicleFactory fourWheelerFactory =
                new FourWheelerFactory();

        Vehicle fourWheeler =
                fourWheelerFactory.createVehicle();

        fourWheeler.printVehicle();
    }
}