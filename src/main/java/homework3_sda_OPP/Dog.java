package homework3_sda_OPP;
// 4. Napisz klasę Dog, która w konstruktorze przyjmować będzie imię psa. Klasa powinna
//posiadać metodę makeSound, która wypisywać będzie imię psa oraz wydawany przez niego
//dźwięk.
public class Dog implements Animals {
    private String name;

    public Dog(String imie){
        this.name = imie;
    }

    @Override
    public String makeSound() {
        return name + " Hau";
    }

    public String getName(){
        return name;
    }
}
