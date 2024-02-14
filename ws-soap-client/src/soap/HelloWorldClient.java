package soap;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

public class HelloWorldClient {

	public static void main(String[] args) throws ServiceException, RemoteException {
		HelloWorldImplServiceLocator locator = new HelloWorldImplServiceLocator();
		HelloWorld service = locator.getHelloWorldImplPort();
		System.out.println(service.welcome("John"));
		System.out.println(service.add(7,9));
	}

}
