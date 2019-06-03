
package service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("rest")
public class RestService {
    
    @GET
    @Produces("text/plain")
    public String rest() {
       return "Hello Rest web service (JAX-RS)";
    }
}
