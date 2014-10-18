package week6

object test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(72); 
  println("Welcome to the Scala worksheet");$skip(27); 
  val xs = Array(1,2,3,44);System.out.println("""xs  : Array[Int] = """ + $show(xs ));$skip(20); val res$0 = 
  xs map (x => x*2);System.out.println("""res0: Array[Int] = """ + $show(res$0));$skip(27); 
  
  val s = "Hello World";System.out.println("""s  : String = """ + $show(s ));$skip(28); val res$1 = 
  s filter (c => c.isUpper);System.out.println("""res1: String = """ + $show(res$1))}
}
