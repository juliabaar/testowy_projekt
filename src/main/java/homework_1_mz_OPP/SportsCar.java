package homework_1_mz_OPP;
// 35. Utwórz konstruktor przyjmujący wszystkie możliwe parametry do ustawienie klasy
//SportCar.
public class SportsCar extends Car {

    public SportsCar(String producent, String model, String color, int siedzenia, Engine silnik){ // .35
        this.producer = producent;
        this.model = model;
        this.color = color;
        this.seatsNumber = 2;
        this.engine = silnik;
    }

    public void displaySportsCar(){
        System.out.println(producer);
        System.out.println(model);
        System.out.println(color);
        System.out.println(seatsNumber);
        System.out.println(engine);
    }

    public SportsCar(String producent, String model, String color, int siedzenia){
        super(producent,model,color); // slowo kluczowe super, tylko jeden typ danych?
        this.seatsNumber = siedzenia;


    }


}
