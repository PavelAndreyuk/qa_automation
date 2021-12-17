package animals.herbivore;

import animals.Size;
import animals.interfaces.Swim;

public class Fish extends Herbivore implements Swim {
    private Size size = Size.SMALL;

    public Fish() {
    }

    public Fish(String name) {
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

    public void swim() {
        System.out.println("fish swims");
        hungryPoints--;
    }
}
