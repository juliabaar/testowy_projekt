package homework3_sda_OPP;

import java.util.ArrayList;
import java.util.List;

// 12. Napisz metodę, która policzy łączne pole powierzchni paru utworzonych figur.
public class FigureMain {


    public static double countArea(List<Figure> listOfFigures) {
        double area = 0;
        for (Figure element: listOfFigures) {
            area += element.getArea();
        }
        return area;
    }

    public static boolean isEnough(List<Figure> listOfFigures, double possibleArea){ //.13
        return countArea(listOfFigures) <= possibleArea;
    }

    public static void main(String[] args) {
        List<Figure> listOfFigures = new ArrayList<>(); // <cecha wspolna>
        Circle kolo = new Circle(2);
        Rectangle prostokat = new Rectangle(2, 2);
        Traingle trojkat = new Traingle(1, 2);
        listOfFigures.add(kolo);
        listOfFigures.add(trojkat);
        listOfFigures.add(prostokat);
        System.out.println(isEnough(listOfFigures,15));


    }

}

