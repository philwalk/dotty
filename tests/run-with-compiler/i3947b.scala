
import scala.quoted._
import dotty.tools.dotc.quoted.Toolbox._

object Test {

  def main(args: Array[String]): Unit = {

    def test[T](clazz: java.lang.Class[T]): Unit = {
      val lclazz = clazz.toExpr
      val name = '{ (~lclazz).getCanonicalName }
      println()
      println(name.show)
      println(name.run)
    }

    // primitives
    test(classOf[Boolean])
    test(classOf[Byte])
    test(classOf[Char])
    test(classOf[Short])
    test(classOf[Int])
    test(classOf[Long])
    test(classOf[Float])
    test(classOf[Double])
    test(classOf[Unit])
  }

}
