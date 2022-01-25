package animals.herbivore;

import animals.Size;
import animals.interfaces.Run;

public class Rabbit extends Herbivore implements Run {

    public Rabbit() {
        size = Size.EXTRA_SMALL;
    }

    public Rabbit(String name) {
        this.name = name;
        size = Size.EXTRA_SMALL;
    }

    public void run() {
        System.out.println("rabbit running");
        hungryPoints--;
    }
}
