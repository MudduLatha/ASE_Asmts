
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/gtop")

public class GramtoPound {
	
	@GET
	@Produces("application/xml")
	public String convertGtoP() {
 
		Double pound;
		Double gram = 1000.0;
		pound = gram * 0.0022046;
 
		String result = "@Produces(\"application/xml\") Output: \n\nGram to Pound Converter Output: \n\n" + pound;
		return "<gtopservice>" + "<gram>" + gram + "</gram>" + "<gtopoutput>" + result + "</gtopoutput>" + "</gtopservice>";
	}
 
	@Path("{g}")
	@GET
	@Produces("application/xml")
	public String convertGtoPfromInput(@PathParam("g") Double g) {
		Double pound;
		Double gram = g;
		pound = gram * 0.0022046;;
 
		String result = "@Produces(\"application/xml\") Output: \n\nG to P Converter Output: \n\n" + pound;
		return "<gtopservice>" + "<gram>" + gram + "</gram>" + "<gtopoutput>" + result + "</gtopoutput>" + "</gtopservice>";
	}
	
	public Double convertgtop(Double g)
	{
	  
	  Double pound;
	  pound = g*0.0022046;
	  return pound;
	}
}
