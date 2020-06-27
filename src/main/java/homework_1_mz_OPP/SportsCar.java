package homework_1_mz_OPP;

import lombok.Getter;
import lombok.Setter;

//33. klasa SportsCar dziedzicząca
// 35. Utwórz konstruktor przyjmujący wszystkie możliwe parametry do ustawienie klasy
//SportCar.
@Getter
@Setter
public class SportsCar extends Car {

    private String radio;
    private String sound;

    public SportsCar(String producent, String model, String color, Integer siedzenia, Engine silnik){ // .35
       super(producent,model,color,siedzenia,silnik); // podajemy nazwy przekazywanych zmiennych
        this.sound = "Brum brum";

    }

    public void displaySportsCar(){
        System.out.println("Marka to: " + producer);
        System.out.println("Model to: " + model);
        System.out.println("Kolor to: " + color);
        System.out.println("Liczba miejsc wynosi: " + seatsNumber);
        engine.displayEngine();
    }

    public String makeSound(){
        return this.sound;
    }



}
