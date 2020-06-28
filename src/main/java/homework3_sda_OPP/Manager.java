package homework3_sda_OPP;
// 18. Utwórz klasę Manager dziedziczącą po klasie Employee. Dla managera do pensji dodawane
//jest 10% jako dodatek funkcyjny. Zmodyfikuj odpowiednio metodę getSalary. Zrób tak, aby
//metoda whoAmI dla pracownika wyświetlała tekst „Nazywam się manager Jan Kowalski i
//zarabiam 1000zł”
public class Manager extends Employee {

    public Manager(String imie, String nazwisko, int rokUrodzenia) {
        super(imie, nazwisko, rokUrodzenia);
        getSalary();
    }

    @Override
    public double getSalary() {
        return super.getSalary()*1.10;
    }
}
