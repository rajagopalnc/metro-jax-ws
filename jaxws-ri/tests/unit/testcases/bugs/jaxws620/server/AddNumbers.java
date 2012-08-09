package bugs.jaxws620.server;


import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by 
 * Interstage Java EE (JAX-WS 2.1.3-r3242, WSIT-Runtime 1.0-r3242M) 09/02/2008 02:04:45
 * Generated source version: 2.1
 * 
 */
@WebService(name = "AddNumbers", targetNamespace = "http://duke.example.org")
public interface AddNumbers {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "http://duke.example.org")
    @RequestWrapper(localName = "addNumbers", targetNamespace = "http://duke.example.org", className = "dispatch.generate.client.AddNumbers")
    @ResponseWrapper(localName = "addNumbersResponse", targetNamespace = "http://duke.example.org", className = "dispatch.generate.client.AddNumbersResponse")
    public int addNumbers(
            @WebParam(name = "arg0", targetNamespace = "http://duke.example.org")
            int arg0,
            @WebParam(name = "arg1", targetNamespace = "http://duke.example.org")
            int arg1);

}
