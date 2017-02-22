package com.naveen.test;

import static com.jayway.restassured.RestAssured.when;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.is;
import static com.jayway.restassured.RestAssured.given;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.naveen.entity.Message;


/**
 * 
 * @author Naveen Kumar 
 * @See This class is a Junit Class, most rules of what you apply for jUnit holds here.  
 *      in order to execute follow jUnit rules 
 *      Rest assure will help you to write rules with the help of testin framework 
 */


public class MessageTest {

	@BeforeClass
	public static void init(){
		RestAssured.baseURI ="http://localhost:9090/RestSoap1/resources";
	}
	
//	@Ignore
	@Test
	public void makeSureGoogleIsSetup(){
		// notice that there is no assert which we use it in junit 
		given().when().get("http://google.com").then().statusCode(200);
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
		Message message= new Message(115, "harsha", "i like writing");

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
	
	@Ignore
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
		Message message= new Message(114, "Scott", "i like writing");
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
	
	@Ignore
	public void updateMesageTest(){
		/*{
			"messageId": 101
			"msg": "Hello There"
			"author": "Naveen"
			}
		*/
		Message updateMessage = new Message(101, "Hello Here and there and again somewhere", "Naveen Kumar");
		
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
	@Ignore
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
}
