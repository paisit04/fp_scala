package week2

object exercises {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  def product2(f: Int => Int)(a: Int, b: Int): Int =
    if (a>b) 1
    else f(a) * product2(f)(a+1,b)                //> product2: (f: Int => Int)(a: Int, b: Int)Int
  
  def mapReduce(f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int): Int =
    if (a>b) zero
    else combine(f(a), mapReduce(f, combine, zero)(a+1, b))
                                                  //> mapReduce: (f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b:
                                                  //|  Int)Int
  def product(f: Int => Int)(a: Int, b: Int): Int = mapReduce(f, (x, y) => x*y, 1)(a,b)
                                                  //> product: (f: Int => Int)(a: Int, b: Int)Int
  
  product(x => x*x)(3,4)                          //> res0: Int = 144
  
  def fact(x: Int) = product(x=>x)(1,x)           //> fact: (x: Int)Int
  
  fact(5)                                         //> res1: Int = 120
  

 
}