package animals.carnivorous;

import animals.Size;
import animals.interfaces.Run;
import animals.interfaces.Swim;
import animals.interfaces.Voice;

public class Tiger extends Carnivorous implements Run, Swim, Voice {
    private Size size = Size.LARGE;

    public Tiger() {
    }

    public Tiger(String name) {
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

    public void run() {
        System.out.println("tiger running");
        hungryPoints--;
    }

    public void swim() {
        System.out.println("tiger swims");
        hungryPoints--;
    }

    public String voice() {
        return "*tiger noises*";
    }
}
