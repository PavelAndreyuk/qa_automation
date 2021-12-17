package animals.herbivore;

import animals.interfaces.Fly;
import animals.interfaces.Swim;
import animals.interfaces.Voice;

public class Duck extends Herbivore implements Swim, Fly, Voice {
    private String name;
    private int hungryPoints = 5;

    public Duck() {
    }

    public Duck(String name) {
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
        System.out.println("duck swimming");
        hungryPoints--;
    }

    public void swim() {
        System.out.println("duck swims");
        hungryPoints--;
    }

    public String voice() {
        return "*duck noises*";
    }
}
