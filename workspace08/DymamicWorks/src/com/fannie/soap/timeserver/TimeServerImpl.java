package com.fannie.soap.timeserver;

import java.util.Date;

import javax.jws.WebService;

/** 
*  This class is the implementation of the interface (which was contract)
*  this class will have endpointInterface which is the implementation and 
*  Logical name which is port number, serviceName and the target name space 
*  which will be shown in WSDL 

* awebservices setting refer to packages
*  portName name space 
*  urn: hosters
*   ws: web services
*
*/
@WebService(
		endpointInterface="com.fannie.soap.timeserver.TimeServer",
		name="TimeServicePort",
		portName="TimeServicePort",
		serviceName="TimeServerService",
		targetNamespace="urn:lz.timeserver/ws"
		)
public class TimeServerImpl implements TimeServer {

	@Override
	public String getTimeAsString() {
		return "Time is : " + new Date().toString();
	}

	@Override
	public String getTimeFromServer() {
		return "Time is " + new Date();
	}

	@Override
	public String getTicketFare(String src, String dest) {
		if(src.equalsIgnoreCase("blr") && dest.equalsIgnoreCase("del")){
			// you can connect to DB to get this information
			return "Ticket Fare is " + 20000;
		}
		
		return "Details not found for " + src +", " + dest;
	}

	@Override
	public String chkCreditScore(String name, int src) {
		
		// TODO Auto-generated method stub
		if (src>400){
			return name + " has score "+src+" and pass requirement.";
		}else{
			return name + " has score "+src+" and fail the 400 requirement.";
		}
		
	}
}
