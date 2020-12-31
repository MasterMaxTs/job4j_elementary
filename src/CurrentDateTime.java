import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentDateTime {

    public DateTimeFormatter form() {
        return DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    }

    public LocalDateTime getCurrent() {
        return LocalDateTime.now();
    }

    public static void main(String[] args) {
        CurrentDateTime time = new CurrentDateTime();
        System.out.println("Текущее время: " + time.getCurrent().format(time.form()));
    }
}
