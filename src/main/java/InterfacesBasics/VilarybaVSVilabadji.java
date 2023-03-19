package InterfacesBasics;

import java.util.ArrayList;
import java.util.List;

/*
Вилларибо и Виллабаджо.
*/

public class VilarybaVSVilabadji {
    static List<MusicalInstrument> orchestra = new ArrayList<>();

    public static void main(String[] args) {
        createKeyboardOrchestra();
        createStringedOrchestra();
        playOrchestra();
    }

    public static void createKeyboardOrchestra() {
        //напишите тут ваш код
        orchestra.add(new Organ());
        orchestra.add(new Piano());
        orchestra.add(new Piano());
        orchestra.add(new Piano());
    }

    public static void createStringedOrchestra() {
        //напишите тут ваш код
        orchestra.add(new Violin());
        orchestra.add(new Violin());
        orchestra.add(new Guitar());
    }

    public static void playOrchestra() {
        //напишите тут ваш код
        for (Object orc: orchestra){
            if (orc instanceof MusicalInstrument){
                MusicalInstrument player = (MusicalInstrument) orc;
                player.play();
            }
        }
    }
}

