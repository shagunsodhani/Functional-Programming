object Solution {
def f(x: Float):Float=
  {   
        def fact(n:Float):Float = 
            if (n==1) 1
            else n*fact(n-1)
        def pow (x:Float, n:Float):Float= 
            if(n==0) 1
            else x*pow(x,n-1)
        def cal(x:Float, n:Float):Float = 
            if(n==0) 1
            else pow(x,n)/fact(n) + cal(x, n-1)

        cal(x,9)
       // Compute and Return the value of e^x 
  }

def main(args: Array[String]) {
       var n = readInt
       (1 to n) foreach(x=> println(f(readFloat())))
    }
}
