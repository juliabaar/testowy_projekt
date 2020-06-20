package presentation;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class LocalTime {

    public static void dateNow() {
        LocalDate now = LocalDate.now();
        System.out.println("LocalDateTime:" + now);

    }


    public static void tokyoTime() {

        Clock clock = Clock.system(ZoneId.of("Asia/Tokyo"));
        LocalDateTime ldt = LocalDateTime.now(clock);
        System.out.println("Japan Time: " + ldt);

    }

    public static void dateFormat() {
        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");
        System.out.println("Date in format yyyy/MM/dd yyyy/mm/dd hh:mm:ss: " + formatter.format(ldt));

    }

    public static void main(String[] args) {
        dateNow();
        tokyoTime();
        dateFormat();

    }

}
