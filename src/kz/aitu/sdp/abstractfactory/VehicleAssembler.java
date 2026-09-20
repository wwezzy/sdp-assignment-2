package kz.aitu.sdp.abstractfactory;

public class VehicleAssembler {

    private final Engine engine;
    private final Tire tire;

    public VehicleAssembler(VehiclePartsFactory factory) {
        this.engine = factory.createEngine();
        this.tire = factory.createTire();
    }

    public void assemble() {
        engine.start();
        tire.rotate();
    }
}