package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {
  
  def hello = Action { implicit request =>
    Ok(views.html.hi("hi there"))
  }
}