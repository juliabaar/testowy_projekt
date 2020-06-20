package presentation;

public class Foreach {
    public static void ex1(String[] tableOfNames) {

        for (String name : tableOfNames) {
            System.out.println("Hello " + name);
        }
    }


    public static String ex2(String[] tableOfProducts) {
        String list = "";
        for (String product : tableOfProducts) {

            list += product + ". ";
        }
        return list;
    }

    public static void main(String[] args) {
        String[] names = {"Julia, ", "Maciej, ", "Ola, ", "Pawel,", "Adam"};
        String[] products = {"Szynka", "Maslo", "Ser", "Chleb", "Pomidor"};
        ex1(names);
        System.out.println();

       String result = ex2(products);
       System.out.println(result);


    }
}

