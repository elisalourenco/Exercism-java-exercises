import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy HH:mm:ss");

        LocalDateTime dateTime = LocalDateTime.parse(appointmentDateDescription, formatter);
        return dateTime;
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        if (appointmentDate.isBefore(LocalDateTime.now())) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        int hour = appointmentDate.getHour();

        if (hour < 12 || hour >= 18) {
            return false;
        }
        return true;
    }

    public String getDescription(LocalDateTime appointmentDate) {
        // => "You have an appointment on Friday, March 29, 2019, at 3:00 PM."

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(
                "EEEE, MMMM d, yyyy, 'at' h:mm a",
                Locale.ENGLISH);
        return "You have an appointment on " +
                appointmentDate.format(formatter) + ".";
    }

    public LocalDate getAnniversaryDate() {
        // => LocalDate.of(<current year>, 9, 15)

        return LocalDate.of(LocalDate.now().getYear(), 9, 15);

    }
}
