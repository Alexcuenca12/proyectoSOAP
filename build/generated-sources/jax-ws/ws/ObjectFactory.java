
package ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws package. 
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

    private final static QName _Login_QNAME = new QName("http://ws/", "Login");
    private final static QName _LoginResponse_QNAME = new QName("http://ws/", "LoginResponse");
    private final static QName _Deposito_QNAME = new QName("http://ws/", "deposito");
    private final static QName _DepositoResponse_QNAME = new QName("http://ws/", "depositoResponse");
    private final static QName _DevolverSaldo_QNAME = new QName("http://ws/", "devolverSaldo");
    private final static QName _DevolverSaldoResponse_QNAME = new QName("http://ws/", "devolverSaldoResponse");
    private final static QName _Registro_QNAME = new QName("http://ws/", "registro");
    private final static QName _RegistroResponse_QNAME = new QName("http://ws/", "registroResponse");
    private final static QName _Retiro_QNAME = new QName("http://ws/", "retiro");
    private final static QName _RetiroResponse_QNAME = new QName("http://ws/", "retiroResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link Deposito }
     * 
     */
    public Deposito createDeposito() {
        return new Deposito();
    }

    /**
     * Create an instance of {@link DepositoResponse }
     * 
     */
    public DepositoResponse createDepositoResponse() {
        return new DepositoResponse();
    }

    /**
     * Create an instance of {@link DevolverSaldo }
     * 
     */
    public DevolverSaldo createDevolverSaldo() {
        return new DevolverSaldo();
    }

    /**
     * Create an instance of {@link DevolverSaldoResponse }
     * 
     */
    public DevolverSaldoResponse createDevolverSaldoResponse() {
        return new DevolverSaldoResponse();
    }

    /**
     * Create an instance of {@link Registro }
     * 
     */
    public Registro createRegistro() {
        return new Registro();
    }

    /**
     * Create an instance of {@link RegistroResponse }
     * 
     */
    public RegistroResponse createRegistroResponse() {
        return new RegistroResponse();
    }

    /**
     * Create an instance of {@link Retiro }
     * 
     */
    public Retiro createRetiro() {
        return new Retiro();
    }

    /**
     * Create an instance of {@link RetiroResponse }
     * 
     */
    public RetiroResponse createRetiroResponse() {
        return new RetiroResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Login }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "Login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "LoginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Deposito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Deposito }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "deposito")
    public JAXBElement<Deposito> createDeposito(Deposito value) {
        return new JAXBElement<Deposito>(_Deposito_QNAME, Deposito.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepositoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DepositoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "depositoResponse")
    public JAXBElement<DepositoResponse> createDepositoResponse(DepositoResponse value) {
        return new JAXBElement<DepositoResponse>(_DepositoResponse_QNAME, DepositoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevolverSaldo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DevolverSaldo }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "devolverSaldo")
    public JAXBElement<DevolverSaldo> createDevolverSaldo(DevolverSaldo value) {
        return new JAXBElement<DevolverSaldo>(_DevolverSaldo_QNAME, DevolverSaldo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevolverSaldoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DevolverSaldoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "devolverSaldoResponse")
    public JAXBElement<DevolverSaldoResponse> createDevolverSaldoResponse(DevolverSaldoResponse value) {
        return new JAXBElement<DevolverSaldoResponse>(_DevolverSaldoResponse_QNAME, DevolverSaldoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Registro }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Registro }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "registro")
    public JAXBElement<Registro> createRegistro(Registro value) {
        return new JAXBElement<Registro>(_Registro_QNAME, Registro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistroResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegistroResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "registroResponse")
    public JAXBElement<RegistroResponse> createRegistroResponse(RegistroResponse value) {
        return new JAXBElement<RegistroResponse>(_RegistroResponse_QNAME, RegistroResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Retiro }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Retiro }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "retiro")
    public JAXBElement<Retiro> createRetiro(Retiro value) {
        return new JAXBElement<Retiro>(_Retiro_QNAME, Retiro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetiroResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RetiroResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "retiroResponse")
    public JAXBElement<RetiroResponse> createRetiroResponse(RetiroResponse value) {
        return new JAXBElement<RetiroResponse>(_RetiroResponse_QNAME, RetiroResponse.class, null, value);
    }

}
