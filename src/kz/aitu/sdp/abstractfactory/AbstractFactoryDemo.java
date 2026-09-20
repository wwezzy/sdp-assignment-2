package kz.aitu.sdp.abstractfactory;

public class AbstractFactoryDemo {

    public static void main(String[] args) {

        VehiclePartsFactory electricFactory =
                new ElectricVehiclePartsFactory();

        VehicleAssembler electricVehicle =
                new VehicleAssembler(electricFactory);

        System.out.println("Electric vehicle:");
        electricVehicle.assemble();


        VehiclePartsFactory gasolineFactory =
                new GasolineVehiclePartsFactory();

        VehicleAssembler gasolineVehicle =
                new VehicleAssembler(gasolineFactory);

        System.out.println("\nGasoline vehicle:");
        gasolineVehicle.assemble();
    }
}