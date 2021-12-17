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

    public String voice() {
        return "*cat noises*";
    }

    public void run() {
        System.out.println("cat running");
        hungryPoints--;
    }
}
