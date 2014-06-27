package dojo

import scala.scalajs.js
import org.scalajs.dom.HTMLElement

trait DojoComponent extends js.Object {
  def addChild(child: DojoComponent): Unit = ???
  def domNode: HTMLElement = ???
  def on(eventName: String, f: () => Unit) = ???
}
