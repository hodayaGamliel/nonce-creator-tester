package controllers

import play.api._
import play.api.mvc._
import views.html._
import play.twirl.api.Html

object Index extends Controller
{
	def index = Action
	{
		var bodyHtml : Html = body(views.html.indexnew.indexnew(), false, true);
		var headHtml : Html = views.html.indexnew.headnew();
		var readyHtml : Html = ready.indexnew();
		var allHtml : Html = regular("Java Exception Analysis", bodyHtml, headHtml, readyHtml);

		Ok(allHtml);
	}
	
	def space = Action
	{
		Redirect(routes.BlueSite.index)
	}

	/* XXX: Some cookie related work
	* def index = Action { request =>
	  	request.cookies.get("chencookie2").map { a =>
	  	  Ok(regular("Server Debugging Made Easy", null, ready.index())(views.html.index.body(views.html.index.index()))).withCookies(
    		Cookie("chencookie", "blue"))
	  	}.getOrElse	{
	  	  Unauthorized("bye bye")
	  	}
  	}*/
}
