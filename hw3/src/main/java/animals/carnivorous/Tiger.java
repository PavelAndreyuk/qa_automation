package animals.carnivorous;

import animals.Size;
import animals.interfaces.Run;
import animals.interfaces.Swim;
import animals.interfaces.Voice;

public class Tiger extends Carnivorous implements Run, Swim, Voice {

    public Tiger() {
        size = Size.LARGE;
    }

    public Tiger(String name) {
        this.name = name;
        size = Size.LARGE;
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
