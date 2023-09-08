import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
	// write your code here
        AirplaneRequest request1 = new AirplaneRequest();
        request1.setFlightNumber("TKD8989");
        request1.setDestination("Asgard");
        request1.setScheduledDepartureTime(22,0,00);
        request1.setActualDepartureTime(23,59,59);

        Airplane airplane1 = inputValidation(request1);

        airplane1.flightStatusReport();

    }

    public static Airplane inputValidation(AirplaneRequest request) {

        LocalTime scheduledDepartureTime = request.getScheduledDepartureTime();
        LocalTime actualDepartureTime = request.getActualDepartureTime();

        if (request.getFlightNumber() == null) {
            System.out.println("Please enter a proper flight number.");
            return null;
        }

        if (request.getDestination() == null) {
            System.out.println("Please enter a proper destination.");
            return null;
        }

        if (scheduledDepartureTime == null ||
                actualDepartureTime == null) {
            System.out.println("Please enter a proper time");
            return null;
        }

        Airplane airplane = new Airplane();
        airplane.setFlightNumber(request.getFlightNumber());
        airplane.setDestination(request.getDestination());
        airplane.setScheduledDepartureTime(request.getScheduledDepartureTime());
        airplane.setActualDepartureTime(request.getActualDepartureTime());
        return airplane;
    }
}
