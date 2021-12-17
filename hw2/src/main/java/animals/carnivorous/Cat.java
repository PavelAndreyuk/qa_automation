package animals.carnivorous;

import animals.interfaces.Run;
import animals.interfaces.Voice;

public class Cat extends Carnivorous implements Run, Voice {
    private String name;
    private int hungryPoints = 5;

    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public int getHungryPoints() {
        return hungryPoints;
    }

    @Override
    public void setHungryPoints(int hungryPoints) {
        this.hungryPoints = hungryPoints;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
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
