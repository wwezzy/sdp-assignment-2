package kz.aitu.sdp.abstractfactory;

public interface VehiclePartsFactory {

    Engine createEngine();

    Tire createTire();
}