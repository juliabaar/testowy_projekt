package homework_1_mz_OPP;

import lombok.Getter;
import lombok.Setter;

// 32.  Utwórz klasę abstrakcyjną Car posiadającą pola producer, model, color,
//seatsNumber oraz Engine.
// 34. Utwórz konstruktor bezparametrowy w klasie Car, który inicjalizuje pole seatsNumber
//wartością 2.
@Getter
@Setter
public abstract class Car {

    String producer; // klasa abstrakcyjna tzn ze zmienne nie są private?
    String model;
    String color;
    Integer seatsNumber;
    Engine engine;

    public Car() {
        this.seatsNumber = 2; // .34
}

    public Car(String producer, String model, String color, Integer seats, Engine silnik) {
        this.producer = producer;
        this.model = model;
        this.color = color;
        this.seatsNumber = seats;
        this.engine = silnik;


    }

    @Override
    public String toString() {
        return "Car{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", seatsNumber=" + seatsNumber +
                ", engine=" + engine +
                '}';
    }
}
