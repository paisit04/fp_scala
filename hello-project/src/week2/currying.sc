package week2

object currying {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  def sum(f: Int => Int): (Int, Int) => Int = {
      def sumF(a: Int, b: Int): Int = {
          if (a>b) 0
          else f(a) + sumF(a+1, b)
      }
      sumF
  }                                               //> sum: (f: Int => Int)(Int, Int) => Int
  def sumCubes = sum(x => x * x* x)               //> sumCubes: => (Int, Int) => Int
  def sumInts = sum(x => x)                       //> sumInts: => (Int, Int) => Int
  
  sumCubes(3,5)                                   //> res0: Int = 216
  sumInts(3,5)                                    //> res1: Int = 12
  
  def cube(x: Int) = x* x * x                     //> cube: (x: Int)Int
  
  sum(cube)(1, 10)                                //> res2: Int = 3025
  
  def sum2(f: Int => Int)(a: Int, b: Int): Int =
    if (a>b) 0 else f(a) + sum(f)(a+1,b)          //> sum2: (f: Int => Int)(a: Int, b: Int)Int
   
  sum2(cube)(1,10)                                //> res3: Int = 3025
}