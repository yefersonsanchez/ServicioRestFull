/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.rest.servicio;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author yefer
 */
@Path("/convertidor")
public class Servicio {

    @POST
    @Path("/process")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_XML})
    public String process(String s) {
        org.json.JSONObject jsonFileObject = new org.json.JSONObject(s);
        String xml = "<?xml version=\"1.0\" encoding=\"ISO-8859-15\"?>"
                + org.json.XML.toString(jsonFileObject);
        return xml;
    }

}
