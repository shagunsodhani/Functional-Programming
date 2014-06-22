object Solution extends App {
def f(delim:Int,arr:List[Int]):List[Int] = 
    if (arr.isEmpty) Nil
    else if (arr.head < delim) arr.head::f(delim, arr.tail)
    else f(delim, arr.tail)

var lines = io.Source.stdin.getLines.toList
  println(f(lines(0).toInt,lines.map(_.trim).map(_.toInt)).map(_.toString).mkString("\n"))
}
