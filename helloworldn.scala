object Solution extends App {
 def f(n: Int):Any = 
     if(n>0) 
     {
        println("Hello World") 
        f(n-1)
     }
var n = readInt
  f(n)
}
