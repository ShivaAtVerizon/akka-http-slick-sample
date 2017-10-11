package routes

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import data.model.JsonProtocol
import data.persistence.UserRepository

import scala.concurrent.ExecutionContext

class TestRoutes(repo: UserRepository)(implicit ex: ExecutionContext) extends JsonProtocol {

  val routes: Route = get {
    complete(repo.getAll)
  }
}