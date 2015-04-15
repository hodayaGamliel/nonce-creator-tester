package controllers

import play.api._
import play.api.mvc._
import views.html._
import play.twirl.api.Html

object Features extends Controller 
{
	def main = Action 
	{
		var bodyHtml : Html = body(pages.features())
		var headHtml : Html = head.features()
		var readyHtml : Html = ready.features()
		var allHtml : Html = regular("Features", bodyHtml, headHtml, readyHtml)

		Ok(allHtml)
	}

	def security = Action
	{
		Redirect(routes.BlueSite.security)
	}

	def performance = Action 
	{
		Redirect(routes.BlueSite.product)
	}

	def redirect(link: String) = Action 
	{ request =>
		Redirect(routes.BlueSite.product)
	}
}
