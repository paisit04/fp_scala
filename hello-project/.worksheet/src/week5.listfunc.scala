package week5

object listfunc {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(66); 
  val nums = List(2, -4, 5, 7, 1);System.out.println("""nums  : List[Int] = """ + $show(nums ));$skip(62); 
  val fruits = List("apple", "pineapple", "orange", "banana");System.out.println("""fruits  : List[String] = """ + $show(fruits ));$skip(24); val res$0 = 
  nums filter (x=> x>0);System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(27); val res$1 = 
  nums filterNot (x=> x>0);System.out.println("""res1: List[Int] = """ + $show(res$1));$skip(27); val res$2 = 
  nums partition (x=> x>0);System.out.println("""res2: (List[Int], List[Int]) = """ + $show(res$2));$skip(33); val res$3 = 
  
  
  nums takeWhile (x=> x>0);System.out.println("""res3: List[Int] = """ + $show(res$3));$skip(27); val res$4 = 
  nums dropWhile (x=> x>0);System.out.println("""res4: List[Int] = """ + $show(res$4));$skip(22); val res$5 = 
  nums span (x=> x>0);System.out.println("""res5: (List[Int], List[Int]) = """ + $show(res$5));$skip(55); 

   val data = List("a", "a", "a", "b", "c", "c", "a");System.out.println("""data  : List[String] = """ + $show(data ));$skip(177); 
   def pack[T](xs: List[T]):List[List[T]] = xs match {
     case Nil => Nil
     case x :: xs1 =>
       val (first, rest) = xs span (y => y == x)
       first::pack(rest)
   };System.out.println("""pack: [T](xs: List[T])List[List[T]]""");$skip(14); val res$6 = 
   pack(data);System.out.println("""res6: List[List[String]] = """ + $show(res$6));$skip(96); 
 
   def encode[T](xs: List[T]):List[(T, Int)] =
     pack(xs) map (ys => (ys.head, ys.length));System.out.println("""encode: [T](xs: List[T])List[(T, Int)]""");$skip(18); val res$7 = 
 
   encode(data);System.out.println("""res7: List[(String, Int)] = """ + $show(res$7))}
}
