package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if (c == 0 || c == r) 1
    else pascal(c - 1, r - 1) + pascal(c, r-1)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def is_balance(chars: List[Char], num_opening: Int): Boolean = {
      if (chars.isEmpty) num_opening == 0
      else if (chars.head == '(' && num_opening >= 0) is_balance(chars.tail, num_opening+1)
      else if (chars.head == ')') is_balance(chars.tail, num_opening-1)
      else is_balance(chars.tail, num_opening)
    }
    is_balance(chars, 0)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    def recurs(money: Int, coins: List[Int], cc: Int): Int = {
      if (money < 0 || coins.isEmpty) cc
      else if (money == 0) cc+1
      else recurs(money, coins.tail, cc) + recurs(money - coins.head, coins, cc)
    }
    recurs(money, coins, 0)
  }
}
