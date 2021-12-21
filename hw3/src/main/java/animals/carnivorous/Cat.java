package animals.carnivorous;

import animals.Size;
import animals.interfaces.Run;
import animals.interfaces.Voice;

public class Cat extends Carnivorous implements Run, Voice {

    public Cat() {
        size = Size.SMALL;
    }

    public Cat(String name) {
        this.name = name;
        size = Size.SMALL;
    }

    public String voice() {
        return "*cat noises*";
    }

    public void run() {
        System.out.println("cat running");
        hungryPoints--;
    }
}
