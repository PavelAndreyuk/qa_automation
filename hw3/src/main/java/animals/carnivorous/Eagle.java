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
    public int getHungryPoints() {
        return hungryPoints;
    }

    @Override
    public void setHungryPoints(int hungryPoints) {
        this.hungryPoints = hungryPoints;
    }

    @Override
    public Size getSize() {
        return this.size;
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
