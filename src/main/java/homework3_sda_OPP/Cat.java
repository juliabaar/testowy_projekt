package homework3_sda_OPP;
// Napisz klasę Cat, która w konstruktorze przyjmować będzie imię kota. Klasa powinna
//posiadać metodę makeSound, która wypisywać będzie imię kota oraz wydawany przez niego
//dźwięk.

import java.util.ArrayList;
import java.util.List;

public class Cat implements Animals, Movable {

    private String name;
    private int mouse;
    private List<String> listOfCats = new ArrayList<>();

    public Cat(){

    }

    public Cat(String imie) {
        this.name = imie;
    }

    @Override
    public String makeSound() {
        return name + " Miau";
    }

    public void eatMouse() { //3.
        mouse++;
        System.out.println("Cat ate: " + mouse + " mouses");

    }

    @Override
    public String move() { // zad 7. Zmodyfikuj klasę Cat tak, żeby implementowała interfejs Movable – w metodzie move ma wypisać komunikat „idę”.
        return "Idę";
    }

    public String getName(){
        return name;
    }
}



