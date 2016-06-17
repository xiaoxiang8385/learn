
package webService.clent;

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
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "SayHiServiceImpService", targetNamespace = "http://webService/", wsdlLocation = "http://localhost:8080/testjws/service/sayHi?wsdl")
public class SayHiServiceImpService
    extends Service
{

    private final static URL SAYHISERVICEIMPSERVICE_WSDL_LOCATION;
    private final static WebServiceException SAYHISERVICEIMPSERVICE_EXCEPTION;
    private final static QName SAYHISERVICEIMPSERVICE_QNAME = new QName("http://webService/", "SayHiServiceImpService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/testjws/service/sayHi?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SAYHISERVICEIMPSERVICE_WSDL_LOCATION = url;
        SAYHISERVICEIMPSERVICE_EXCEPTION = e;
    }

    public SayHiServiceImpService() {
        super(__getWsdlLocation(), SAYHISERVICEIMPSERVICE_QNAME);
    }

    public SayHiServiceImpService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SAYHISERVICEIMPSERVICE_QNAME, features);
    }

    public SayHiServiceImpService(URL wsdlLocation) {
        super(wsdlLocation, SAYHISERVICEIMPSERVICE_QNAME);
    }

    public SayHiServiceImpService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SAYHISERVICEIMPSERVICE_QNAME, features);
    }

    public SayHiServiceImpService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SayHiServiceImpService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SayHiService
     */
    @WebEndpoint(name = "SayHiServiceImpPort")
    public SayHiService getSayHiServiceImpPort() {
        return super.getPort(new QName("http://webService/", "SayHiServiceImpPort"), SayHiService.class);
    }
    
    
    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SayHiService
     */
    @WebEndpoint(name = "SayHiServiceImpPort")
    public SayHiService getSayHiServiceImpPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webService/", "SayHiServiceImpPort"), SayHiService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SAYHISERVICEIMPSERVICE_EXCEPTION!= null) {
            throw SAYHISERVICEIMPSERVICE_EXCEPTION;
        }
        return SAYHISERVICEIMPSERVICE_WSDL_LOCATION;
    }

}
