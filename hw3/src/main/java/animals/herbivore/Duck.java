package animals.herbivore;

import animals.Size;
import animals.interfaces.Fly;
import animals.interfaces.Swim;
import animals.interfaces.Voice;

public class Duck extends Herbivore implements Swim, Fly, Voice {

    public Duck() {
        size = Size.SMALL;
    }

    public Duck(String name) {
        this.name = name;
        size = Size.SMALL;
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
