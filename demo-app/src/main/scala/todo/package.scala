import earlyeffect.dsl.css.Css
import earlyeffect.dsl.css.Styles.DeclarationOrSelector

package object todo {
  val ESCAPE = 27
  val ENTER  = 13

  lazy val AppCss = Css("demo-app")

  def css(name: String)(children: DeclarationOrSelector*): Css#Class =
    AppCss.Class(name, children: _*)

}