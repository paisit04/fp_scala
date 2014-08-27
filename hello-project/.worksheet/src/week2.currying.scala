package week2

object currying {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(76); 
  println("Welcome to the Scala worksheet");$skip(167); 
  def sum(f: Int => Int): (Int, Int) => Int = {
      def sumF(a: Int, b: Int): Int = {
          if (a>b) 0
          else f(a) + sumF(a+1, b)
      }
      sumF
  };System.out.println("""sum: (f: Int => Int)(Int, Int) => Int""");$skip(36); 
  def sumCubes = sum(x => x * x* x);System.out.println("""sumCubes: => (Int, Int) => Int""");$skip(28); 
  def sumInts = sum(x => x);System.out.println("""sumInts: => (Int, Int) => Int""");$skip(19); val res$0 = 
  
  sumCubes(3,5);System.out.println("""res0: Int = """ + $show(res$0));$skip(15); val res$1 = 
  sumInts(3,5);System.out.println("""res1: Int = """ + $show(res$1));$skip(33); 
  
  def cube(x: Int) = x* x * x;System.out.println("""cube: (x: Int)Int""");$skip(22); val res$2 = 
  
  sum(cube)(1, 10);System.out.println("""res2: Int = """ + $show(res$2));$skip(93); 
  
  def sum2(f: Int => Int)(a: Int, b: Int): Int =
    if (a>b) 0 else f(a) + sum(f)(a+1,b);System.out.println("""sum2: (f: Int => Int)(a: Int, b: Int)Int""");$skip(23); val res$3 = 
   
  sum2(cube)(1,10);System.out.println("""res3: Int = """ + $show(res$3))}
}
