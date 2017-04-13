package com.gamma4.base.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Path("/serv")
//@Produces(MediaType.APPLICATION_JSON)
public class DemoResource {

    @GET
    public String sayHi() {
        log.info("BASE : registration of services is a success");
        return "Saying Hi [TEST SERVICE]";
    }
}
