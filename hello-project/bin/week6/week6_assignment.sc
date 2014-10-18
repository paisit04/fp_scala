package week6

object week6_assignment {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  type Word = String
  type Occurrences = List[(Char, Int)]
  
  def wordOccurrences(w: Word): Occurrences = {
    (w.toLowerCase groupBy identity) map {case (c,cs) => (c, cs.length)} toList
  }                                               //> wordOccurrences: (w: week6.week6_assignment.Word)week6.week6_assignment.Occu
                                                  //| rrences
  
  wordOccurrences("abA")                          //> res0: week6.week6_assignment.Occurrences = List((b,1), (a,2))
  
  
  val ww = "abA"                                  //> ww  : String = abA
  
  for (c <- ww.toLowerCase) yield (c, 1)          //> res1: scala.collection.immutable.IndexedSeq[(Char, Int)] = Vector((a,1), (b,
                                                  //| 1), (a,1))
 
  
  val occ = ((ww.toLowerCase groupBy identity) map {case (c,cs) => (c, cs.length)}).toList.sortBy(_._1)
                                                  //> occ  : List[(Char, Int)] = List((a,2), (b,1))
  
     
 val list = ww.toLowerCase.groupBy(identity).toList.sortBy(_._1).map(_._2)
                                                  //> list  : List[String] = List(aa, b)
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
  }                                               //> combinations: (occurrences: week6.week6_assignment.Occurrences)List[week6.we
                                                  //| ek6_assignment.Occurrences]
  
  combinations(occ)                               //> res2: List[week6.week6_assignment.Occurrences] = List(List(), List((a,1)), L
                                                  //| ist((a,2)), List((b,1)), List((a,1), (b,1)), List((a,2), (b,1)))
}