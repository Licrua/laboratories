package seat;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Response;
import java.util.List;
import java.util.concurrent.Future;

@WebService(serviceName = "seat",portName = "SeatServerAsync",targetNamespace = "http://seat/")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
public interface ServerSeatAsyncInterface {

    @WebMethod(operationName = "GetListBabyCarriage")
    List<BabyCarriage> getListBabyCarriage();

    @WebMethod(operationName = "GetListCarList")
    List<CarSeat> getListCarSeat();

}
