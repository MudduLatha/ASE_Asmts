import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import org.json.JSONException;
import org.json.JSONObject;

@Path("/dtom")
public class daytoMinute {
	@GET
	  @Produces("application/json")
	  public Response convertDtoM() throws JSONException {

		JSONObject jsonObject = new JSONObject();
		Double day = 2.0;
		Double minutes;
		minutes = day*24*60; 
		jsonObject.put("Day Value", day); 
		jsonObject.put("Minutes Value", minutes);

		String result = "@Produces(\"application/json\") Output: \n\nDays to Minutes Converter Output: \n\n" + jsonObject;
		return Response.status(200).entity(result).build();
	  }

	  @Path("{d}")
	  @GET
	  @Produces("application/json")
	  public Response convertDtoMfromInput(@PathParam("d") float d) throws JSONException {

		JSONObject jsonObject = new JSONObject();
		float minutes;
		minutes =  d*24*60; 
		jsonObject.put("D Value", d); 
		jsonObject.put("M Value", minutes);

		String result = "@Produces(\"application/json\") Output: \n\nDays to Minutes Converter Output: \n\n" + jsonObject;
		return Response.status(200).entity(result).build();
	  }
	  
	  public Double convertdtom(Double d)
		{
		  
		  Double minute;
		  minute = d*24*60;
		  return minute;
		}

}
