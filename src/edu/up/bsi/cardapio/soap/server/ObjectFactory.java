
package edu.up.bsi.cardapio.soap.server;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the edu.up.bsi.cardapio.soap.server package. 
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

    private final static QName _DadosEmpresaResponse_QNAME = new QName("http://server.soap.cardapio.bsi.up.edu/", "dados_empresaResponse");
    private final static QName _UmAlimentoResponse_QNAME = new QName("http://server.soap.cardapio.bsi.up.edu/", "um_alimentoResponse");
    private final static QName _LoginUsuario_QNAME = new QName("http://server.soap.cardapio.bsi.up.edu/", "login_usuario");
    private final static QName _UmAlimento_QNAME = new QName("http://server.soap.cardapio.bsi.up.edu/", "um_alimento");
    private final static QName _DadosEmpresa_QNAME = new QName("http://server.soap.cardapio.bsi.up.edu/", "dados_empresa");
    private final static QName _HoraAtual_QNAME = new QName("http://server.soap.cardapio.bsi.up.edu/", "hora_atual");
    private final static QName _HoraAtualResponse_QNAME = new QName("http://server.soap.cardapio.bsi.up.edu/", "hora_atualResponse");
    private final static QName _TodosAlimentos_QNAME = new QName("http://server.soap.cardapio.bsi.up.edu/", "todos_alimentos");
    private final static QName _TodosAlimentosResponse_QNAME = new QName("http://server.soap.cardapio.bsi.up.edu/", "todos_alimentosResponse");
    private final static QName _LoginUsuarioResponse_QNAME = new QName("http://server.soap.cardapio.bsi.up.edu/", "login_usuarioResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: edu.up.bsi.cardapio.soap.server
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DadosEmpresaResponse }
     * 
     */
    public DadosEmpresaResponse createDadosEmpresaResponse() {
        return new DadosEmpresaResponse();
    }

    /**
     * Create an instance of {@link LoginUsuario }
     * 
     */
    public LoginUsuario createLoginUsuario() {
        return new LoginUsuario();
    }

    /**
     * Create an instance of {@link UmAlimento }
     * 
     */
    public UmAlimento createUmAlimento() {
        return new UmAlimento();
    }

    /**
     * Create an instance of {@link UmAlimentoResponse }
     * 
     */
    public UmAlimentoResponse createUmAlimentoResponse() {
        return new UmAlimentoResponse();
    }

    /**
     * Create an instance of {@link TodosAlimentos }
     * 
     */
    public TodosAlimentos createTodosAlimentos() {
        return new TodosAlimentos();
    }

    /**
     * Create an instance of {@link HoraAtual }
     * 
     */
    public HoraAtual createHoraAtual() {
        return new HoraAtual();
    }

    /**
     * Create an instance of {@link HoraAtualResponse }
     * 
     */
    public HoraAtualResponse createHoraAtualResponse() {
        return new HoraAtualResponse();
    }

    /**
     * Create an instance of {@link DadosEmpresa }
     * 
     */
    public DadosEmpresa createDadosEmpresa() {
        return new DadosEmpresa();
    }

    /**
     * Create an instance of {@link LoginUsuarioResponse }
     * 
     */
    public LoginUsuarioResponse createLoginUsuarioResponse() {
        return new LoginUsuarioResponse();
    }

    /**
     * Create an instance of {@link TodosAlimentosResponse }
     * 
     */
    public TodosAlimentosResponse createTodosAlimentosResponse() {
        return new TodosAlimentosResponse();
    }

    /**
     * Create an instance of {@link AlimentoCardapio }
     * 
     */
    public AlimentoCardapio createAlimentoCardapio() {
        return new AlimentoCardapio();
    }

    /**
     * Create an instance of {@link DateFormatSymbols }
     * 
     */
    public DateFormatSymbols createDateFormatSymbols() {
        return new DateFormatSymbols();
    }

    /**
     * Create an instance of {@link SimpleDateFormat }
     * 
     */
    public SimpleDateFormat createSimpleDateFormat() {
        return new SimpleDateFormat();
    }

    /**
     * Create an instance of {@link Currency }
     * 
     */
    public Currency createCurrency() {
        return new Currency();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DadosEmpresaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.soap.cardapio.bsi.up.edu/", name = "dados_empresaResponse")
    public JAXBElement<DadosEmpresaResponse> createDadosEmpresaResponse(DadosEmpresaResponse value) {
        return new JAXBElement<DadosEmpresaResponse>(_DadosEmpresaResponse_QNAME, DadosEmpresaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UmAlimentoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.soap.cardapio.bsi.up.edu/", name = "um_alimentoResponse")
    public JAXBElement<UmAlimentoResponse> createUmAlimentoResponse(UmAlimentoResponse value) {
        return new JAXBElement<UmAlimentoResponse>(_UmAlimentoResponse_QNAME, UmAlimentoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.soap.cardapio.bsi.up.edu/", name = "login_usuario")
    public JAXBElement<LoginUsuario> createLoginUsuario(LoginUsuario value) {
        return new JAXBElement<LoginUsuario>(_LoginUsuario_QNAME, LoginUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UmAlimento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.soap.cardapio.bsi.up.edu/", name = "um_alimento")
    public JAXBElement<UmAlimento> createUmAlimento(UmAlimento value) {
        return new JAXBElement<UmAlimento>(_UmAlimento_QNAME, UmAlimento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DadosEmpresa }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.soap.cardapio.bsi.up.edu/", name = "dados_empresa")
    public JAXBElement<DadosEmpresa> createDadosEmpresa(DadosEmpresa value) {
        return new JAXBElement<DadosEmpresa>(_DadosEmpresa_QNAME, DadosEmpresa.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HoraAtual }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.soap.cardapio.bsi.up.edu/", name = "hora_atual")
    public JAXBElement<HoraAtual> createHoraAtual(HoraAtual value) {
        return new JAXBElement<HoraAtual>(_HoraAtual_QNAME, HoraAtual.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HoraAtualResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.soap.cardapio.bsi.up.edu/", name = "hora_atualResponse")
    public JAXBElement<HoraAtualResponse> createHoraAtualResponse(HoraAtualResponse value) {
        return new JAXBElement<HoraAtualResponse>(_HoraAtualResponse_QNAME, HoraAtualResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TodosAlimentos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.soap.cardapio.bsi.up.edu/", name = "todos_alimentos")
    public JAXBElement<TodosAlimentos> createTodosAlimentos(TodosAlimentos value) {
        return new JAXBElement<TodosAlimentos>(_TodosAlimentos_QNAME, TodosAlimentos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TodosAlimentosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.soap.cardapio.bsi.up.edu/", name = "todos_alimentosResponse")
    public JAXBElement<TodosAlimentosResponse> createTodosAlimentosResponse(TodosAlimentosResponse value) {
        return new JAXBElement<TodosAlimentosResponse>(_TodosAlimentosResponse_QNAME, TodosAlimentosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.soap.cardapio.bsi.up.edu/", name = "login_usuarioResponse")
    public JAXBElement<LoginUsuarioResponse> createLoginUsuarioResponse(LoginUsuarioResponse value) {
        return new JAXBElement<LoginUsuarioResponse>(_LoginUsuarioResponse_QNAME, LoginUsuarioResponse.class, null, value);
    }

}
