package soap;

import javax.xml.ws.Endpoint;

public class HelloWorldPublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:7575/jaxws/welcome", new HelloWorldImpl());

	}

}
