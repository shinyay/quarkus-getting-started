package com.google.shinyay

import java.time.ZoneId
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/hello")
class HelloQuarkusApp {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    fun hello(): String {
        val jstDateTime = ZonedDateTime.now(ZoneId.of("Japan"))
        val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
        return "Hello Quarkus at ${jstDateTime.format(formatter)}"
    }
}