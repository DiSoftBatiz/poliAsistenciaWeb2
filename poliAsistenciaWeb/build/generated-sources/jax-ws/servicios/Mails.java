
package servicios;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "mails", targetNamespace = "http://servicios/", wsdlLocation = "http://localhost:8080/serviciosWebPoliAsistencia/mails?wsdl")
public class Mails
    extends Service
{

    private final static URL MAILS_WSDL_LOCATION;
    private final static WebServiceException MAILS_EXCEPTION;
    private final static QName MAILS_QNAME = new QName("http://servicios/", "mails");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/serviciosWebPoliAsistencia/mails?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MAILS_WSDL_LOCATION = url;
        MAILS_EXCEPTION = e;
    }

    public Mails() {
        super(__getWsdlLocation(), MAILS_QNAME);
    }

    public Mails(WebServiceFeature... features) {
        super(__getWsdlLocation(), MAILS_QNAME, features);
    }

    public Mails(URL wsdlLocation) {
        super(wsdlLocation, MAILS_QNAME);
    }

    public Mails(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MAILS_QNAME, features);
    }

    public Mails(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Mails(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns EnviaMails
     */
    @WebEndpoint(name = "enviaMailsPort")
    public EnviaMails getEnviaMailsPort() {
        return super.getPort(new QName("http://servicios/", "enviaMailsPort"), EnviaMails.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EnviaMails
     */
    @WebEndpoint(name = "enviaMailsPort")
    public EnviaMails getEnviaMailsPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://servicios/", "enviaMailsPort"), EnviaMails.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MAILS_EXCEPTION!= null) {
            throw MAILS_EXCEPTION;
        }
        return MAILS_WSDL_LOCATION;
    }

}
