package seat;

import javax.xml.ws.Endpoint;

public class SeatServerPublisher {

    public static final String URL = "http://localhost:8080/SeatService";

    public static void main(String[] args) {
        Endpoint.publish(URL, new SeatServer());
        System.out.println("Служба Seat опубликована по адресу: " + SeatServerPublisher.URL);
    }
}
