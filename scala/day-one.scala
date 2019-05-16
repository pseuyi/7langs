class TicTacToeChecker(val board: (String, String, String, String, String, String, String, String, String)) {
  val (a, b, c, d, e, f, g, h, i) = board

  def evaluate() {
    checkRows()
  }

  def checkRows(): String = {
    val rows = List(List(a, b, c), List(d, e, f), List(g, h, i))
    rows.foreach(checkStreak)
  }

  def checkStreak(streak: List[String]): String = {
    val winner = streak.forall(v => streak.head == v)
    if(winner) {
      return "winner is " + streak.head
    }
      return "no winner"
  }
}

val xWinner = (
  "x", "x", "x",
  "", "", "o",
  "o", "", "x",
)

val oWinner = (
  "", "o", "",
  "x", "o", "x",
  "", "o", "",
)

val tie = (
  "x", "o", "o",
  "o", "x", "x",
  "o", "x", "o",
)

val noWinner = (
  "", "", "x",
  "", "", "",
  "o", "", "",
)

val myChecker = new TicTacToeChecker(xWinner)
myChecker.evaluate
