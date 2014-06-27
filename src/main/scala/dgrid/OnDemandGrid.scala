package dgrid

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName
import js.Dynamic.{global => g, newInstance => jsnew, literal => lit}
import dojo.DojoComponent
import dojo.store.DataStore
import js.annotation.JSExport

trait OnDemandGrid extends DojoComponent {
  def renderArray(data: js.Object): Any = ???

  def save(): Unit = ???

  def revert(): Unit = ???

  val id: String = ???
}

@JSExport
class GridOptions(val _columns: List[ColumnDef], val _selectionMode: String = "single", 
  val _store: Option[DataStore] = None, val _callNavigation: Boolean = false, val _adjustLastColumn: Boolean = true) {
  @JSExport val columns = _columns
  @JSExport val selectionMode = _selectionMode
  @JSExport val store = _store
  @JSExport val callNavigation = _callNavigation
  @JSExport val adjustLastColumn = _adjustLastColumn
}

object OnDemandGrid {
  def apply(options: GridOptions, id: String)(implicit grid: js.Dynamic) = 
      jsnew(grid)(options.asInstanceOf[js.Any]).asInstanceOf[OnDemandGrid]
  def apply(id: String, columns: List[ColumnDef])(implicit grid: js.Dynamic) =
    jsnew(grid)(js.Dictionary("columns" -> js.Dictionary(
      columns.map(col => (col.fieldName, col.title)): _*)), id).asInstanceOf[OnDemandGrid]
  val require = "dgrid/OnDemandGrid"
}

case class ColumnDef(fieldName: String, title: String)


