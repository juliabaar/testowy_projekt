package homework3_sda_OPP;


import java.util.ArrayList;
import java.util.List;

// // Utwórz tablicę kotów, dodaj do niej parę utworzonych obiektów i dla wszystkich wywołaj
////metodę makeSound.
// 5. Utwórz tablicę zwierząt, dodaj do niej parę utworzonych obiektów typu Cat oraz Dog i dla
//wszystkich wywołaj metodę makeSound.
public class Main {
    public static void main(String[] args) {

    Cat mufi = new Cat("Mufasa");
    Cat nala = new Cat("Nala");
    Dog pies1 = new Dog("Tramp");
    Dog pies2 = new Dog("Lady");
    Vet vet = new Vet();

    List<Object> listOfObjects = new ArrayList<>();
    listOfObjects.add(mufi.makeSound());
    listOfObjects.add(nala.makeSound());
    listOfObjects.add(pies1.makeSound());
    listOfObjects.add(pies2.makeSound());

    for (int i = 0; i < listOfObjects.size(); i++){
            System.out.println(listOfObjects.get(i));
        }

    vet.sayHello(mufi);
    vet.sayHello(pies1);




    }

    }

