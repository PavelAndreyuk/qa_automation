package animals.herbivore;

import animals.Size;
import animals.interfaces.Swim;

public class Fish extends Herbivore implements Swim {
    private Size size = Size.SMALL;

    public Fish() {
    }

    public Fish(String name) {
        this.name = name;
    }

    @Override
    public Size getSize() {
        return this.size;
    }


    public void swim() {
        System.out.println("fish swims");
        hungryPoints--;
    }
}
