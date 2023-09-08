import java.time.LocalTime;

public class AirplaneRequest {

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

    public void setScheduledDepartureTime(int hours, int minutes, int seconds) {
        this.scheduledDepartureTime = LocalTime.of(hours, minutes, seconds);
    }

    public LocalTime getActualDepartureTime() {
        return actualDepartureTime;
    }

    public void setActualDepartureTime(int hours, int minutes, int seconds) {
        this.actualDepartureTime = LocalTime.of(hours, minutes, seconds);
    }

    @Override
    public String toString() {
        return "AirplaneRequest{" +
                "flightNumber='" + flightNumber + '\'' +
                ", destination='" + destination + '\'' +
                ", scheduledDepartureTime=" + scheduledDepartureTime +
                ", actualDepartureTime=" + actualDepartureTime +
                '}';
    }
}
