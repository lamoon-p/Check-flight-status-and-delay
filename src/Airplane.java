import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Airplane {

    private String flightNumber;
    private String destination;
    private LocalTime scheduledDepartureTime;
    private LocalTime actualDepartureTime;

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public LocalTime getScheduledDepartureTime() {
        return scheduledDepartureTime;
    }

    public void setScheduledDepartureTime(LocalTime scheduledDepartureTime) {
        this.scheduledDepartureTime = scheduledDepartureTime;
    }

    public LocalTime getActualDepartureTime() {
        return actualDepartureTime;
    }

    public void setActualDepartureTime(LocalTime actualDepartureTime) {
        this.actualDepartureTime = actualDepartureTime;
    }

    // check flight status & delay.
    public long departureTimeDifference() {

        return scheduledDepartureTime.until(actualDepartureTime, ChronoUnit.MINUTES);
    }

    public void flightStatusReport() {

        System.out.println("Flight number: " + flightNumber +
                "\nDestination: " + destination);
        if (departureTimeDifference() < 0) {
            System.out.println("This aircraft had departed on-time at " + scheduledDepartureTime);
        }
        if (departureTimeDifference() > 0) {
            System.out.println("This aircraft had departed " + departureTimeDifference() + " minutes late.");
        }
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "flightNumber='" + flightNumber + '\'' +
                ", destination='" + destination + '\'' +
                ", scheduledDepartureTime=" + scheduledDepartureTime +
                ", actualDepartureTime=" + actualDepartureTime +
                '}';
    }
}