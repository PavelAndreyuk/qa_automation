package animals.carnivorous;

import animals.Size;
import animals.interfaces.Fly;
import animals.interfaces.Voice;

public class Eagle extends Carnivorous implements Fly, Voice {
    private Size size = Size.MEDIUM;

    public Eagle() {
    }

    public Eagle(String name) {
        this.name = name;
    }

    @Override
    public Size getSize() {
        return this.size;
    }

    public void fly() {
        System.out.println("eagle flying");
        hungryPoints--;
    }

    public String voice() {
        return "*eagle noises*";
    }
}
