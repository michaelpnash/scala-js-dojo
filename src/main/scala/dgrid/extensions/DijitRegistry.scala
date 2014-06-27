package dgrid.extensions

import scala.scalajs.js

trait DijitRegistry extends js.Object {

  def startup(): Unit = ???

  def buildRendering(): Unit = ???

  def destroyRecursive(): Unit = ???

  def destroy(): Unit = ???

  def getChildren(): js.Any = ???

  def isLeftToRight(): js.Any = ???

  def resize(): Unit = ???

  def getParent(): js.Any = ???
}

object DijitRegistry {
  val require = "dgrid/extensions/DijitRegistry"
}
