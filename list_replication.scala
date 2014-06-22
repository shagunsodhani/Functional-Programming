object Solution extends App {
def f(num:Int,arr:List[Int]):List[Int] = 
    if (arr.isEmpty) Nil
    else s(num,1,arr)

def s(num:Int, count:Int, arr:List[Int]):List[Int] = 
    if (arr.isEmpty) Nil
    else if (count == num ) arr.head::s(num, 1, arr.tail) 
    else arr.head::s(num, count+1,arr)
def displayResult(arr:List[Int]) = println(f(arr(0).toInt,arr.drop(1)).map(_.toString).mkString("\n"))

  displayResult(io.Source.stdin.getLines.toList.map(_.trim).map(_.toInt))


}
