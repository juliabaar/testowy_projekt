package homework3_sda_OPP;

import java.util.ArrayList;
import java.util.List;

// 12. Napisz metodę, która policzy łączne pole powierzchni paru utworzonych figur.
public class FigureMain {

        List<Object> listOfFigures = new ArrayList<>();
        Circle kolo = new Circle(2);
        Rectangle prostokat = new Rectangle(2, 2);
        Traingle trojkat = new Traingle(1, 2);
        double area = 0;

        public double listOfFigures () {
            listOfFigures.add(kolo.getArea());
            listOfFigures.add(prostokat.getArea());
            listOfFigures.add(trojkat.getArea());

            for (int i = 0; i < listOfFigures.size(); i++) {
                area += (double) listOfFigures.get(i);
            }
            return area;
        }

    }

