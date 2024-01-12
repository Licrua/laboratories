
package seat.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the seat package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CreateCarSeat_QNAME = new QName("http://seat/", "createCarSeat");
    private final static QName _GetCountBabyCarriage_QNAME = new QName("http://seat/", "getCountBabyCarriage");
    private final static QName _GetCountBabyCarriageResponse_QNAME = new QName("http://seat/", "getCountBabyCarriageResponse");
    private final static QName _GetCountCarSeatResponse_QNAME = new QName("http://seat/", "getCountCarSeatResponse");
    private final static QName _CreateCarSeatResponse_QNAME = new QName("http://seat/", "createCarSeatResponse");
    private final static QName _GetBabyCarriageByIdResponse_QNAME = new QName("http://seat/", "getBabyCarriageByIdResponse");
    private final static QName _GetCountCarSeat_QNAME = new QName("http://seat/", "getCountCarSeat");
    private final static QName _CreateBabyCarriageResponse_QNAME = new QName("http://seat/", "createBabyCarriageResponse");
    private final static QName _GetBabyCarriageById_QNAME = new QName("http://seat/", "getBabyCarriageById");
    private final static QName _GetCarSeatByIdResponse_QNAME = new QName("http://seat/", "getCarSeatByIdResponse");
    private final static QName _GetCarSeatById_QNAME = new QName("http://seat/", "getCarSeatById");
    private final static QName _CreateBabyCarriage_QNAME = new QName("http://seat/", "createBabyCarriage");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: seat
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCarSeatByIdResponse }
     * 
     */
    public GetCarSeatByIdResponse createGetCarSeatByIdResponse() {
        return new GetCarSeatByIdResponse();
    }

    /**
     * Create an instance of {@link GetCarSeatById }
     * 
     */
    public GetCarSeatById createGetCarSeatById() {
        return new GetCarSeatById();
    }

    /**
     * Create an instance of {@link CreateBabyCarriage }
     * 
     */
    public CreateBabyCarriage createCreateBabyCarriage() {
        return new CreateBabyCarriage();
    }

    /**
     * Create an instance of {@link GetCountCarSeat }
     * 
     */
    public GetCountCarSeat createGetCountCarSeat() {
        return new GetCountCarSeat();
    }

    /**
     * Create an instance of {@link CreateBabyCarriageResponse }
     * 
     */
    public CreateBabyCarriageResponse createCreateBabyCarriageResponse() {
        return new CreateBabyCarriageResponse();
    }

    /**
     * Create an instance of {@link GetBabyCarriageById }
     * 
     */
    public GetBabyCarriageById createGetBabyCarriageById() {
        return new GetBabyCarriageById();
    }

    /**
     * Create an instance of {@link CreateCarSeatResponse }
     * 
     */
    public CreateCarSeatResponse createCreateCarSeatResponse() {
        return new CreateCarSeatResponse();
    }

    /**
     * Create an instance of {@link GetBabyCarriageByIdResponse }
     * 
     */
    public GetBabyCarriageByIdResponse createGetBabyCarriageByIdResponse() {
        return new GetBabyCarriageByIdResponse();
    }

    /**
     * Create an instance of {@link CreateCarSeat }
     * 
     */
    public CreateCarSeat createCreateCarSeat() {
        return new CreateCarSeat();
    }

    /**
     * Create an instance of {@link GetCountBabyCarriage }
     * 
     */
    public GetCountBabyCarriage createGetCountBabyCarriage() {
        return new GetCountBabyCarriage();
    }

    /**
     * Create an instance of {@link GetCountBabyCarriageResponse }
     * 
     */
    public GetCountBabyCarriageResponse createGetCountBabyCarriageResponse() {
        return new GetCountBabyCarriageResponse();
    }

    /**
     * Create an instance of {@link GetCountCarSeatResponse }
     * 
     */
    public GetCountCarSeatResponse createGetCountCarSeatResponse() {
        return new GetCountCarSeatResponse();
    }

    /**
     * Create an instance of {@link BabyCarriage }
     * 
     */
    public BabyCarriage createBabyCarriage() {
        return new BabyCarriage();
    }

    /**
     * Create an instance of {@link CarSeat }
     * 
     */
    public CarSeat createCarSeat() {
        return new CarSeat();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCarSeat }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://seat/", name = "createCarSeat")
    public JAXBElement<CreateCarSeat> createCreateCarSeat(CreateCarSeat value) {
        return new JAXBElement<CreateCarSeat>(_CreateCarSeat_QNAME, CreateCarSeat.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCountBabyCarriage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://seat/", name = "getCountBabyCarriage")
    public JAXBElement<GetCountBabyCarriage> createGetCountBabyCarriage(GetCountBabyCarriage value) {
        return new JAXBElement<GetCountBabyCarriage>(_GetCountBabyCarriage_QNAME, GetCountBabyCarriage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCountBabyCarriageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://seat/", name = "getCountBabyCarriageResponse")
    public JAXBElement<GetCountBabyCarriageResponse> createGetCountBabyCarriageResponse(GetCountBabyCarriageResponse value) {
        return new JAXBElement<GetCountBabyCarriageResponse>(_GetCountBabyCarriageResponse_QNAME, GetCountBabyCarriageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCountCarSeatResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://seat/", name = "getCountCarSeatResponse")
    public JAXBElement<GetCountCarSeatResponse> createGetCountCarSeatResponse(GetCountCarSeatResponse value) {
        return new JAXBElement<GetCountCarSeatResponse>(_GetCountCarSeatResponse_QNAME, GetCountCarSeatResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCarSeatResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://seat/", name = "createCarSeatResponse")
    public JAXBElement<CreateCarSeatResponse> createCreateCarSeatResponse(CreateCarSeatResponse value) {
        return new JAXBElement<CreateCarSeatResponse>(_CreateCarSeatResponse_QNAME, CreateCarSeatResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBabyCarriageByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://seat/", name = "getBabyCarriageByIdResponse")
    public JAXBElement<GetBabyCarriageByIdResponse> createGetBabyCarriageByIdResponse(GetBabyCarriageByIdResponse value) {
        return new JAXBElement<GetBabyCarriageByIdResponse>(_GetBabyCarriageByIdResponse_QNAME, GetBabyCarriageByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCountCarSeat }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://seat/", name = "getCountCarSeat")
    public JAXBElement<GetCountCarSeat> createGetCountCarSeat(GetCountCarSeat value) {
        return new JAXBElement<GetCountCarSeat>(_GetCountCarSeat_QNAME, GetCountCarSeat.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateBabyCarriageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://seat/", name = "createBabyCarriageResponse")
    public JAXBElement<CreateBabyCarriageResponse> createCreateBabyCarriageResponse(CreateBabyCarriageResponse value) {
        return new JAXBElement<CreateBabyCarriageResponse>(_CreateBabyCarriageResponse_QNAME, CreateBabyCarriageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBabyCarriageById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://seat/", name = "getBabyCarriageById")
    public JAXBElement<GetBabyCarriageById> createGetBabyCarriageById(GetBabyCarriageById value) {
        return new JAXBElement<GetBabyCarriageById>(_GetBabyCarriageById_QNAME, GetBabyCarriageById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCarSeatByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://seat/", name = "getCarSeatByIdResponse")
    public JAXBElement<GetCarSeatByIdResponse> createGetCarSeatByIdResponse(GetCarSeatByIdResponse value) {
        return new JAXBElement<GetCarSeatByIdResponse>(_GetCarSeatByIdResponse_QNAME, GetCarSeatByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCarSeatById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://seat/", name = "getCarSeatById")
    public JAXBElement<GetCarSeatById> createGetCarSeatById(GetCarSeatById value) {
        return new JAXBElement<GetCarSeatById>(_GetCarSeatById_QNAME, GetCarSeatById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateBabyCarriage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://seat/", name = "createBabyCarriage")
    public JAXBElement<CreateBabyCarriage> createCreateBabyCarriage(CreateBabyCarriage value) {
        return new JAXBElement<CreateBabyCarriage>(_CreateBabyCarriage_QNAME, CreateBabyCarriage.class, null, value);
    }

}
