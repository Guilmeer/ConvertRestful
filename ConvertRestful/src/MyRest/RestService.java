package MyRest;


import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Response;

@Path("/Conversor")
@ApplicationPath("/resources")
public class RestService extends Application {

	// http://localhost:8080/ConvertRestful/resources/Conversor/mp?Number=3
	//mp == metro polegada
	//pm == polegada metro
	//mpe == metro pé
	//pem == pé metro
	//ppe == polegada pé
	//pep == pé polegada
	
	@GET
	@Path("/sayHello")
	public String getHelloMsg() {
		return "Hello World";
	}
	
	@GET
	@Path("/mp")
	public Response getMetroPolegada (@QueryParam("Number") Float num) {
		Double num2 = num * 39.3701;
		return Response.ok("Seu metro " + num + " transformado a polegadas e: " + num2).build();
	}
	
	@GET
	@Path("/pm")
	public Response getPolegadaMetro (@QueryParam("Number") Float num) {
		Double num2 = num / 39.3701;
		return Response.ok("Sua polegada " + num + " transformado a metros e: " + num2).build();
	}
	
	@GET
	@Path("/mpe")
	public Response getMetroPes (@QueryParam("Number") Float num) {
		Double num2 = num * 3.2808;
		return Response.ok("Seu metro " + num + " transformado a pes e: " + num2).build();
	}
	
	@GET
	@Path("/pem")
	public Response getPesMetro (@QueryParam("Number") Float num) {
		Double num2 = num / 3.2808;
		return Response.ok("Seus pes " + num + " transformados a metros e: " + num2).build();
	}
	
	@GET
	@Path("/ppe")
	public Response getPolegadaPes (@QueryParam("Number") Float num) {
		Double num2 = num * 0.0833;
		return Response.ok("Suas polegadas " + num + " transformadas a pes e: " + num2).build();
	}
	
	@GET
	@Path("/pep")
	public Response getPesPolegada (@QueryParam("Number") Float num) {
		Double num2 = num / 0.0833;
		return Response.ok("Seu metro " + num + " transformado a polegadas e: " + num2).build();
	}
	
}
 