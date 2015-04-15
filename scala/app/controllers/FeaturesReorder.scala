package controllers

import play.api._
import play.api.mvc._
import views.html._
import play.twirl.api.Html

object FeaturesReorder extends Controller 
{
	def main = Action 
	{
		var bodyHtml : Html = body(pages.featuresreorder())
		var headHtml : Html = head.features()
		var readyHtml : Html = ready.features()
		var allHtml : Html = regular("Features - Reordered", bodyHtml, headHtml, readyHtml)

		Ok(allHtml)
	}
	
	def performance = Action 
	{
		Redirect("/features-reorder#performance")
	}

	def redirect(link: String) = Action 
	{ request =>
		Redirect(routes.FeaturesReorder.main)
	}
}
