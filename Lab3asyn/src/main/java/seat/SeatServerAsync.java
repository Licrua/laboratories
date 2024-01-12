package seat;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Response;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Future;

@WebService(serviceName = "seat",portName = "SeatServerAsync",targetNamespace = "http://seat/")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
public class SeatServerAsync implements ServerSeatAsyncInterface {

    private static final int FIELD_NAMES_COUNT = 10;
    private String brands[] = {"Бренд1", "Бренд2", "Бренд3", "Бренд4", "Бренд5", "Бренд6", "Бренд7", "Бренд8", "Бренд9", "Бренд10"};
    private String models[] = {"Модель1", "Модель2", "Модель3", "Модель4", "Модель5", "Модель6", "Модель7", "Модель8", "Модель9", "Модель10"};
    private String colors[] = {"Цвет1", "Цвет2", "Цвет3", "Цвет4", "Цвет5", "Цвет6", "Цвет7", "Цвет8", "Цвет9", "Цвет10"};
    private String carriageTypes[] = {"Тип1", "Тип2", "Тип3", "Тип4", "Тип5", "Тип6", "Тип7", "Тип8", "Тип9", "Тип10"};

    private Random rnd = new Random(System.currentTimeMillis());

    private List<BabyCarriage> babyCarriageList = new ArrayList<>();
    private List<CarSeat> carSeatList = new ArrayList<>();

    private int getRND(int number) {
        return rnd.nextInt(number);
    }

    private BabyCarriage generateBabyCarriage() {
        BabyCarriage babyCarriage = new BabyCarriage();
        babyCarriage.setBrand(brands[getRND(FIELD_NAMES_COUNT)]);
        babyCarriage.setModel(models[getRND(FIELD_NAMES_COUNT)]);
        babyCarriage.setColor(colors[getRND(FIELD_NAMES_COUNT)]);
        babyCarriage.setCarriageType(carriageTypes[getRND(FIELD_NAMES_COUNT)]);
        return babyCarriage;
    }

    private CarSeat generateCarSeat() {
        CarSeat carSeat = new CarSeat();
        carSeat.setBrand(brands[getRND(FIELD_NAMES_COUNT)]);
        carSeat.setModel(models[getRND(FIELD_NAMES_COUNT)]);
        carSeat.setWeightLimit(getRND(100) + 1);
        return carSeat;
    }

    SeatServerAsync() {
        for (int i = 0; i < 3; i++) {
            babyCarriageList.add(generateBabyCarriage());
            carSeatList.add(generateCarSeat());
        }
    }

    @Override
    public List<BabyCarriage> getListBabyCarriage() {
        try {
            Thread.sleep(1000 * 60);
            return babyCarriageList;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<CarSeat> getListCarSeat() {
        try {
            Thread.sleep(1500 * 60);
            return carSeatList;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }

}
