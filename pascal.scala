object Solution 
{

  type Table = Array[Array[Int]]

  def printncr(ncr: Table) 
  {
    for (i <- 0 until ncr.length) 
    {
      for (j <- 0 until i) 
      {
        print(ncr(i)(j))
        print(' ')
      }
      println(ncr(i)(i))
    }
  }

  def computeTable(ncr: Table): Table = 
  {
    ncr(0)(0) = 1
    for (i <- 1 until ncr.length) 
    {
      ncr(i)(0) = 1
      for (j <- 1 until i) 
      {
        ncr(i)(j) = ncr(i - 1)(j - 1) + ncr(i - 1)(j)
      }
      ncr(i)(i) = 1
    }
    return ncr
  }

  def createTable(N: Int) = Array.ofDim[Int](N, N)

  def main(args: Array[String]) {
    printncr(computeTable(createTable(readLine().toInt)))
  }
}
