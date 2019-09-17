package com.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("hello")
public class Simple {
	@GET
	@Path("world")
	@Produces(MediaType.TEXT_PLAIN)
	public Response simpleTest() {
		return Response.ok().build();
	}
}
