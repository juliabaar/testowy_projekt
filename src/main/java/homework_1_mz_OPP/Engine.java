package homework_1_mz_OPP;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

// 28. Utwórz klasę Engine posiadającą pola capacity, horsePower, fuelConsumption..
//29. Utwórz konstruktor przyjmujący wszystkie możliwe parametry do ustawienie klasy
//Engine mozna to zrobic@AllArgsConstrucor
//30. Utwórz metody umożliwiające ustawienie każdego parametru/pola klasy Engine mozna to zrobic @Getter
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Engine {

    private Integer capacity;
    private Integer horsePower;
    private Integer fuelConsumption;

    public void displayEngine(){
        System.out.println("Pojemność to: " + capacity);
        System.out.println("Liczba koni to: " + horsePower);
        System.out.println("Spalanie wynosi: " + fuelConsumption);
    }

}


