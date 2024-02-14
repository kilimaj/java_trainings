package soap;

import javax.jws.WebService;

@WebService(endpointInterface = "soap.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

	@Override
	public String welcome(String name) {
		
		return "Hello "+name+" welcome to SOAP-WS";
	}

	@Override
	public Integer add(Integer n, Integer y) {
		Integer result = n + y;
		return result;
	}

}
