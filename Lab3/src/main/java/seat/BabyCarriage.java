package seat;

import lombok.Data;

@Data
public class BabyCarriage {

    private String brand;
    private String model;
    private String color;
    private String carriageType;

    @Override
    public String toString() {
        return "BabyCarriage{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", carriageType='" + carriageType + '\'' +
                '}';
    }
}
