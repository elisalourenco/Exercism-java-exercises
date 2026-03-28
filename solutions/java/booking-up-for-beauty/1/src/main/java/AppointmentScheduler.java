import java.time.LocalDate;
import java.time.LocalDateTime;

class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        LocalDateTime appointment = LocalDateTime.parse(appointmentDateDescription);
        return appointment;
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
        return "You have an appointment on " + appointmentDate.getDayOfWeek() + ", " + appointmentDate.getMonth() + " "
                +
                appointmentDate.getDayOfMonth() + ", " + appointmentDate.getYear() + ", at " + appointmentDate.getHour()
                + ":" +
                appointmentDate.getMinute() + ".";
    }

    public LocalDate getAnniversaryDate() {
        // => LocalDate.of(<current year>, 9, 15)

        return LocalDate.of(LocalDate.now().getYear(), 9, 15);

    }
}
