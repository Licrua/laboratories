package seat;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface ServerSeatInterface {

    @WebMethod(operationName = "CreateBabyCarriage")
    BabyCarriage createBabyCarriage(
            @WebParam(name = "brand") String brand,
            @WebParam(name = "model") String model,
            @WebParam(name = "color") String color,
            @WebParam(name = "carriageType") String carriageType
    );

    @WebMethod(operationName = "CountCarSeat")
    Integer getCountBabyCarriage();

    @WebMethod(operationName = "CreateCarSeat")
    CarSeat createCarSeat(
            @WebParam(name = "brand") String brand,
            @WebParam(name = "model") String model,
            @WebParam(name = "weightLimit") int weightLimit
    );

    @WebMethod(operationName = "CountCarSeat")
    Integer getCountCarSeat();

    @WebMethod(operationName = "BabyCarriageById")
    BabyCarriage getBabyCarriageById(Integer id);

    @WebMethod(operationName = "CarSeatById")
    CarSeat getCarSeatById(Integer id);
}
