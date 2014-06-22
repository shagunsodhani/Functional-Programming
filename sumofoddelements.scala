object Solution extends App {
 
def f(arr:List[Int]):Int = 
    if(arr.isEmpty) 0
    else if (arr.head%2==0) f(arr.tail)
    else arr.head+f(arr.tail)

println(f(io.Source.stdin.getLines.toList.map(_.trim).map(_.toInt)))
}
