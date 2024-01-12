
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

    private final static QName _GetListBabyCarriage_QNAME = new QName("http://seat/", "getListBabyCarriage");
    private final static QName _GetListCarSeat_QNAME = new QName("http://seat/", "getListCarSeat");
    private final static QName _GetListBabyCarriageResponse_QNAME = new QName("http://seat/", "getListBabyCarriageResponse");
    private final static QName _GetListCarSeatResponse_QNAME = new QName("http://seat/", "getListCarSeatResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: seat
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetListCarSeatResponse }
     * 
     */
    public GetListCarSeatResponse createGetListCarSeatResponse() {
        return new GetListCarSeatResponse();
    }

    /**
     * Create an instance of {@link GetListBabyCarriageResponse }
     * 
     */
    public GetListBabyCarriageResponse createGetListBabyCarriageResponse() {
        return new GetListBabyCarriageResponse();
    }

    /**
     * Create an instance of {@link GetListBabyCarriage }
     * 
     */
    public GetListBabyCarriage createGetListBabyCarriage() {
        return new GetListBabyCarriage();
    }

    /**
     * Create an instance of {@link GetListCarSeat }
     * 
     */
    public GetListCarSeat createGetListCarSeat() {
        return new GetListCarSeat();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListBabyCarriage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://seat/", name = "getListBabyCarriage")
    public JAXBElement<GetListBabyCarriage> createGetListBabyCarriage(GetListBabyCarriage value) {
        return new JAXBElement<GetListBabyCarriage>(_GetListBabyCarriage_QNAME, GetListBabyCarriage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListCarSeat }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://seat/", name = "getListCarSeat")
    public JAXBElement<GetListCarSeat> createGetListCarSeat(GetListCarSeat value) {
        return new JAXBElement<GetListCarSeat>(_GetListCarSeat_QNAME, GetListCarSeat.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListBabyCarriageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://seat/", name = "getListBabyCarriageResponse")
    public JAXBElement<GetListBabyCarriageResponse> createGetListBabyCarriageResponse(GetListBabyCarriageResponse value) {
        return new JAXBElement<GetListBabyCarriageResponse>(_GetListBabyCarriageResponse_QNAME, GetListBabyCarriageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListCarSeatResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://seat/", name = "getListCarSeatResponse")
    public JAXBElement<GetListCarSeatResponse> createGetListCarSeatResponse(GetListCarSeatResponse value) {
        return new JAXBElement<GetListCarSeatResponse>(_GetListCarSeatResponse_QNAME, GetListCarSeatResponse.class, null, value);
    }

}
