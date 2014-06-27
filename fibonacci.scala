object Solution{
    
    var mod : Int = 100000007;
    def main(args : Array[String]){
        var z:Array[Int] = new Array[Int](10001);
        z(0) = 0;
        z(1) = 1;
        var t = readInt();
        var size = 2;
        while(size < 10001){
            z(size) = ( z(size-1)+z(size-2 ) ) % mod;
            size=size+1;
        }
        while(t>0){
            var n: Int = readShort();
            println(z(n))
            t=t-1;
        }
    }
        
}
