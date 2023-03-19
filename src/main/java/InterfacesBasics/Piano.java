package InterfacesBasics;

public class Piano implements MusicalInstrument {
    @Override
    public void play() {
        System.out.println("Играет пианино.");
    }
}