package br.com.jakvdev.angular.google.charts.api;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.jakvdev.angular.google.charts.dao.CategoryDaoImpl;
import br.com.jakvdev.angular.google.charts.model.Category;

@Path("/category")
public class CategoryResource {

	@GET
	@Path("/getallcategories")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Category> getAllCategories() {
		return new CategoryDaoImpl().getAllCategories();
	}

}
