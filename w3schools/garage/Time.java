package garage;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Time {
    public static String getNow() {
        LocalDateTime nowRaw = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm dd.MM.yyyy");
        String now = nowRaw.format(format);
        return now;
    }
}
