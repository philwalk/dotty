object o {
  class A

  class AX {
      def f(): Unit = { }
  }

  import Implicits.*
  val a = new A
  a.f()

  object Implicits {
      implicit def ax(a: A) = new AX
  }
}
