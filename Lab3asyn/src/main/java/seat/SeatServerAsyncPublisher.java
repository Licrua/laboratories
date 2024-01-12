package seat;

import javax.xml.ws.Endpoint;

public class SeatServerAsyncPublisher {
    public static final String URL = "http://localhost:8080/SeatService";

    public static void main(String[] args) {
        Endpoint.publish(URL, new SeatServerAsync());
        System.out.println("Служба Seat опубликована по адресу: " + SeatServerAsyncPublisher.URL);
    }
}
