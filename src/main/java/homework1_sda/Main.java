package homework1_sda;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cow mucka = new Cow();
        Cat kicia = new Cat();
        Dog burek = new Dog();

        List<Animal> listOfAnimal = new ArrayList<>();
        listOfAnimal.add(mucka);
        listOfAnimal.add(kicia);
        listOfAnimal.add(burek);

        for (Animal animals: listOfAnimal){
            System.out.println(animals.makeSound());
        }
    }

}
