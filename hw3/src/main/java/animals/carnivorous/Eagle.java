package animals.carnivorous;

import animals.Size;
import animals.interfaces.Fly;
import animals.interfaces.Voice;

public class Eagle extends Carnivorous implements Fly, Voice {

    public Eagle() {
        size = Size.MEDIUM;
    }

    public Eagle(String name) {
        this.name = name;
        size = Size.MEDIUM;
    }

    public void fly() {
        System.out.println("eagle flying");
        hungryPoints--;
    }

    public String voice() {
        return "*eagle noises*";
    }
}
