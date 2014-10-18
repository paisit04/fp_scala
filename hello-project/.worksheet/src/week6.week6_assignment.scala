package week6

object week6_assignment {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(84); 
  println("Welcome to the Scala worksheet")
  
  type Word = String
  type Occurrences = List[(Char, Int)];$skip(198); 
  
  def wordOccurrences(w: Word): Occurrences = {
    (w.toLowerCase groupBy identity) map {case (c,cs) => (c, cs.length)} toList
  };System.out.println("""wordOccurrences: (w: week6.week6_assignment.Word)week6.week6_assignment.Occurrences""");$skip(28); val res$0 = 
  
  wordOccurrences("abA");System.out.println("""res0: week6.week6_assignment.Occurrences = """ + $show(res$0));$skip(23); 
  
  
  val ww = "abA";System.out.println("""ww  : String = """ + $show(ww ));$skip(44); val res$1 = 
  
  for (c <- ww.toLowerCase) yield (c, 1);System.out.println("""res1: scala.collection.immutable.IndexedSeq[(Char, Int)] = """ + $show(res$1));$skip(109); 
 
  
  val occ = ((ww.toLowerCase groupBy identity) map {case (c,cs) => (c, cs.length)}).toList.sortBy(_._1);System.out.println("""occ  : List[(Char, Int)] = """ + $show(occ ));$skip(84); 
  
     
 val list = ww.toLowerCase.groupBy(identity).toList.sortBy(_._1).map(_._2);System.out.println("""list  : List[String] = """ + $show(list ));$skip(316); 
  def combinations(occurrences: Occurrences): List[Occurrences] = occurrences match {
    case List() => List[Occurrences](List())
    case (c,n) :: oc => {
      for {
        rs <- combinations(oc)
        i <- 0 to n
      } yield {
        if (i==0) rs
        else (rs :+ (c,i))
      } sortBy (_._1)
    }
  };System.out.println("""combinations: (occurrences: week6.week6_assignment.Occurrences)List[week6.week6_assignment.Occurrences]""");$skip(23); val res$2 = 
  
  combinations(occ);System.out.println("""res2: List[week6.week6_assignment.Occurrences] = """ + $show(res$2))}
}
