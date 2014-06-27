package dijit.layout

import scala.scalajs.js
import js.Dynamic.{global => g, newInstance => jsnew, literal => lit}
import dojo.DojoComponent

trait BorderContainer extends DojoComponent {
  val id: String = ???
  def startup(): Unit = ???
}

object BorderContainer {
  def apply(id: String)(borderContainer: js.Dynamic) = jsnew(borderContainer)(js.Dictionary(), id).asInstanceOf[BorderContainer]
  val require = "layout/BorderContainer"
}


