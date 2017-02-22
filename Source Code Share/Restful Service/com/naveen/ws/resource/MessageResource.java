package com.naveen.ws.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.json.JSONException;
import org.json.JSONObject;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.naveen.ws.entity.Message;
import com.naveen.ws.service.MessageService;

@Path("/message")
public class MessageResource {
	// which will take 1 param and return the object of
	// message

	static MessageService messageService = new MessageService();

	/*
	 * if you want to take multiple parameters public Message getMessage(
	 * 
	 * @PathParam("messageId") long messageId,
	 * 
	 * @PathParam("another") String anotherMessage ){
	 */
	// @Produces("application/json")
	// or

	// http://localhost:8080/app/resources/message/1/author
	@GET
	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Message getMessage(@PathParam("messageId") long messageId, @Context UriInfo uriInfo) {
		// Assuming we get the details from the Db

		Message message = messageService.getMessage(messageId);
		return message;
	}

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
		return Response.status(200).entity(jsonObject.toString()).build();
	}
}
