/**
 * @author ry6d3
 *
 */
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import org.json.JSONException;
import org.json.JSONObject;
 
@Path("/ftocservice")
public class FtoCService {
 
	  @GET
	  @Produces("application/json")
	  public Response convertFtoC() throws JSONException {
 
		JSONObject jsonObject = new JSONObject();
		Double day = 2.0;
		Double minutes;
		minutes = day*24*60; 
		jsonObject.put("Day Value", day); 
		jsonObject.put("Minutes Value", minutes);
 
		String result = "@Produces(\"application/json\") Output: \n\nDays to Minutes Converter Output: \n\n" + jsonObject;
		return Response.status(200).entity(result).build();
	  }
 
	  @Path("{f}")
	  @GET
	  @Produces("application/json")
	  public Response convertFtoCfromInput(@PathParam("f") float f) throws JSONException {
 
		JSONObject jsonObject = new JSONObject();
		float minutes;
		minutes =  f*24*60; 
		jsonObject.put("D Value", f); 
		jsonObject.put("M Value", minutes);
 
		String result = "@Produces(\"application/json\") Output: \n\nDays to Minutes Converter Output: \n\n" + jsonObject;
		return Response.status(200).entity(result).build();
	  }
}