package seat.client;

import seat.SeatServerPublisher;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

public class SeatClient {

    private static final int FIELD_NAMES_COUNT = 10;
    private String brands[] = {"Бренд1", "Бренд2", "Бренд3", "Бренд4", "Бренд5", "Бренд6", "Бренд7", "Бренд8", "Бренд9", "Бренд10"};
    private String models[] = {"Модель1", "Модель2", "Модель3", "Модель4", "Модель5", "Модель6", "Модель7", "Модель8", "Модель9", "Модель10"};
    private String colors[] = {"Цвет1", "Цвет2", "Цвет3", "Цвет4", "Цвет5", "Цвет6", "Цвет7", "Цвет8", "Цвет9", "Цвет10"};
    private String carriageTypes[] = {"Тип1", "Тип2", "Тип3", "Тип4", "Тип5", "Тип6", "Тип7", "Тип8", "Тип9", "Тип10"};

    private Random rnd = new Random(System.currentTimeMillis());

    public static void main(String[] args) {
        URL url = getWSDLURL(SeatServerPublisher.URL);
        SeatClient client = new SeatClient();
        client.process(url);
    }

    private int getRND(int number) {
        return rnd.nextInt(number);
    }

    private seat.client.BabyCarriage generateBabyCarriage() {
        seat.client.BabyCarriage babyCarriage = new seat.client.BabyCarriage();
        babyCarriage.setBrand(brands[getRND(FIELD_NAMES_COUNT)]);
        babyCarriage.setModel(models[getRND(FIELD_NAMES_COUNT)]);
        babyCarriage.setColor(colors[getRND(FIELD_NAMES_COUNT)]);
        babyCarriage.setCarriageType(carriageTypes[getRND(FIELD_NAMES_COUNT)]);
        return babyCarriage;
    }

    private seat.client.CarSeat generateCarSeat() {
        seat.client.CarSeat carSeat = new seat.client.CarSeat();
        carSeat.setBrand(brands[getRND(FIELD_NAMES_COUNT)]);
        carSeat.setModel(models[getRND(FIELD_NAMES_COUNT)]);
        carSeat.setWeightLimit(getRND(100) + 1);
        return carSeat;
    }

    private void process(URL url) {
        Seat service = new Seat(url);
        seat.client.SeatServer seatServicePort = (SeatServer) service.getSeatServerPort();

        for (int i = 0; i < 3; i++) {
            seat.client.BabyCarriage babyCarriage = generateBabyCarriage();
            seatServicePort.createBabyCarriage(babyCarriage.getBrand(), babyCarriage.getModel(),
                    babyCarriage.getColor(), babyCarriage.getCarriageType());
        }

        int babyCarriageCount = seatServicePort.getCountBabyCarriage();
        System.out.println("Количество детских колясок: " + babyCarriageCount);

        for (int i = 0; i < 3; i++) {
            seat.client.CarSeat carSeat = generateCarSeat();
            seatServicePort.createCarSeat(carSeat.getBrand(), carSeat.getModel(), carSeat.getWeightLimit());
        }

        int carSeatCount = seatServicePort.getCountCarSeat();
        System.out.println("Количество автокресел: " + carSeatCount);

        BabyCarriage retrievedBabyCarriage = seatServicePort.getBabyCarriageById(0);
        if (retrievedBabyCarriage != null) {
            System.out.println("Полученная детская коляска по ID: " + retrievedBabyCarriage);
        } else {
            System.out.println("Детская коляска с ID 0 не найдена");
        }

        retrievedBabyCarriage = seatServicePort.getBabyCarriageById(2);
        if (retrievedBabyCarriage != null) {
            System.out.println("Полученная детская коляска по ID: " + retrievedBabyCarriage);
        } else {
            System.out.println("Детская коляска с ID 2 не найдена");
        }

        CarSeat retrievedCarSeat = seatServicePort.getCarSeatById(0);
        if (retrievedCarSeat != null) {
            System.out.println("Полученное автокресло по ID: " + retrievedCarSeat);
        } else {
            System.out.println("Автокресло с ID 0 не найдено");
        }

        retrievedCarSeat = seatServicePort.getCarSeatById(1);
        if (retrievedCarSeat != null) {
            System.out.println("Полученное автокресло по ID: " + retrievedCarSeat);
        } else {
            System.out.println("Автокресло с ID 1 не найдено");
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
