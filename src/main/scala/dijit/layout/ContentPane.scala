package dijit.layout

import scala.scalajs.js
import js.Dynamic.{global => g, newInstance => jsnew, literal => lit}
import dojo.DojoComponent

trait ContentPane extends DojoComponent {
  val id: String = ???
  var region: String = ???
  var selected: Boolean = ???
  var title: String = ???
  def startup(): Unit = ???
  def refresh(): Unit = ???
  def resize(): Unit = ???
}

object ContentPane {
  def apply(id: String)(implicit contentPane: js.Dynamic) = jsnew(contentPane)(js.Dictionary("id" -> id)).asInstanceOf[ContentPane]
  val require = "layout/ContentPane"
}


