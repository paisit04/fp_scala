package week2

object exercises {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(77); 
  println("Welcome to the Scala worksheet");$skip(106); 
  
  def product2(f: Int => Int)(a: Int, b: Int): Int =
    if (a>b) 1
    else f(a) * product2(f)(a+1,b);System.out.println("""product2: (f: Int => Int)(a: Int, b: Int)Int""");$skip(174); 
  
  def mapReduce(f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int): Int =
    if (a>b) zero
    else combine(f(a), mapReduce(f, combine, zero)(a+1, b));System.out.println("""mapReduce: (f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int)Int""");$skip(88); 
  def product(f: Int => Int)(a: Int, b: Int): Int = mapReduce(f, (x, y) => x*y, 1)(a,b);System.out.println("""product: (f: Int => Int)(a: Int, b: Int)Int""");$skip(28); val res$0 = 
  
  product(x => x*x)(3,4);System.out.println("""res0: Int = """ + $show(res$0));$skip(43); 
  
  def fact(x: Int) = product(x=>x)(1,x);System.out.println("""fact: (x: Int)Int""");$skip(13); val res$1 = 
  
  fact(5);System.out.println("""res1: Int = """ + $show(res$1))}
  

 
}
