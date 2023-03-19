package InterfacesBasics;

public class Organ implements MusicalInstrument {
    @Override
    public void play() {
        System.out.println("Играет орган.");
    }
}
