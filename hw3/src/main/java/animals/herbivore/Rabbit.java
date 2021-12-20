package animals.herbivore;

import animals.Size;
import animals.interfaces.Run;

public class Rabbit extends Herbivore implements Run {
    private Size size = Size.EXTRA_SMALL;

    public Rabbit() {
    }

    public Rabbit(String name) {
        this.name = name;
    }

    @Override
    public Size getSize() {
        return this.size;
    }

    public void run() {
        System.out.println("rabbit running");
        hungryPoints--;
    }
}
