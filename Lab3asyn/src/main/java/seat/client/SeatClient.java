package seat.client;

import seat.SeatServerAsyncPublisher;

import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Response;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class SeatClient {

    class BabyCarriageAsyncHandler implements AsyncHandler<GetListBabyCarriageResponse> {
        private GetListBabyCarriageResponse response;

        @Override
        public void handleResponse(Response<GetListBabyCarriageResponse> res) {
            try {
                response = res.get(2000, TimeUnit.MILLISECONDS);

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        public List<BabyCarriage> getBabyCarriageResponse() {
            return response.getReturn();
        }
    }

    class CarSeatAsyncHandler implements AsyncHandler<GetListCarSeatResponse> {
        private GetListCarSeatResponse response;

        @Override
        public void handleResponse(Response<GetListCarSeatResponse> res) {
            try {
                response = res.get(2000, TimeUnit.MILLISECONDS);

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        public List<CarSeat> getCarSeatResponse() {
            return response.getReturn();
        }
    }

    public static void main(String[] args) {
        URL url = getWSDLURL(SeatServerAsyncPublisher.URL);
        SeatClient client = new SeatClient();
        client.processCallback(url);
        client.processPolling(url);
    }


    public void processCallback(URL url) {
        Seat svc = new Seat(url);
        SeatServerAsync port = svc.getSeatServerAsync();
        BabyCarriageAsyncHandler babyCarriageAsyncHandler = new BabyCarriageAsyncHandler();
        CarSeatAsyncHandler carSeatAsyncHandler = new CarSeatAsyncHandler();
        Future<?> futureBabyCarriage = port.getListBabyCarriageAsync(babyCarriageAsyncHandler);
        Future<?> futureCarSeat = port.getListCarSeatAsync(carSeatAsyncHandler);  // Аналогично для CarSeat

        while (!futureBabyCarriage.isDone() || !futureCarSeat.isDone()) {
            try {
                System.out.println("Waiting...");
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        List<BabyCarriage> babyCarriages = babyCarriageAsyncHandler.getBabyCarriageResponse();
        List<CarSeat> carSeats = carSeatAsyncHandler.getCarSeatResponse();
        printBabyCarriage(babyCarriages);
        printCarSeat(carSeats);
    }

    public void processPolling(URL url) {
        Seat svc = new Seat(url);
        SeatServerAsync port = svc.getSeatServerAsync();
        Response<GetListBabyCarriageResponse> responseBabyCarriage = port.getListBabyCarriageAsync();
        Response<GetListCarSeatResponse> responseCarSeat = port.getListCarSeatAsync();
        while (!responseBabyCarriage.isDone() || !responseCarSeat.isDone()) {
            try {
                System.out.println("Polling...");
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            List<BabyCarriage> babyCarriages = responseBabyCarriage.get().getReturn();
            List<CarSeat> carSeats = responseCarSeat.get().getReturn();
            printBabyCarriage(babyCarriages);
            printCarSeat(carSeats);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    public void printBabyCarriage(List<BabyCarriage> list) {
        System.out.println("BabyCarriages");
        for (BabyCarriage babyCarriage :
                list) {
            System.out.println("Brand: " + babyCarriage.getBrand() +
                    " Model: " + babyCarriage.getModel() +
                    " Color " + babyCarriage.getColor() +
                    " Carriage Type" + babyCarriage.getCarriageType());
        }
    }

    public void printCarSeat(List<CarSeat> list) {
        System.out.println("CarSeats");
        for (CarSeat carSeat :
                list) {
            System.out.println("Brand: " + carSeat.getBrand() +
                    " Model: " + carSeat.getModel() +
                    " WeightLimit " + carSeat.getWeightLimit());
        }
    }

    private static URL getWSDLURL(String urlStr) {
        URL url = null;
        try {
            url = new URL(urlStr);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return url;
    }

}