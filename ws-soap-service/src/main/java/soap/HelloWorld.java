package soap;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface HelloWorld {
	@WebMethod
	String welcome(String name);
	
	@WebMethod
	Integer add(Integer n, Integer y);
}
