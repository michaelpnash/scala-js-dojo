package dojo.store

import scala.scalajs.js

import js.Dynamic.{newInstance => jsnew}

case class EditorArgs(store: DataStore, searchAttr: String)

case class Editor(label: String, field: String, editor: js.Any, 
  editorArgs: EditorArgs,
  editOn: String, autoSave: Boolean, width: Int)

trait DataStore extends js.Object

trait JsonRest extends DataStore {
  val target: String = ???
  val idProperty: String = ???
}

object JsonRest {
  def apply(target: String, idProperty: String)(jsonRest: js.Dynamic) = 
    jsnew(jsonRest)(js.Dictionary("target" -> target, "idProperty" -> idProperty)).asInstanceOf[JsonRest]

  val require = "dojo/store/JsonRest"
}
