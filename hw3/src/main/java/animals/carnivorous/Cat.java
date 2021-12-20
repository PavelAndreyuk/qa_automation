package animals.carnivorous;

import animals.Size;
import animals.interfaces.Run;
import animals.interfaces.Voice;

public class Cat extends Carnivorous implements Run, Voice {
    private Size size = Size.SMALL;

    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }

    public Size getSize() {
        return this.size;
    }

    public String voice() {
        return "*cat noises*";
    }

    public void run() {
        System.out.println("cat running");
        hungryPoints--;
    }
}
