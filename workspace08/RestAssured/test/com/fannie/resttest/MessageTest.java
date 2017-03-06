package com.fannie.resttest;

import static com.jayway.restassured.RestAssured.given;
import static com.jayway.restassured.RestAssured.when;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.is;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.fannie.bean.Message;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;

public class MessageTest {

	

	@Ignore
	public void googleTest(){
		given().when().get("http://google.com").then().statusCode(200);
	}
	
	@BeforeClass
	public static void init(){
		RestAssured.baseURI ="http://localhost:8080/DymamicWorks/resources";
	}
	
	
	/**
	 * @see This test case will fail whn you have an entry in the rest service, as it is expecting empty
	 */
	@Test
	public void getMessagesTest(){
		
		when()
			.get("/message")
		.then()
			.statusCode(200)
			.body("", is(empty()));
	}
	
	@Test 
	public void postMessageSimpleTest(){	
		// version 1.0 for testing only the posting of the job 
		/*
		 * {
			"messageId": 101
			"msg": "Hello There"
			"author": "Naveen"
			}
		 */
		Message message= new Message(115, "i like reading but not reading","James", "1/23/2103");

		given()
		.contentType(ContentType.JSON)
		.body(message)
	.when()
		.post("/message")
	.then()
		.statusCode(200)
		.body("messageId", is(message.getMessageId()))
		.body("msg", is(message.getMsg()))
		.body("author", is(message.getAuthor()));
		
	}
	
	@Test
	public void postMessageCompleteTest(){
		// Sample data model 
		/*
		 * {
			"messageId": 101
			"msg": "Hello There"
			"author": "Naveen"
			}
		 */
	
		
		// version 2.0, this is the complete test case for testing and validating 
		Message message= new Message(114, "Scott", "i like writing", "1/23/2103");
		Integer messageId = 
		given()
			.contentType(ContentType.JSON)
			.body(message)
		.when()
			.post("/message")
		.then()
			.statusCode(200)
			.body("messageId", is(message.getMessageId()))
			.body("msg", is(message.getMsg()))
			.body("author", is(message.getAuthor()))
		.extract()
			.path("messageId");
		
		given()
			.pathParam("messageId", messageId)
		.when()
			.get("/message/{messageId}")
		.then()
			.statusCode(200)
			.body("messageId", is(message.getMessageId()))
			.body("msg", is(message.getMsg()))
			.body("author", is(message.getAuthor()));
		
	}
	
	@Test
	public void updateMesageTest(){
		/*{
			"messageId": 101
			"msg": "Hello There"
			"author": "Naveen"
			}
		*/
		Message updateMessage = new Message(101,"Hello Here and there and again somewhere", "Alex",   "3/12/2090");
		
		given()
			.contentType(ContentType.JSON)
			.body(updateMessage)
		.when()
			.put("/message")
		.then()
			.statusCode(200)
			.body("msg", is(updateMessage.getMsg()))
			.body("author", is(updateMessage.getAuthor()));
		
	}

	// @Test
	@Test
	public void deleteMessageTest(){
		// msg received from the rest 
		// "Message Deleted "+ messageId;
		// delete method takes only 1 path param 
		int messageId  = 102;
		given()
			.pathParam("messageId", messageId)
		.when()
			.delete("/message/{messageId}")
		.then()
			.statusCode(200)
			.body("message", is("Message Deleted "+messageId));
	}
	
	
	@Test 
	public void postMessageAssTest(){	
		// version 1.0 for testing only the posting of the job 
		/*
		 * {
			"messageId": 101
			"msg": "Hello There"
			"author": "Naveen"
			}
		 */
		Message message= new Message(101, "Its beautiful day outside, how is your day","James",  "23-FEB-2017");

		given()
		.contentType(ContentType.JSON)
		.body(message)
	.when()
		.post("/message")
	.then()
		.statusCode(200)
		.body("messageId", is(message.getMessageId()))
		.body("msg", is(message.getMsg()))
		.body("author", is(message.getAuthor()));
		
	}
	
	@Test
	public void updateMesageAssTest(){
		Message updateMessage = new Message(102, "Hello Here and there and again somewhere", "James", "2/23/2090");
		
		given()
			.contentType(ContentType.JSON)
			.body(updateMessage)
		.when()
			.put("/message")
		.then()
			.statusCode(200)
			.body("msg", is(updateMessage.getMsg()))
			.body("author", is(updateMessage.getAuthor()));
		
	}
	
	@Test
	public void getMessagesAssTest(){
		Message getMessage = new Message(102, "Hello Here and there and again somewhere", "James", "2/23/2090");
		when()
			.get("/message/102")
		.then()
			.statusCode(200)
			.body("msg", is(getMessage.getMsg()));
	}
}
