package controllers

import javax.inject.{Singleton, Inject}

import play.api.mvc.{Action, Controller}

import scala.concurrent.Future

/**
  * Created by Alex on 3/10/16.
  */
@Singleton
class Application @Inject extends Controller {

  def welcome = Action.async {
    Future.successful(Ok(views.html.welcome()))
  }

}
