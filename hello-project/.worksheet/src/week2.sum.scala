package week2

object sum {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(71); 
  println("Welcome to the Scala worksheet");$skip(180); 
  
  def sum(f: Int => Int, a: Int, b: Int): Int = {
      def loop(a: Int, acc: Int): Int = {
        if (a>b) acc
        else loop(a+1, f(a) + acc)
      }
      loop(a, 0)
  };System.out.println("""sum: (f: Int => Int, a: Int, b: Int)Int""");$skip(27); val res$0 = 
  
  sum(x => x * x, 3, 5);System.out.println("""res0: Int = """ + $show(res$0));$skip(28); val res$1 = 
  sum(x => x * x * x, 3, 5);System.out.println("""res1: Int = """ + $show(res$1))}
}
