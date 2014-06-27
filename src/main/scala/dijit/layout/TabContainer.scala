package dijit.layout

import scala.scalajs.js
import js.annotation.JSExport
import js.Dynamic.{global => g, newInstance => jsnew, literal => lit}
import dojo.DojoComponent

trait TabContainer extends DojoComponent {
  val id: String = ???
}

object TabContainer {
  def apply(region: String)(tabContainer: js.Dynamic) = jsnew(tabContainer)(js.Dictionary("region" -> region)).asInstanceOf[TabContainer]
  val require = "layout/TabContainer"
}


