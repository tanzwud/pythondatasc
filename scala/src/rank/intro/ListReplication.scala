package rank.intro

object ListReplication extends App {

  def f(num:Int,arr:List[Int]):List[Int] = arr.flatMap(x => List.fill(num)(x))

  def displayResult(arr:List[Int]) = println(f(arr(0).toInt,arr.drop(1)).map(_.toString).mkString("\n"))

  displayResult(io.Source.stdin.getLines.toList.map(_.trim).map(_.toInt))

}
