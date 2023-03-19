package InterfacesBasics;

public class Guitar implements MusicalInstrument {
    @Override
    public void play() {
        System.out.println("Играет гитара.");
    }
}