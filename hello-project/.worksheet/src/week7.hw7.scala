package week7

object hw7 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(71); 
  println("Welcome to the Scala worksheet");$skip(17); 
  
  val c = 'c';System.out.println("""c  : Char = """ + $show(c ));$skip(70); 
  val t =Vector(Vector('S', 'T'), Vector('o', 'c'), Vector('o', 'o'));System.out.println("""t  : scala.collection.immutable.Vector[scala.collection.immutable.Vector[Char]] = """ + $show(t ));$skip(33); 
  val ys = t map ( _ indexOf c );System.out.println("""ys  : scala.collection.immutable.Vector[Int] = """ + $show(ys ));$skip(33); 
  val x = ys indexWhere (_ >= 0);System.out.println("""x  : Int = """ + $show(x ));$skip(8); val res$0 = 
  ys(x);System.out.println("""res0: Int = """ + $show(res$0))}
}
