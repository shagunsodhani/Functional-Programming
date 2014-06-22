object Solution extends App {
 
def f(arr:List[Int]):List[Int] = 
      if(arr.isEmpty) Nil
      else if(arr.length < 2) Nil
      else arr.tail.head::f((arr.tail).tail)
println(f(io.Source.stdin.getLines.toList.map(_.trim).map(_.toInt)).mkString("\n"))
}
