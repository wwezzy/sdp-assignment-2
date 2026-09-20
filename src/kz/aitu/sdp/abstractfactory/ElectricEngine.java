package kz.aitu.sdp.abstractfactory;

public class ElectricEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Electric engine started");
    }
}
