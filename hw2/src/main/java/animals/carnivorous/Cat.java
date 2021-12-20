package animals.carnivorous;

import animals.interfaces.Run;
import animals.interfaces.Voice;

public class Cat extends Carnivorous implements Run, Voice {
    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }

    public String voice() {
        return "*cat noises*";
    }

    public void run() {
        System.out.println("cat running");
        hungryPoints--;
    }
}
