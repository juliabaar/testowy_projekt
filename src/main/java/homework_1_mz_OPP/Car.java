package homework_1_mz_OPP;

// 32.  Utwórz klasę abstrakcyjną Car posiadającą pola producer, model, color,
//seatsNumber oraz Engine.
// 34. Utwórz konstruktor bezparametrowy w klasie Car, który inicjalizuje pole seatsNumber
//wartością 2.
public class Car {

    String producer; // klasa abstrakcyjna tzn ze zmienne nie są private?
    String model;
    String color;
    int seatsNumber;
    Engine engine;

    public Car() {
        this.seatsNumber = 2; // .34
}

    public Car(String producer, String model, String color) {
        this.producer = producer;
        this.model = model;
        this.color = color;

    }
}
