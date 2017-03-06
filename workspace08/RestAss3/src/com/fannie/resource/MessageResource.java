package com.fannie.resource;

import java.awt.PageAttributes.MediaType;
import java.util.List;

import javax.xml.ws.Response;

import com.fannie.entity.Message;
import com.fannie.service.MessageService;

@Path("/message")
public class MessageResource {
	
	static MessageService messageService = new MessageService();
	
	//install Advanced Rest Client from chrome through app store
	//open Advanced Rest Client extension
	//chrome-extension://bljmokabgbdkoefbmccaeficehkmlnao/RestClient.html#RequestPlace:default
	
	//http://localhost:8080/DymamicWorks/resources/message/101
	@GET
	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Message getMessage(@PathParam("messageId") long messageId) {
		// Assuming we get the details from the Db

		Message message = messageService.getMessage(messageId);
		return message;
	}
	
	
	//http://localhost:8080/DymamicWorks/resources/message
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMessages() {
		return messageService.getAllMessages();
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Message postMessage(Message message) {
		return messageService.insertMessage(message);
	}
	
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Message updateMessage(Message message) {
		return messageService.updateeMessage(message);
	}

	@DELETE
	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response deleteMessage(@PathParam("messageId") long messageId) 
			throws JSONException {
		String message =   messageService.deleteMessage(messageId);

		JSONObject jsonObject = new JSONObject();
		jsonObject.put("message", message);
		//if you have customer, then jsonObject.put("customer", customer);
		return Response.status(200).entity(jsonObject.toString()).build();
	}
}
