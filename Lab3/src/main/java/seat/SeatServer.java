package seat;

import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@WebService(serviceName = "seat")
public class SeatServer implements ServerSeatInterface {

    private List<BabyCarriage> babyCarriageList = new ArrayList<>();
    private List<CarSeat> carSeatList = new ArrayList<>();

    @Override
    public BabyCarriage createBabyCarriage(String brand, String model, String color, String carriageType) {
        BabyCarriage babyCarriage = new BabyCarriage();
        babyCarriage.setBrand(brand);
        babyCarriage.setModel(model);
        babyCarriage.setColor(color);
        babyCarriage.setCarriageType(carriageType);
        babyCarriageList.add(babyCarriage);
        return babyCarriage;
    }

    @Override
    public Integer getCountBabyCarriage() {
        return babyCarriageList.size();
    }

    @Override
    public CarSeat createCarSeat(String brand, String model, int weightLimit) {
        CarSeat carSeat = new CarSeat();
        carSeat.setBrand(brand);
        carSeat.setModel(model);
        carSeat.setWeightLimit(weightLimit);
        carSeatList.add(carSeat);
        return carSeat;
    }

    @Override
    public Integer getCountCarSeat() {
        return carSeatList.size();
    }

    @Override
    public BabyCarriage getBabyCarriageById(Integer id) {
        if (id > -1 && id < babyCarriageList.size()) {
            return babyCarriageList.get(id);
        }
        return null;
    }

    @Override
    public CarSeat getCarSeatById(Integer id) {
        if (id > -1 && id < carSeatList.size()) {
            return carSeatList.get(id);
        }
        return null;
    }
}
