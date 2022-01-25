package animals.herbivore;

import animals.Size;
import animals.interfaces.Swim;

public class Fish extends Herbivore implements Swim {

    public Fish() {
        size = Size.SMALL;
    }

    public Fish(String name) {
        this.name = name;
        size = Size.SMALL;
    }

    public void swim() {
        System.out.println("fish swims");
        hungryPoints--;
    }
}
