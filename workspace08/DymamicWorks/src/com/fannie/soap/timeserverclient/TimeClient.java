package com.fannie.soap.timeserverclient;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.fannie.soap.timeserver.TimeServer;


public class TimeClient {
	public static void main(String[] args) throws MalformedURLException {
		String wsdl ="http://127.0.0.1:9876/lz?WSDL";
		String serviceName ="TimeServerService";
		String tns="urn:lz.timeserver/ws";
		
		URL url = new URL(wsdl);
		QName qname = new QName(tns, serviceName);
		Service service = Service.create(url, qname);

		TimeServer ts = service.getPort(TimeServer.class);
		
		System.out.println("Price from Blr-Del :" 
				+ ts.getTicketFare("blr", "del"));
		
		System.out.println("Price from Mum-Del :" 
				+ ts.getTicketFare("mum", "del"));
		
	
		System.out.println("credit score check for Mary :" 
				+ ts.chkCreditScore("Mary", 300));
		
		System.out.println("credit score check for Jack :" 
				+ ts.chkCreditScore("Jack", 500));
	}
}
