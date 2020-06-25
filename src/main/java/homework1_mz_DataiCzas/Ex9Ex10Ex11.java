package homework1_mz_DataiCzas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

// 9. Wykorzystując obiekt typu LocalTime wyświetl aktualny czas.
//10. Wykorzystując obiekt typu LocalDate wyświetl aktualną datę.
//11.Wykorzystując obiekt typu LocalDateTime wyświetl aktualną datę i godzinę.
public class Ex9Ex10Ex11 {
    public static void main(String[] args) {


        LocalTime now = LocalTime.now();
        LocalDate now1 = LocalDate.now();
        LocalDateTime now2 = LocalDateTime.now();
        System.out.println(now + " " + now1);
        System.out.println(now2);


    }
}

