package homework_1_mz_OPP;

// 28. Utwórz klasę Engine posiadającą pola capacity, horsePower, fuelConsumption..
//29. Utwórz konstruktor przyjmujący wszystkie możliwe parametry do ustawienie klasy
//Engine
//30. Utwórz metody umożliwiające ustawienie każdego parametru/pola klasy Engine
public class Engine {
    private int capacity;
    private int horsePower;
    private int fuelConsumption;

    public Engine(int pojemosc, int moc, int spalanie) {
        this.capacity = pojemosc;
        this.horsePower = moc;
        this.fuelConsumption = spalanie;
    }

    public void setCapacity(int pojemnnosc) {
        this.capacity = pojemnnosc;
    }

    public void setHorsePower(int moc) {
        this.horsePower = moc;
    }

    public void setFuelConsumption(int spalanie) {
        this.fuelConsumption = spalanie;
    }

    public int getCapacity(){
        return capacity;
    }

    public int getHorsePower(){
        return horsePower;
    }

    public int getFuelConsumption(){
        return fuelConsumption;
    }
}


