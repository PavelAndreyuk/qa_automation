package animals.carnivorous;

import animals.interfaces.Fly;
import animals.interfaces.Voice;

public class Eagle extends Carnivorous implements Fly, Voice {
    private String name;
    private int hungryPoints = 5;

    public Eagle() {
    }

    public Eagle(String name) {
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

    public void fly() {
        System.out.println("eagle flying");
        hungryPoints--;
    }

    public String voice() {
        return "*eagle noises*";
    }
}
