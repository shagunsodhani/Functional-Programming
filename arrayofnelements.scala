object Solution extends App {
def f(num:Int) : List[Int] = 
    if (num == 0) Nil
    else num::f(num-1)

println(f(readInt).length)
}
