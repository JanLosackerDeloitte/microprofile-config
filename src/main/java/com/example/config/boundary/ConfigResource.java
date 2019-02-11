package com.example.config.boundary;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("config")
@RequestScoped
public class ConfigResource {

    @Inject
    @ConfigProperty(name = "service_uri", defaultValue = "http://localhost:8000/goods-receipt")
    String uri;

    @GET
    public Response getGrUri() {
        return Response.ok(uri).build();
    }

}
