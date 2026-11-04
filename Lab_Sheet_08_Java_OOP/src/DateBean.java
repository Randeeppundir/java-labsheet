import java.time.LocalDate;

public class DateBean {
    // Read-only JavaBean property: getter without a setter.
    public LocalDate getCurrentDate() {
        return LocalDate.now();
    }
}
