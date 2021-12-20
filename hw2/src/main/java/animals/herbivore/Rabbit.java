package animals.herbivore;

import animals.interfaces.Run;

public class Rabbit extends Herbivore implements Run {
    public Rabbit() {
    }

    public Rabbit(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("rabbit running");
        hungryPoints--;
    }
}
