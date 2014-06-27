object Solution 
{
  def main(args: Array[String]) 
  {
    val T: Int = Console.readInt()
    var i: Int = 0
    for (i <- 1 to T)
    {
        val first = Console.readLine().split("\\s+").map(Integer.parseInt)
        val K = first(1)
        val a = Console.readLine().split("\\s+").map(Integer.parseInt)
        val by: Map[Int, Array[Int]] = a.groupBy(x => x)
        val result = a.distinct.filter(s => by(s).size >= K).map(_.toString).foldLeft("")((a, b) => a + " " + b)
        println(if (result.isEmpty) "-1" else result.substring(1))
    }
  }
}
