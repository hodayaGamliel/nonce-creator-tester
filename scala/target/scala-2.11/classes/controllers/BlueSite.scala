package controllers

import play.api._
import play.api.cache.Cached
import play.api.mvc._
import play.api.Play.current
import scala.util.Random
import views.html._
import play.twirl.api.Html

object BlueSite extends Controller 
{
	def index = Action 
	{
		var bodyHtml : Html = bluesite.body(bluesite.pages.index(), true)
		var headHtml : Html = bluesite.head()
		var readyHtml : Html = bluesite.ready()
		var allHtml : Html = regular("Detect and fix production errors", bodyHtml, headHtml, readyHtml)

		Ok(allHtml)
	}
	
    def features = Action
    {
        Redirect(routes.BlueSite.product.toString, 301)
    }
    
	def product = Action 
	{
		var bodyHtml : Html = bluesite.body(bluesite.pages.product())
		var headHtml : Html = bluesite.head()
		var readyHtml : Html = bluesite.ready()
		var allHtml : Html = regular("Product", bodyHtml, headHtml, readyHtml)

		Ok(allHtml)
	}
	
	def security = Action 
	{
		var bodyHtml : Html = bluesite.body(bluesite.pages.security())
		var headHtml : Html = bluesite.head()
		var readyHtml : Html = bluesite.ready()
		var allHtml : Html = regular("Security", bodyHtml, headHtml, readyHtml)

		Ok(allHtml)
	}
	
	def howitworks = Action 
	{
		var bodyHtml : Html = bluesite.body(bluesite.pages.howitworks(), false , true)
		var headHtml : Html = bluesite.head()
		var readyHtml : Html = bluesite.ready()
		var allHtml : Html = regular("How it works", bodyHtml, headHtml, readyHtml)

		Ok(allHtml)
	}
	
	def whytakipi = Action 
	{
		var bodyHtml : Html = bluesite.body(bluesite.pages.whytakipi())
		var headHtml : Html = bluesite.head()
		var readyHtml : Html = bluesite.ready()
		var allHtml : Html = regular("Why Takipi", bodyHtml, headHtml, readyHtml)

		Ok(allHtml)
	}
	
	def pricing = Action 
	{
		var bodyHtml : Html = bluesite.body(bluesite.pages.pricing(), true)
		var headHtml : Html = bluesite.head()
		var readyHtml : Html = bluesite.ready()
		var allHtml : Html = regular("Pricing", bodyHtml, headHtml, readyHtml)

		Ok(allHtml)
	}
	
	def scala = Action 
	{
		var bodyHtml : Html = bluesite.body(bluesite.pages.scala(), true)
		var headHtml : Html = bluesite.head()
		var readyHtml : Html = bluesite.ready()
		var allHtml : Html = regular("Scala", bodyHtml, headHtml, readyHtml)

		Ok(allHtml)
	}
    
	def debug_less = Action
    {
		var bodyHtml : Html = bluesite.body(bluesite.pages.debug_less(), true, isLandingPage = true)
		var headHtml : Html = bluesite.head()
		var readyHtml : Html = bluesite.ready()
		var allHtml : Html = regular("Debug Less", bodyHtml, headHtml, readyHtml)

		Ok(allHtml)
    }
    
	def beautiful_exceptions = Action
    {
		var bodyHtml : Html = bluesite.body(bluesite.pages.beautiful_exceptions(), true, isLandingPage = true)
		var headHtml : Html = bluesite.head()
		var readyHtml : Html = bluesite.ready()
		var allHtml : Html = regular("Beautiful Exceptions", bodyHtml, headHtml, readyHtml)

		Ok(allHtml)
    }

	def schedule_demo = Action
    {
		var bodyHtml : Html = bluesite.body(bluesite.pages.schedule_demo(), true, isLandingPage = true)
		var headHtml : Html = bluesite.head()
		var readyHtml : Html = bluesite.ready()
		var allHtml : Html = regular("Schedule a demo", bodyHtml, headHtml, readyHtml)

		Ok(allHtml)
    }
    
	def for_enterprises = Action
    {
		var bodyHtml : Html = bluesite.body(bluesite.pages.for_enterprises(), true, isLandingPage = true)
		var headHtml : Html = bluesite.head()
		var readyHtml : Html = bluesite.ready()
		var allHtml : Html = regular("Takipi for Enterprises", bodyHtml, headHtml, readyHtml)
		
		Ok(allHtml)
	}
	
	def spark = Action
    {
		var bodyHtml : Html = bluesite.body(bluesite.pages.spark(), true, isLandingPage = true)
		var headHtml : Html = bluesite.head()
		var readyHtml : Html = bluesite.ready()
		var allHtml : Html = regular("Takipi for Spark", bodyHtml, headHtml, readyHtml)

		Ok(allHtml)
    }
	
	def no_log_management = Action
    {
		var bodyHtml : Html = bluesite.body(bluesite.pages.no_log_management(), true, isLandingPage = true)
		var headHtml : Html = bluesite.head()
		var readyHtml : Html = bluesite.ready()
		var allHtml : Html = regular("No log management", bodyHtml, headHtml, readyHtml)

		Ok(allHtml)
    }
}
