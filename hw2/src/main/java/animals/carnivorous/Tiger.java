package animals.carnivorous;

import animals.interfaces.Run;
import animals.interfaces.Swim;
import animals.interfaces.Voice;

public class Tiger extends Carnivorous implements Run, Swim, Voice {
    public Tiger() {
    }

    public Tiger(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("tiger running");
        this.hungryPoints--;
    }

    public void swim() {
        System.out.println("tiger swims");
        hungryPoints--;
    }

    public String voice() {
        return "*tiger noises*";
    }
}
