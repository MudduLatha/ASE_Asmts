/**
 * @author ry6d3
 *
 */
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
 
@Path("/ctofservice")
public class CtoFService {
	@GET
	@Produces("application/xml")
	public String convertCtoF() {
 
		Double pound;
		Double gram = 1000.0;
		pound = gram * 0.0022046;
 
		String result = "@Produces(\"application/xml\") Output: \n\nGram to Pound Converter Output: \n\n" + pound;
		return "<gtopservice>" + "<gram>" + gram + "</gram>" + "<gtopoutput>" + result + "</gtopoutput>" + "</gtopservice>";
	}
 
	@Path("{c}")
	@GET
	@Produces("application/xml")
	public String convertCtoFfromInput(@PathParam("c") Double c) {
		Double pound;
		Double gram = c;
		pound = gram * 0.0022046;;
 
		String result = "@Produces(\"application/xml\") Output: \n\nG to P Converter Output: \n\n" + pound;
		return "<gtopservice>" + "<gram>" + gram + "</gram>" + "<gtopoutput>" + result + "</gtopoutput>" + "</gtopservice>";
	}
}