package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;

public class ProductController extends Controller {

	public Result saveNewProduct() {
		return ok("Form received");
	}

	public Result formNewProduct() {
		return ok(formNewProduct.render("Product save!"));
	}
}
