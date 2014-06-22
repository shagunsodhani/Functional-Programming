object Solution extends App {
 
def f(arr:List[Int]):Int =
    if (arr.isEmpty) 0
    else 1+f(arr.tail)
println(f(io.Source.stdin.getLines.toList.map(_.trim).map(_.toInt)))
}
