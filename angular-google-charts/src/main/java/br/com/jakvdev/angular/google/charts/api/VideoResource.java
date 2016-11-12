package br.com.jakvdev.angular.google.charts.api;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import br.com.jakvdev.angular.google.charts.dao.VideoDaoImpl;
import br.com.jakvdev.angular.google.charts.model.Video;

@Path("/video")
public class VideoResource {

	@GET
	@Path("/getvideosbycategoryid")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public List<Video> getVideosByCategoryId(
			@QueryParam("categoryId") int categoryId) {
		VideoDaoImpl videoDaoImpl = new VideoDaoImpl();
		return videoDaoImpl.getVideosByCategoryId((long)categoryId);
	}

}
