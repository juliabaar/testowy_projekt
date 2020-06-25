package homework1_mz_DataiCzas;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

// 12. Utwórz obiekt typu LocalDate przechowujący datę 01.01.2017 oraz obiekt typu
//LocalDate przechowujący datę 05.05.2017. Wykorzystując obiekt typu Period
//Wyświetl ile czasu minęło pomiędzy datami.
// 13. Utwórz obiekt typu LocalTime przechowujący godzinę 14:11 oraz obiekt typu
//LocalTime przechowujący godzinę 18:41. Wykorzystując klasę Duration oblicz ile
//czasu upłynęło pomiędzy godzinami.
public class Ex12Ex13 {
    public static void main(String[] args) {


        LocalDate jan = LocalDate.of(2017, 01, 01);
        LocalDate may = LocalDate.of(2017, 05, 05);

        Period ile = Period.between(may, jan);
        System.out.println(ile);

        LocalTime noon = LocalTime.of(14,11);
        LocalTime evening = LocalTime.of(18,41);

        Duration duration = Duration.between(evening, noon);
        System.out.println(duration);



    }
}
