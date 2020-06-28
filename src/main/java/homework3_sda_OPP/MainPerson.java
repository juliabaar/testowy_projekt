package homework3_sda_OPP;

public class MainPerson {
    public static void main(String[] args) {


        Employee employee = new Employee("Julia", "Paterska", 1995);
        System.out.println("Rok urodzenia osoby to: " + employee.getYearOfBirth());
        employee.whoIAm();
        Manager manager = new Manager("Julia", "Bartczak",1995);
        manager.whoIAm();
        manager.gender();



    }
}