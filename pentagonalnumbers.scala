object Solution{
    
    def pentagonal(n:Long) :Long = {
        (3*n*n-n)/2;
    }
    def main(args : Array[String]){
        var T = readInt();
        while(T>0){
            var n = readLong();
            println(pentagonal(n))
            T=T-1;
        }
    }
}
