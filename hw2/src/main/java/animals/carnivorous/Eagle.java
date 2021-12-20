package animals.carnivorous;

import animals.interfaces.Fly;
import animals.interfaces.Voice;

public class Eagle extends Carnivorous implements Fly, Voice {
    public Eagle() {
    }

    public Eagle(String name) {
        this.name = name;
    }

    public void fly() {
        System.out.println("eagle flying");
        hungryPoints--;
    }

    public String voice() {
        return "*eagle noises*";
    }
}
