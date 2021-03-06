package lesson14_soap;

import javax.xml.ws.Endpoint;

public class MainMateGroupServicePublisher {

	public static void main(String[] args) {
		System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true");
		System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", "true");
		System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dump", "true");
		System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true");
		Endpoint.publish("http://localhost:9999/ws/mate", new MateGroupServiceImpl());
	}

}