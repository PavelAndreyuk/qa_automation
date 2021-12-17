package animals;

import animals.Animal;
import animals.carnivorous.Carnivorous;
import animals.herbivore.Herbivore;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Aviary<T extends Animal> {
    private Set<T> aviary = new HashSet<>();
    private Size size;

    public Aviary() {
    }

    public Aviary(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
    
    public void add(T animal) {
        if (animal.getSize().compareTo(size) == 0 || animal.getSize().compareTo(size) == -1) {
            aviary.add(animal);
        } else System.out.println("This aviary doesn't fit for this animal");
    }

    public boolean delete(T animal) {
        return aviary.remove(animal);
    }

    public Animal get(String name) {
        if (!aviary.isEmpty()) {
            Iterator<T> it = aviary.iterator();
            while (it.hasNext()) {
                Animal animal = it.next();
                if (animal.getName() == name) {
                    return animal;
                }
            }
        }
        return null;
    }

}

