import java.util.ArrayList;
import java.util.List;

import ClassDyr.Dyr.*;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Misse", 3, 4, new String[]{"Sort", "Hvid"}, 4.5f);
        Dog dog1 = new Dog("Fido", 5, 4, new String[]{"Brun"}, 25.0f);
        Bird bird1 = new Bird("Tweety", 2, 2, new String[]{"Gul"}, 0.5f);
        Fish fish1 = new Fish("Nemo", 1, 0, new String[]{"Orange"}, 0.2f);

        List<Animal> animals = new ArrayList<>();

        animals.add(dog1);
        animals.add(cat1);
        animals.add(bird1);
        animals.add(fish1);

        for (Animal a : animals) {
            System.out.println("\n" + a.getName() + " info:");
            System.out.println(a);
            a.makeSound();
            a.activity();
            a.eat();
            a.sleep();

        }
    }
}
