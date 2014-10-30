package week7

object hw7 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val c = 'c'                                     //> c  : Char = c
  val t =Vector(Vector('S', 'T'), Vector('o', 'c'), Vector('o', 'o'))
                                                  //> t  : scala.collection.immutable.Vector[scala.collection.immutable.Vector[Cha
                                                  //| r]] = Vector(Vector(S, T), Vector(o, c), Vector(o, o))
  val ys = t map ( _ indexOf c )                  //> ys  : scala.collection.immutable.Vector[Int] = Vector(-1, 1, -1)
  val x = ys indexWhere (_ >= 0)                  //> x  : Int = 1
  ys(x)                                           //> res0: Int = 1
}