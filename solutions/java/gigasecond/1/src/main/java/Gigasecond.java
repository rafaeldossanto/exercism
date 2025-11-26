import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {
    public LocalDate moment;
    public LocalDateTime moments;
    long GIGA_SECONDS = 1000000000;

    public Gigasecond(LocalDate moment) {
        this.moment = moment;
    }

    public Gigasecond(LocalDateTime moment) {
        this.moments = moment;
    }

    public LocalDateTime getDateTime() {
        if (moment != null) {
            return moment.atStartOfDay().plusSeconds(GIGA_SECONDS);
        }
     return moments.plusSeconds(GIGA_SECONDS);
    }
}
