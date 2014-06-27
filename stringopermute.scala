object Solution{

    def main(args: Array[String]) 
    {
       	val z = readInt();
      	var i = 0;
      	while (i < z) 
        {  
            i = i + 1;
            val s = readLine();
            var a = s.toCharArray();
            var j = 0;
            while (j < a.length) 
            {
                val t = a(j);
                a(j) = a(j + 1);
                a(j + 1) = t;
                j = j + 2;
            }
            println( String.copyValueOf(a));
        }
    }
     
}
