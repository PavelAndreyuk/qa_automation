package animals.herbivore;

import animals.interfaces.Swim;

public class Fish extends Herbivore implements Swim {
    public Fish() {
    }

    public Fish(String name) {
        this.name = name;
    }

    public void swim() {
        System.out.println("fish swims");
        hungryPoints--;
    }
}
