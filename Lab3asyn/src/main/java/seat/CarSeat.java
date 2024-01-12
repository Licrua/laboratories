package seat;

import lombok.Data;

@Data
public class CarSeat {

    private String brand;
    private String model;
    private int weightLimit;

    @Override
    public String toString() {
        return "CarSeat{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", weightLimit=" + weightLimit +
                '}';
    }
}
