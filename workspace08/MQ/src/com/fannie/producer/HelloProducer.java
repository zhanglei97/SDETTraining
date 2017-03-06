package com.fannie.producer;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.MessageProducer;
import javax.jms.ObjectMessage;
import javax.jms.Session;
import javax.jms.TextMessage;

import com.fannie.entity.Emp;


public class HelloProducer {

	public static void sendMessage() {

		try {

			// Start connection
			ConnectionFactory cf = new com.sun.messaging.ConnectionFactory();
			Connection connection = cf.createConnection();
			Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
			Destination destination = session.createTopic("HelloWorld");
			MessageProducer producer = session.createProducer(destination);
			connection.start();
			boolean flag = true;
			while(flag = true){
			// create message to send
			TextMessage message = session.createTextMessage();
			message.setText("Hello World (" + System.currentTimeMillis() 
                                + ") from HelloProducer.java");

			// sending map message 
			MapMessage mapMessage = session.createMapMessage();
			mapMessage.setObject("msg", "hi from naveen");
			
			
			ObjectMessage objectMessage = session.createObjectMessage();
			objectMessage.setObject(new Emp(101, "Naveen Kumar Srinivas"));

			producer.send(message);
			producer.send(mapMessage);
			producer.send(objectMessage);
			System.out.println("Send from HelloProducer.java");
		
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			
			// close everything
			producer.close();
			session.close();
			connection.close();

		} catch (JMSException ex) {
			System.out.println("Error = " + ex.getMessage());
		}
	}

	public static void main(String args[]) {
		HelloProducer.sendMessage();
	}
}

