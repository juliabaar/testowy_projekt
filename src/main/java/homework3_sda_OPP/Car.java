package homework3_sda_OPP;
// 6. Napisz klasę Car
//implementującą interfejs Movable – w metodzie move ma wypisać komunikat „jadę”.
public class Car implements Movable {

    @Override
    public String move() {
        return "Jadę";
    }
}
