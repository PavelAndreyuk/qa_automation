package animals.herbivore;

import animals.interfaces.Run;

public class Rabbit extends Herbivore implements Run {
    private String name;
    private int hungryPoints = 5;

    public Rabbit() {
    }

    public Rabbit(String name) {
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

    public void run() {
        System.out.println("rabbit running");
        hungryPoints--;
    }
}
